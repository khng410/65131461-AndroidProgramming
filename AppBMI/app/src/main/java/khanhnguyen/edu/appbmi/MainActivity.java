package khanhnguyen.edu.appbmi;

import static java.lang.Math.pow;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void handleBMI(View view){
        //Lay data tu 2 nut bang findViewById
        EditText editTextWeight = (EditText) findViewById(R.id.edtWeight);
        EditText editTextHeight = (EditText) findViewById(R.id.edtHeight);
        EditText editTextKQ = (EditText) findViewById(R.id.edtCal);

        //Chuyen ve dang chuoi
        String TextWeight = editTextWeight.getText().toString();
        String TextHeight = editTextHeight.getText().toString();

        //Chuyen tu chuoi ve dang so thuc de tinh toan
        float Weight = Float.parseFloat(TextWeight);
        float Height = Float.parseFloat(TextHeight);

        //Tinh toan BMI bang cong thuc
        float KQ = Weight/(Height*Height) *10000;
        //Chuyen KQ tu so thuc -> chuoi
        String ChuoiKQ = String.valueOf(KQ);

        //Hien thi ra man hinh bang setText
        editTextKQ.setText(ChuoiKQ);
    }
}