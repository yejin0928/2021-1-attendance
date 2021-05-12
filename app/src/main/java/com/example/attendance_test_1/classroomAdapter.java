package com.example.attendance_test_1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class classroomAdapter extends RecyclerView.Adapter<classroomAdapter.CustomViewHolder> {
    private ArrayList<classroomType> arrayList;
    private Context context;
    public classroomAdapter(ArrayList<classroomType> arrayList, Context context){
        this.arrayList=arrayList;
        this.context=context;
    }
    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_classroom,parent,false);
        CustomViewHolder holder=new CustomViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        //각 item 매칭
        holder.tv_code.setText(arrayList.get(position).getCourse_code());
        holder.tv_name.setText(arrayList.get(position).getCourse_name());
        holder.tv_profname.setText(arrayList.get(position).getCourse_professor());
    }

    @Override
    public int getItemCount() {
        return (arrayList!=null?arrayList.size():0);
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        TextView tv_code;
        TextView tv_name;
        TextView tv_profname;
        Button btn_attend;
        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            this.tv_code=itemView.findViewById(R.id.tv_code);
            this.tv_name=itemView.findViewById(R.id.tv_name);
            this.tv_profname=itemView.findViewById(R.id.tv_profname);
            this.btn_attend=itemView.findViewById(R.id.btn_attend);
        }
    }
}
