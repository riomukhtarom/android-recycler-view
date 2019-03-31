package com.riodev.recyclerviewexample;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListPresidentAdapter extends RecyclerView.Adapter<ListPresidentAdapter.ViewHolder> {

    private Context context;
    private ArrayList<President> listPresident;

    public ListPresidentAdapter(Context context) {
        this.context = context;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public ArrayList<President> getListPresident() {
        return listPresident;
    }

    public void setListPresident(ArrayList<President> listPresident) {
        this.listPresident = listPresident;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListPresidentAdapter.ViewHolder viewHolder, final int i) {
        viewHolder.tvName.setText(getListPresident().get(i).getName());
        viewHolder.tvDescription.setText(getListPresident().get(i).getDescription());
        Glide.with(context)
                .load(Integer.valueOf(getListPresident().get(i).getPhoto()))
                .apply(new RequestOptions().override(60,60))
                .into(viewHolder.ivPhoto);

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DetailPresidentActivity.class);
                intent.putExtra("PRESIDENT", getListPresident().get(i));
                Log.e("Title", getListPresident().get(i).getName());
                getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return getListPresident().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvDescription;
        ImageView ivPhoto;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDescription = itemView.findViewById(R.id.tv_item_desc);
            ivPhoto = itemView.findViewById(R.id.iv_item_photo);
        }
    }
}
