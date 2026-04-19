package khanhnguyen.edu.thuchanhchuyenmanhinhintents;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void ChuyenSangMH2(View v){
        //Tao doi tuong intent
        Intent KichHoatMH2 = new Intent(MainActivity.this, MainActivity2.class);

        EditText edtTen = findViewById(R.id.edtTenMH1);
        EditText edtTuoi = findViewById(R.id.edtTuoiMH1);
        String strTen = edtTen.getText().toString();
        String strTuoi = edtTuoi.getText().toString();
        KichHoatMH2.putExtra("MH1_guiThemTen",strTen);
        KichHoatMH2.putExtra("MH1_guiThemTuoi",strTuoi);
        //Gui thu ma khong doi phan hoi
        startActivity(KichHoatMH2);
    }
}