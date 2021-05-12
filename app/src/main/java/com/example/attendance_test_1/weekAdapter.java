package com.example.attendance_test_1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class weekAdapter extends RecyclerView.Adapter<weekAdapter.CustomViewHolder> {
    private ArrayList<weekType> arrayList;
    private Context context;

    public weekAdapter(ArrayList<weekType> arrayList, weekActivity weekActivity) {
        this.arrayList=arrayList;
        this.context=context;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_week,parent,false);
        weekAdapter.CustomViewHolder holder=new weekAdapter.CustomViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        holder.tv_week.setText(arrayList.get(position).getWeek());
    }

    @Override
    public int getItemCount() {
        return (arrayList!=null?arrayList.size():0);
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        TextView tv_week;
        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            this.tv_week=itemView.findViewById(R.id.tv_week);
        }
    }
}