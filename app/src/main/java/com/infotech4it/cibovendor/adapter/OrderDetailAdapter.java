package com.infotech4it.cibovendor.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.infotech4it.cibovendor.R;
import com.infotech4it.cibovendor.databinding.ItemListOrderdetailBinding;
import com.infotech4it.cibovendor.model.OrderdetailModel;

import java.util.ArrayList;

/**
 * Created by Bilal Zaman on 10/10/2020.
 */
public class OrderDetailAdapter extends RecyclerView.Adapter<OrderDetailAdapter.ViewHolder> {
    private Context context;
    private ArrayList<OrderdetailModel> data;

    public OrderDetailAdapter(Context context) {
        this.context = context;
        this.data = new ArrayList<>();
    }

    public void setData(ArrayList<OrderdetailModel> data_) {
        this.data = data_;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemListOrderdetailBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.item_list_orderdetail, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.binding.setOnOrderdetail(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemListOrderdetailBinding binding;

        public ViewHolder(@NonNull ItemListOrderdetailBinding itemView) {
            super(itemView.getRoot());
            this.binding = itemView;
        }
    }
}
