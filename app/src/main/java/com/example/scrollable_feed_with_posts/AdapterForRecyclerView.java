package com.example.scrollable_feed_with_posts;

import android.content.Context;
import android.content.Intent;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Modifier;
import java.util.List;

public class AdapterForRecyclerView extends RecyclerView.Adapter<AdapterForRecyclerView.MyViewHolder> {

    private Context context;
    private List<DataModel> list;
    public AdapterForRecyclerView(Context context , List<DataModel> list){
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row_layout_for_recyclerview_list , parent , false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        DataModel data = list.get(position);
        holder.avatar.setImageResource(data.getAvatarImageId());
        if(data.getImagePostId() != null) {
            holder.image.setImageResource(data.getImagePostId());
            holder.image.setVisibility(View.VISIBLE);
        }
        else
            holder.image.setVisibility(View.GONE);
        holder.name.setText(data.getName());
        if(data.getCaption() != null)
            holder.caption.setText(data.getCaption());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView avatar , image;
        TextView name , caption;
        LinearLayout linearLayout;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            avatar = itemView.findViewById(R.id.avatar);
            image = itemView.findViewById(R.id.image);
            name = itemView.findViewById(R.id.name);
            caption = itemView.findViewById(R.id.caption);
            linearLayout = itemView.findViewById(R.id.rootView);
            linearLayout.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(context , PostDetailActivity.class);
            intent.putExtra(PostDetailActivity.OBJECT , list.get(getAdapterPosition()));
            context.startActivity(intent);
        }
    }
}
