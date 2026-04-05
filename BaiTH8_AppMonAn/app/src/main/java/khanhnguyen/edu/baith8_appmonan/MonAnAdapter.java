package khanhnguyen.edu.baith8_appmonan;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class MonAnAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<MonAn> danhSachMonAn;

    public MonAnAdapter(Context context, ArrayList<MonAn> danhSachMonAn) {
        this.context = context;
        this.danhSachMonAn = danhSachMonAn;
    }

    @Override
    public int getCount() {
        return danhSachMonAn.size();
    }

    @Override
    public Object getItem(int i) {
        return danhSachMonAn.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        // 1. Nạp layout
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            // "item_monan" là tên file giao diện bạn tạo ở Bước 2
            view = inflater.inflate(R.layout.item_monan, null);
        }

        // 2. Lấy dữ liệu hiện hành
        MonAn monAnHienTai = danhSachMonAn.get(i);

        // 3. Tìm điều khiển (Ánh xạ)
        TextView tvTenMon = view.findViewById(R.id.tvTenMon); // Đổi ID tương ứng theo file XML của bạn
        TextView tvDonGia = view.findViewById(R.id.tvDonGia);
        TextView tvMoTa = view.findViewById(R.id.tvMoTa);
        ImageView imgDaiDien = view.findViewById(R.id.imgDaiDien);

        // 4. Set dữ liệu lên giao diện
        tvTenMon.setText(monAnHienTai.getTenMonAn());
        tvDonGia.setText(String.valueOf(monAnHienTai.getDonGia()) + " VND");
        tvMoTa.setText(monAnHienTai.getMoTa());
        imgDaiDien.setImageResource(monAnHienTai.getIdAnhMinhHoa());

        return view;
    }
}