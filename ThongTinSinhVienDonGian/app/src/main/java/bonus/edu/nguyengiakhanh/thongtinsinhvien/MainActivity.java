package bonus.edu.nguyengiakhanh.thongtinsinhvien;

import static android.content.ContentValues.TAG;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        FirebaseFirestore db = FirebaseFirestore.getInstance();


        EditText editTextName = findViewById(R.id.editTextName);
        EditText editTextClass = findViewById(R.id.editTextClass);
        EditText editTextSex = findViewById(R.id.editTextSex);
        EditText editTextMajor = findViewById(R.id.editTextMajor);
        EditText editTextHobby = findViewById(R.id.editTextHobby);
        Button buttonSend = findViewById(R.id.buttonSend);

        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = editTextName.getText().toString();
                String className = editTextClass.getText().toString();
                String sex = editTextSex.getText().toString();
                String major = editTextMajor.getText().toString();
                String hobby = editTextHobby.getText().toString();

                Map<String, Object> student = new HashMap<>();
                student.put("name", name);
                student.put("class", className);
                student.put("sex", sex);
                student.put("major", major);
                student.put("hobby", hobby);

                db.collection("students")
                        .add(student)
                        .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                            @Override
                            public void onSuccess(DocumentReference documentReference) {
                                Toast.makeText(MainActivity.this, "Gửi thành công!", Toast.LENGTH_SHORT).show();
                                editTextName.setText("");
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Log.e(TAG, "Lỗi gửi Firestore", e);
                                Toast.makeText(MainActivity.this, "Lỗi: " + e.getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        });
            }
        });
    }
}