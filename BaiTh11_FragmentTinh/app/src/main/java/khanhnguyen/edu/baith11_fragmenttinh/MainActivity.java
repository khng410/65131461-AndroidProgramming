package khanhnguyen.edu.baith11_fragmenttinh;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Dòng này sẽ tự động nạp giao diện activity_main.xml
        // và kéo theo cả ContentFragment, FooterFragment lên màn hình
        setContentView(R.layout.activity_main);
    }
}