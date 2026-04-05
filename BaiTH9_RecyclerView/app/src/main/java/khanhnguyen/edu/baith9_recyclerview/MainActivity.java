package khanhnguyen.edu.baith9_recyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerViewLandscape;
    ArrayList<LandScape> recyclerViewData;
    LandScapeAdapter landscapeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. Lấy dữ liệu
        recyclerViewData = getDataForRecyclerView();

        // 2. Tìm điều khiển RecyclerView trên giao diện
        recyclerViewLandscape = findViewById(R.id.recyclerViewLandScape);

        // 3. Quy định bố cục hiển thị cho RecyclerView (dạng cuộn dọc mặc định)
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerViewLandscape.setLayoutManager(layoutManager);

        // 4. Tạo Adapter
        landscapeAdapter = new LandScapeAdapter(this, recyclerViewData);

        // 5. Gắn Adapter vào RecyclerView
        recyclerViewLandscape.setAdapter(landscapeAdapter);
    }

    // Hàm tạo dữ liệu giả (Hardcode)
    private ArrayList<LandScape> getDataForRecyclerView() {
        ArrayList<LandScape> listData = new ArrayList<>();

        // Lưu ý: Tên file ảnh (tham số thứ 1) phải trùng khớp chính xác
        // với tên file ảnh thực tế bạn đã chép vào thư mục res/mipmap (không chứa phần mở rộng .jpg/.png)
        listData.add(new LandScape("flag_tower_of_hanoi", "Cột cờ Hà Nội"));
        listData.add(new LandScape("eiffel_tower", "Tháp Eiffel"));
        listData.add(new LandScape("buckingham", "Cung điện Buckingham"));
        listData.add(new LandScape("statue_of_liberty", "Tượng Nữ thần Tự do"));

        return listData;
    }
}