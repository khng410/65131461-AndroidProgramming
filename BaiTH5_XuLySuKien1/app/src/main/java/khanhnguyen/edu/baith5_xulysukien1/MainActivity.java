package khanhnguyen.edu.baith5_xulysukien1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    //Khai bao cac doi tuong gan voi dieu khien tuong ung
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;
    Button nutCong, nutTru, nutNhan, nutChia;

    void TimDieuKhien() {
        editTextSo1 = (EditText) findViewById(R.id.edtSo1);
        editTextSo2 = (EditText) findViewById(R.id.edtSo2);
        editTextKQ = (EditText) findViewById(R.id.edtKQ);
        nutCong = (Button) findViewById(R.id.btnCong);
        nutTru = (Button) findViewById(R.id.btnTru);
        nutNhan = (Button) findViewById(R.id.btnNhan);
        nutChia = (Button) findViewById(R.id.btnChia);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
        View.OnClickListener boLangNgheCong = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Goi ham xu li cong
                XULYCONG();

            }
        };
        nutCong.setOnClickListener(boLangNgheCong);
        nutTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XULYTRU();

            }
        });
        nutNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XULYNHAN();

            }
        });
        nutChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XULYCHIA();

            }
        });
    }

    void XULYCONG(){
        String so1 = editTextSo1.getText().toString();
        String so2 = editTextSo2.getText().toString();
        float num1 = Float.parseFloat(so1);
        float num2 = Float.parseFloat(so2);
        float tong = num1 + num2;
        String chuoiKQ = String.valueOf(tong);
        editTextKQ.setText(chuoiKQ);
    }
    void XULYTRU(){
        String so1 = editTextSo1.getText().toString();
        String so2 = editTextSo2.getText().toString();
        float num1 = Float.parseFloat(so1);
        float num2 = Float.parseFloat(so2);
        float hieu = num1 - num2;
        String chuoiKQ = String.valueOf(hieu);
        editTextKQ.setText(chuoiKQ);
    }
    void XULYNHAN(){
        String so1 = editTextSo1.getText().toString();
        String so2 = editTextSo2.getText().toString();
        float num1 = Float.parseFloat(so1);
        float num2 = Float.parseFloat(so2);
        float tich = num1 * num2;
        String chuoiKQ = String.valueOf(tich);
        editTextKQ.setText(chuoiKQ);
    }
    void XULYCHIA(){
        String so1 = editTextSo1.getText().toString();
        String so2 = editTextSo2.getText().toString();
        float num1 = Float.parseFloat(so1);
        float num2 = Float.parseFloat(so2);
        float thuong = num1 / num2;
        String chuoiKQ = String.valueOf(thuong);
        editTextKQ.setText(chuoiKQ);
    }
}
