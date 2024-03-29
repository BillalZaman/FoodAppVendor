package com.infotech4it.cibovendor.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.infotech4it.cibovendor.R;
import com.infotech4it.cibovendor.databinding.ItemOrderBinding;
import com.infotech4it.cibovendor.model.OrderListModel;

import java.util.ArrayList;

/**
 * Created by Bilal Zaman on 09/10/2020.
 */
public class OrderListAdapter extends RecyclerView.Adapter<OrderListAdapter.ViewHolder>{
    private Context context;
    private ArrayList<OrderListModel> data;

    public OrderListAdapter(Context context) {
        this.context = context;
        this.data = new ArrayList<>();
    }

    public void setData(ArrayList<OrderListModel>data_){
        this.data = data_;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemOrderBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_order, parent,
                false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.binding.setOnOrder(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ItemOrderBinding binding;

        public ViewHolder(@NonNull ItemOrderBinding itemView) {
            super(itemView.getRoot());
            this.binding = itemView;
        }
    }
}
