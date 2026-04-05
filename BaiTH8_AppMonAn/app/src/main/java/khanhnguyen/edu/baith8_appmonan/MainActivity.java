package khanhnguyen.edu.baith8_appmonan;

import android.os.Bundle;

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

        // 1. Tìm ListView
        ListView lvDanhSachMonAn = findViewById(R.id.lvDanhSachMonAn);

        // 2. Chuẩn bị dữ liệu
        ArrayList<MonAn> mangMonAn = new ArrayList<>();

        // Thêm các món ăn (Thay R.drawable.cts bằng tên ảnh thực tế bạn chép vào thư mục drawable)
        mangMonAn.add(new MonAn("Cơm tấm sườn", 25000, "Cơm tấm sườn bì chả ngon", R.drawable.cts));
        mangMonAn.add(new MonAn("Cơm sườn trứng", 30000, "Cơm sườn thêm trứng ốp la", R.drawable.cst));
        mangMonAn.add(new MonAn("Gà xối mỡ", 38000, "Cơm gà xối mỡ chiên giòn rụm", R.drawable.cg));
        mangMonAn.add(new MonAn("Sườn bì chả", 32000, "Sườn bì chả đặc biệt", R.drawable.sb));
        mangMonAn.add(new MonAn("Cơm đặc biệt", 35000, "Phần cơm đặc biệt siêu to", R.drawable.dp));

        // 3. Khởi tạo Adapter và gắn vào ListView
        MonAnAdapter adapter = new MonAnAdapter(this, mangMonAn);
        lvDanhSachMonAn.setAdapter(adapter);

        // 4. Bắt sự kiện khi click vào một dòng trong ListView
        lvDanhSachMonAn.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // Lấy món ăn tại vị trí i được click
                MonAn monAnDuocChon = mangMonAn.get(i);

                // Hiển thị thông báo (Toast)
                Toast.makeText(MainActivity.this, monAnDuocChon.getTenMonAn(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}