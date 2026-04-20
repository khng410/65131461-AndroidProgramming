package thigk2.nguyengiakhanh.thigk2_nguyengiakhanh;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ChucNang3Adapter extends RecyclerView.Adapter<ChucNang3Adapter.FoodViewHolder> {
    private List<Data> datas = new ArrayList<>();
    private Context context;

    public ChucNang3Adapter(Context context, List<Data> datas) {
        this.context = context;
        this.datas = datas;
    }

    @Override
    public int getItemCount() {
        return this.datas.size();
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.fragment_chuc_nang3, parent, false);
        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        holder.foodTvName.setText(datas.get(position).getName());
        holder.foodTvPrice.setText(datas.get(position).getPrice());
        holder.foodAvatar.setImageResource(datas.get(position).getAvatar());
    }

    public class FoodViewHolder extends RecyclerView.ViewHolder{
        private TextView foodTvName, foodTvPrice;
        private ImageView foodAvatar;

        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);
            this.foodTvName = itemView.findViewById(R.id.food_tv_name);
            this.foodTvPrice = itemView.findViewById(R.id.food_tv_price);
            this.foodAvatar = itemView.findViewById(R.id.food_img_avatar);
        }
    }
}

