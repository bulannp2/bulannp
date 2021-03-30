package com.example.koreanactors;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class ListActorAdapter extends RecyclerView.Adapter<ListActorAdapter.ListViewHolder> {
    private ArrayList<Actor> listActor;

    public ListActorAdapter(ArrayList<Actor> list) {

        this.listActor = list;
    }

    public ListActorAdapter() {

    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.actor_club, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Actor actor = listActor.get(position);
        Glide.with(holder.itemView.getContext())
                .load(actor.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvname.setText(actor.getName());
        holder.tvdetail.setText(actor.getDetail());

    }

    @Override
    public int getItemCount() {
        return listActor.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvname, tvdetail;

        ListViewHolder(View itemview) {
            super(itemview);
            imgPhoto = itemview.findViewById(R.id.img_photo);
            tvname = itemview.findViewById(R.id.tv_name);
            tvdetail = itemview.findViewById(R.id.tv_detail);

        }
    }

}
