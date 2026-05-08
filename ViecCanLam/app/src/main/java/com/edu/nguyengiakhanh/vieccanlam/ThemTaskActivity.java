package com.edu.nguyengiakhanh.vieccanlam;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class ThemTaskActivity extends AppCompatActivity {
    EditText editName, editMessage, editPrior, editDate;
    FloatingActionButton btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_them_task);

        editName = findViewById(R.id.editTextTenCV);
        editMessage = findViewById(R.id.editTextMessage);
        editPrior = findViewById(R.id.editTextPrior);
        editDate = findViewById(R.id.editTextDate);
        btnSave = findViewById(R.id.floatingActionButton);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editName.getText().toString();
                String message = editMessage.getText().toString();
                String prior = editPrior.getText().toString();
                String date = editDate.getText().toString();

                TASKS task = new TASKS(name, date, message, prior);

                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference reference = database.getReference("TASKS");

                String key = reference.push().getKey();
                HashMap<String, Object> item = new HashMap<String, Object>();
                item.put(key, task.toFirebaseObject());
                reference.updateChildren(item, new DatabaseReference.CompletionListener() {
                    @Override
                    public void onComplete(@Nullable DatabaseError error, @NonNull DatabaseReference ref) {
                        Toast.makeText(ThemTaskActivity.this, "Đã thêm công việc thành công", Toast.LENGTH_SHORT).show();
                        finish();
                        if (error == null) finish();
                    }
                });

            }
        });
    }
}
