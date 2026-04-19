package khanhnguyen.edu.customlistviewmenunhahang;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

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
       //Tim listview
        ListView lvDSMonAn = findViewById(R.id.lvDSMonAn);

        //Add data
        ArrayList<MonAn> dsMonAn = new ArrayList<MonAn>();
        dsMonAn.add(new MonAn("Com tam suon",25000,"Mo ta com tam suon", R.drawable.cropped_com_suon_bi_cha));
        dsMonAn.add(new MonAn("Com tam suon trung",25000,"Mo ta com tam suon", R.drawable.cropped_com_suon_trung));
        dsMonAn.add(new MonAn("Com tam muoi e ",25000,"Mo ta com tam suon", R.drawable.cropped_com_muoi_e));
        dsMonAn.add(new MonAn("Com tam thit kho",25000,"Mo ta com tam suon", R.drawable.cropped_com_thit_kho));
        dsMonAn.add(new MonAn("Com tam vit",25000,"Mo ta com tam suon", R.drawable.cropped_com_vit));

        //
        MonAnAdapter adapter = new MonAnAdapter(this, dsMonAn);
        lvDSMonAn.setAdapter(adapter);

        //Xu li su kien
        lvDSMonAn.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Lay phan tu duoc chon
                MonAn monAnChon = dsMonAn.get(position);
                Toast.makeText(MainActivity.this,monAnChon.getTenMonAn(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}