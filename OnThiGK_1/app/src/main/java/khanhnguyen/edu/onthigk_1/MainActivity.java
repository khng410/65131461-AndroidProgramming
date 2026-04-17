package khanhnguyen.edu.onthigk_1;

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
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void XuLyCong(View view)
    {
        //Tham chieu den view can xu li, sau do luu tru lai
        EditText edtA = findViewById(R.id.edtA);
        EditText edtB = findViewById(R.id.edtB);
        EditText edtKQ = findViewById(R.id.edtKQ);

        //Get du lieu tu cac bien vua khai bao de mapping vua roi
        String strA = edtA.getText().toString(); //"4"
        String strB = edtB.getText().toString(); //"3"

        //Chuyen kieu du lieu tu dang string -> int de tinh toan
        int intA = Integer.parseInt(strA);  //'4'
        int intB = Integer.parseInt(strB); //'3'
        int kq = intA + intB; //'7'

        //Chuyeb ket qua tu dang so ve dang chuoi de xuat ra man hinh
        String strKQ = String.valueOf(kq);//"7"
        edtKQ.setText(strKQ);//7
    }
}