package khanhnguyen.edu.thuchanhchuyenmanhinhintents;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button btnMH2 = findViewById(R.id.btnMH2);
        btnMH2.setOnClickListener(ChuyenSangMH1);

        Intent thuNhanDuoc = getIntent();
        String ten = thuNhanDuoc.getStringExtra("MH1_guiThemTen");
        String tuoi = thuNhanDuoc.getStringExtra("MH1_guiThemTuoi");

        TextView tvTen = findViewById(R.id.tvHoTen);
        TextView tvTuoi = findViewById(R.id.tvTuoi);

        tvTen.setText(ten);
        tvTuoi.setText(tuoi);
    }

    View.OnClickListener ChuyenSangMH1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent thuKichHoatMH1 = new Intent(MainActivity2.this,MainActivity.class);
            startActivity(thuKichHoatMH1);
        }
    };
}
