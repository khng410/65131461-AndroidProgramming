package khanhnguyen.edu.baith9_recyclerview;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class LandScapeAdapter extends RecyclerView.Adapter<LandScapeAdapter.ItemLandHolder> {
    private Context context;
    private ArrayList<LandScape> listData;

    // Hàm khởi tạo
    public LandScapeAdapter(Context context, ArrayList<LandScape> listData) {
        this.context = context;
        this.listData = listData;
    }

    @NonNull
    @Override
    public ItemLandHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Bơm (inflate) layout item_landscape.xml
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_landscape, parent, false);
        return new ItemLandHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemLandHolder holder, int position) {
        // Lấy dữ liệu tại vị trí hiện tại
        LandScape landscape = listData.get(position);

        // Gắn tên
        holder.tvCaption.setText(landscape.getLandscapeCaption());

        // Xử lý gắn ảnh từ tên file (chuỗi)
        String packageName = holder.itemView.getContext().getPackageName();
        String imageFileName = landscape.getImageFileName();

        // Tìm ID của ảnh trong thư mục mipmap thông qua tên file
        int imageId = holder.itemView.getResources().getIdentifier(imageFileName, "mipmap", packageName);

        // Gắn ảnh lên ImageView
        holder.ivLandscape.setImageResource(imageId);
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    // Lớp nội (Inner class) ViewHolder
    public class ItemLandHolder extends RecyclerView.ViewHolder {
        TextView tvCaption;
        ImageView ivLandscape;

        public ItemLandHolder(@NonNull View itemView) {
            super(itemView);
            // Ánh xạ các điều khiển từ file layout XML
            tvCaption = itemView.findViewById(R.id.textViewCaption);
            ivLandscape = itemView.findViewById(R.id.imageViewLandScape);
        }
    }
}