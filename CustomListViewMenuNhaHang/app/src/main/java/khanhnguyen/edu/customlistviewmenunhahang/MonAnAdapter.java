package khanhnguyen.edu.customlistviewmenunhahang;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.function.LongToIntFunction;

import kotlinx.coroutines.FlowPreview;

public class MonAnAdapter extends BaseAdapter {

    private ArrayList<MonAn> dsMonAn;
    private Context context;
    private LayoutInflater layoutInflater;

    public MonAnAdapter(Context _context, ArrayList<MonAn> dsMonAn) {
        this.context = _context;
        this.dsMonAn = dsMonAn;
        this.layoutInflater = LayoutInflater.from(_context);
    }

    @Override
    public int getCount() {
        return dsMonAn.size();
    }

    @Override
    public Object getItem(int position) {
        return dsMonAn.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //View item hien hanh
        View viewHienHanh = convertView;
        //Kiem tra
        if(viewHienHanh == null)
            viewHienHanh = layoutInflater.inflate(R.layout.item_monan, null);
        //Lay du lieu
        MonAn monAnHienTai = dsMonAn.get(position);
        //Gan len cac dieu khien

        //Tim dieu khien
        TextView tv_tenMonAn = viewHienHanh.findViewById(R.id.tvTenMonAn);
        TextView tv_giaMonAn = viewHienHanh.findViewById(R.id.tvGiaMonAn);
        TextView tv_moTaMonAn = viewHienHanh.findViewById(R.id.tvMoTaMonAn);
        ImageView imgv_imageView_Anh = viewHienHanh.findViewById(R.id.imgItem);
        //Set ten
        tv_tenMonAn.setText(monAnHienTai.getTenMonAn());
        tv_giaMonAn.setText(String.valueOf(monAnHienTai.getGia()));
        tv_moTaMonAn.setText(monAnHienTai.getMoTa());
        imgv_imageView_Anh.setImageResource(monAnHienTai.getImgID());
        return  viewHienHanh;
    }
}
