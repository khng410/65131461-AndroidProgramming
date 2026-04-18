package khanhnguyen.edu.xulisukienbangbolangnghe;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {
    //Khai bao bien
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;
    Button btnCong, btnTru, btnNhan, btnChia;

    public void ChooseOperation(){
        editTextSo1 = findViewById(R.id.edtNo1);
        editTextSo2 = findViewById(R.id.edtNo2);
        editTextKQ = findViewById(R.id.edtResult);
        btnCong = findViewById(R.id.plus);
        btnTru = findViewById(R.id.sub);
        btnNhan = findViewById(R.id.mul);
        btnChia = findViewById(R.id.div);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ChooseOperation();
        //Gan bo lang nghe cho cac nut thay vi gan truc tiep thuoc tinh onclick o ben xml
        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Xu li Cong
                handlePlus();
            }
        });
        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Xu li Tru
                handleSub();
            }
        });
        btnNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Xu li Nhan12
                handleMul();
            }
        });
        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Xu li Chia
                handleDiv();
            }
        });
    }
    public void handlePlus(){
        //Gan cac so1,so2 thanh dang chuoi va truy cap den du lieu thong qua ham getText()
        String So1 = (String) editTextSo1.getText().toString();
        String So2 = (String) editTextSo2.getText().toString();
        float No1 = Float.parseFloat(So1);
        float No2 = Float.parseFloat(So2);
        float Tong = No1 + No2;
        String strTong = String.valueOf(Tong);
        editTextKQ.setText(strTong);
    }
    public void handleSub(){
        String So1 = (String) editTextSo1.getText().toString();
        String So2 = (String) editTextSo2.getText().toString();
        float No1 = Float.parseFloat(So1);
        float No2 = Float.parseFloat(So2);
        float Hieu = No1 - No2;
        String strHieu = String.valueOf(Hieu);
        editTextKQ.setText(strHieu);
    }
    public void handleMul(){
        String So1 = (String) editTextSo1.getText().toString();
        String So2 = (String) editTextSo2.getText().toString();
        float No1 = Float.parseFloat(So1);
        float No2 = Float.parseFloat(So2);
        float Tich = No1 * No2;
        String strTich = String.valueOf(Tich);
        editTextKQ.setText(strTich);
    }

    public void handleDiv(){
        String So1 = (String) editTextSo1.getText().toString();
        String So2 = (String) editTextSo2.getText().toString();
        float No1 = Float.parseFloat(So1);
        float No2 = Float.parseFloat(So2);
        float Thuong = No1 / No2;
        String strThuong = String.valueOf(Thuong);
        editTextKQ.setText(strThuong);

    }
}