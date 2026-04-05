package khanhnguyen.edu.baith13_thaydoifragment;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Chỉ cần gọi dòng này.
        // Nó sẽ tự động load activity_main.xml, và activity_main.xml sẽ tự động gọi ContentFragment và FooterFragment lên.
        setContentView(R.layout.activity_main);
    }
}