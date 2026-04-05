package khanhnguyen.edu.baith12_fragmentdong;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Lấy đối tượng quản lý Fragment
        FragmentManager fragmentManager = getSupportFragmentManager();

        // Bắt đầu giao dịch, thêm các Fragment vào FrameLayout tương ứng và commit
        fragmentManager.beginTransaction()
                .add(R.id.frame_content_holder, new ContentFragment())
                .add(R.id.frame_footer_holder, new FooterFragment())
                .commit();
    }
}