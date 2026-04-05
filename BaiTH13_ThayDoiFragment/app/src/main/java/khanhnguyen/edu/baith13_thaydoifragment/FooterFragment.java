package khanhnguyen.edu.baith13_thaydoifragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FooterFragment extends Fragment {

    public FooterFragment() {
        // Constructor rỗng
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Nạp giao diện
        View v = inflater.inflate(R.layout.fragment_footer, container, false);

        // Ánh xạ các nút bấm
        Button btn1 = v.findViewById(R.id.btn1);
        Button btn2 = v.findViewById(R.id.btn2);
        Button btn3 = v.findViewById(R.id.btn3);

        // Lấy đối tượng FragmentManager từ Parent
        FragmentManager fragmentManager = getParentFragmentManager();

        // Xử lý sự kiện cho nút 1
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView, new Fragment1())
                        .commit();
            }
        });

        // Xử lý sự kiện cho nút 2
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView, new Fragment2())
                        .commit();
            }
        });

        // Xử lý sự kiện cho nút 3
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView, new Fragment3())
                        .commit();
            }
        });

        return v;
    }
}