package com.example.android.inclassweek08;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class PresidentAdapter extends RecyclerView.Adapter<PresidentViewHolder> {
    private List<President> presidents;
    private Context context;

    public PresidentAdapter(List<President> presidents, Context context) {
        this.presidents = presidents;
        this.context = context;
    }

    @Override
    public PresidentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_president, parent, false);
        return new PresidentViewHolder(view, context);
    }


    @Override
    public void onBindViewHolder(PresidentViewHolder holder, int position) {
        President president = presidents.get(position);
        holder.getPresidentNameView().setText(president.getName());
        holder.getPresidentInfoView().setText(president.getInfo());
        holder.getPresidentPhotoView().setImageResource(president.getPhotoResId());
    }

    @Override
    public int getItemCount() {
        return presidents.size();
    }

}
