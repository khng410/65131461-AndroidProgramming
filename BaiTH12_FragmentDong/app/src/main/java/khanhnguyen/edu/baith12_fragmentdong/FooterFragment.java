package khanhnguyen.edu.baith12_fragmentdong;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FooterFragment extends Fragment {

    public FooterFragment() {
        // Constructor rỗng bắt buộc phải có đối với Fragment
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Bơm (Inflate) file giao diện fragment_footer.xml cho Fragment này
        return inflater.inflate(R.layout.fragment_footer, container, false);
    }
}