package khanhnguyen.edu.danhsachtinhthanhlistview;

import android.content.ClipData;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.navigationevent.NavigationEvent_androidKt;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //Can nguon du lieu?
    ArrayList<String> dataTinhThanh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dataTinhThanh = new ArrayList<String>(); //Tạo thể hiện theo quy tắc OOP
        //Them du lieu vao bien dataTinhThanh
        dataTinhThanh.add("Hà Nội");
        dataTinhThanh.add("TPHCM");
        dataTinhThanh.add("Nha Trang");
        dataTinhThanh.add("Bình Dương");
        dataTinhThanh.add("Đồng Nai");
        dataTinhThanh.add("Huế");
        dataTinhThanh.add("Cần Thơ");

        //Cần adapterTinhThanh để liên kết với nguồn dữ liệu vừa tạo, thể hiện phải có 3 tham số là ngữ cảnh this, kiểu listview muốn tạo, nguồn dữ liệu
        ArrayAdapter<String> adapterTinhThanh = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, dataTinhThanh);

        //Khai báo và gán id được định nghĩa trong XML của listview bằng 1 biến để xử lí logic ở file java
        ListView lvDSTinhThanh = findViewById(R.id.lvTinhThanh);

        //Dùng setAdapter để kết nối dữ liệu hiển thị ra màn hình
        lvDSTinhThanh.setAdapter(adapterTinhThanh);

        //Khi nhấn lên 1 item của list view sẽ trả về nội dung của item đó (vd: Tên tỉnh) bằng Toast
        lvDSTinhThanh.setOnItemClickListener(XuLiItem);
    }
    //Xử lí logic khi nhấn item
    AdapterView.OnItemClickListener XuLiItem = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            String strNoiDung = dataTinhThanh.get(position);
            Toast.makeText(MainActivity.this, "Bạn vừa chon số "+String.valueOf(position+1)+" nội dung là " + strNoiDung, Toast.LENGTH_SHORT).show();
        }
    };
}