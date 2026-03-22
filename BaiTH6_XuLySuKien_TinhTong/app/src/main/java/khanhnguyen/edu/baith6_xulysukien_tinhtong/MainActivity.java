package khanhnguyen.edu.baith6_xulysukien_tinhtong;

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
        //Gan Layout tuong ung voi file nay
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    //Day la bo lang nghe va xu ly su kien click nut TinhTong
    public void XuLyCong(View view)
    {
        //Tham chieu den dieu khien tren tep XML, mapping sang Java file
        EditText editTextSoA = findViewById(R.id.edtA);
        EditText editTextSoB = findViewById(R.id.edtB);
        EditText editTextKQ = findViewById(R.id.edtKQ);
        //Lay du lieu ve tu dieu khien so A, B
        String strA= editTextSoA.getText().toString();
        String strB= editTextSoB.getText().toString();
        //Chuyen du lieu sang dang so
        int soA = Integer.parseInt(strA);
        int soB = Integer.parseInt(strB);
        int tong = soA + soB;
        //Chuyen ket qua tong sang dang string
        String str_tong = String.valueOf(tong);
        //Hien ra man hinh
        editTextKQ.setText(str_tong);

    }
}