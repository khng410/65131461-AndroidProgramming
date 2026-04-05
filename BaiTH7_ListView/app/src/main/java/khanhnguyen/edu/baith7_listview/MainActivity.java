package khanhnguyen.edu.baith7_listview;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Hiển thị data lên ListView
        //B1+: Cần có data
        // ? Từ database (SQL, noSQL, XML,...)
        // Ở bài này Hard-code dữ liệu trực tiếp
        // cần biến phù hợp chứa data
        ArrayList<String> dsTenTinhThanhVN; //Khai báo
        dsTenTinhThanhVN = new ArrayList<String>(); //Tọa thể hiện cụ thể

        //Thêm data ở đây
        // nhưng ta hard-code để demo
        dsTenTinhThanhVN.add("Hà Nội");
        dsTenTinhThanhVN.add("Thành phố Hồ Chí Minh");
        dsTenTinhThanhVN.add("Đồng Nai");
        dsTenTinhThanhVN.add("Bình Thuận");
        dsTenTinhThanhVN.add("Ninh Thuận");
        dsTenTinhThanhVN.add("Nha Trang");

        //B2: Tọa Adapter
        ArrayAdapter<String> adapterTinhThanh;
        adapterTinhThanh = new ArrayAdapter<String>( this, android.R.layout.simple_list_item_1,dsTenTinhThanhVN);

        //B3: Gắn vào điều khiển hiển thị ListView
        //3.1: Tìm
        ListView lvTenTinhThanh = findViewById(R.id.lvDanhSachTT);
        //3.2: Gan
        lvTenTinhThanh.setAdapter(adapterTinhThanh);
        //3.3: Lắng nghe và xử lí sự kiện
    }
}