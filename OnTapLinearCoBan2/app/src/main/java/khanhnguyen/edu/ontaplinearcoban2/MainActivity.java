package khanhnguyen.edu.ontaplinearcoban2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.function.ToLongBiFunction;

public class MainActivity extends AppCompatActivity {
    //Khai bao bien
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;

    public void ChooseOperation(){
        editTextSo1 = (EditText) findViewById(R.id.edtNo1);
        editTextSo2 = (EditText) findViewById(R.id.edtNo2);
        editTextKQ = (EditText) findViewById(R.id.edtResult);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ChooseOperation();
    }
    public void handlePlus(View view){
        //Gan cac so1,so2 thanh dang chuoi va truy cap den du lieu thong qua ham getText()
        String So1 = (String) editTextSo1.getText().toString();
        String So2 = (String) editTextSo2.getText().toString();
        float No1 = Float.parseFloat(So1);
        float No2 = Float.parseFloat(So2);
        float Tong = No1 + No2;
        String strTong = String.valueOf(Tong);
        editTextKQ.setText(strTong);
    }
    public void handleSub(View view){
        String So1 = (String) editTextSo1.getText().toString();
        String So2 = (String) editTextSo2.getText().toString();
        float No1 = Float.parseFloat(So1);
        float No2 = Float.parseFloat(So2);
        float Hieu = No1 - No2;
        String strHieu = String.valueOf(Hieu);
        editTextKQ.setText(strHieu);
    }
    public void handleMul(View view){
        String So1 = (String) editTextSo1.getText().toString();
        String So2 = (String) editTextSo2.getText().toString();
        float No1 = Float.parseFloat(So1);
        float No2 = Float.parseFloat(So2);
        float Tich = No1 * No2;
        String strTich = String.valueOf(Tich);
        editTextKQ.setText(strTich);
    }

    public void handleDiv(View view){
        String So1 = (String) editTextSo1.getText().toString();
        String So2 = (String) editTextSo2.getText().toString();
        float No1 = Float.parseFloat(So1);
        float No2 = Float.parseFloat(So2);
        float Thuong = No1 / No2;
        String strThuong = String.valueOf(Thuong);
        editTextKQ.setText(strThuong);
    }
}