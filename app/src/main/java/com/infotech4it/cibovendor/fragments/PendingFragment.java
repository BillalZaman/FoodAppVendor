package com.infotech4it.cibovendor.fragments;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.infotech4it.cibovendor.R;
import com.infotech4it.cibovendor.adapter.OrderListAdapter;
import com.infotech4it.cibovendor.databinding.FragmentPendingBinding;
import com.infotech4it.cibovendor.model.OrderListModel;

import java.util.ArrayList;

public class PendingFragment extends Fragment {
    private FragmentPendingBinding binding;
    private OrderListAdapter adapter;
    private ArrayList<OrderListModel> data = new ArrayList<>();

    public PendingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_pending, container, false);
        init();
        return binding.getRoot();
    }

    private void init() {
        setData();
    }

    private void setData() {
        adapter = new OrderListAdapter(getContext());
        for(int i=0;i<=8;i++) {
            data.add(new OrderListModel("#424224", "Grill Burger", "22-02-2020"));
        }
        adapter.setData(data);
        binding.recyclerview.setAdapter(adapter);
    }
}