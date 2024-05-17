package com.example.springcttask.Activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.springcttask.R;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.viewHolder> {
    private Context context;
   List<EmployeeModel>employeeModelList;

    public Adapter(Context context, List<EmployeeModel> employeeModelList) {
        this.context = context;
        this.employeeModelList = employeeModelList;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.employee_data,parent,false);
        return new viewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        EmployeeModel model=employeeModelList.get(position);
        holder.name.setText(model.getName());
        holder.age.setText(model.getAge());
        holder.address.setText(model.getAddress());
        holder.city.setText(model.getCity());
    }

    @Override
    public int getItemCount() {
        return employeeModelList.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView name,age,address,city;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.name);
            age=itemView.findViewById(R.id.age);
            address=itemView.findViewById(R.id.address);
            city=itemView.findViewById(R.id.city);
        }
    }
}
