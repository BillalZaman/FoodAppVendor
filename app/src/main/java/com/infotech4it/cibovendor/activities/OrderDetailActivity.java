package com.infotech4it.cibovendor.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.infotech4it.cibovendor.R;
import com.infotech4it.cibovendor.adapter.OrderDetailAdapter;
import com.infotech4it.cibovendor.databinding.ActivityOrderDetailBinding;
import com.infotech4it.cibovendor.model.OrderdetailModel;

import java.util.ArrayList;

public class OrderDetailActivity extends AppCompatActivity {
    private ActivityOrderDetailBinding binding;
    private OrderDetailAdapter adapter;
    private ArrayList<OrderdetailModel> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_order_detail);

        init();
    }

    private void init() {
        binding.setOnClick(this);
//        adapter = new OrderDetailAdapter(this);
//        data.add(new OrderdetailModel("Hassaan Gohar","Pizza Tikka Boti","22-02-2020",
//                "02:00 pm", "one bottle, chips",
//                "Reference site about Lorem Ipsum, giving information on its origins."));
//        adapter.setData(data);
//        binding.recyclerview.setAdapter(adapter);
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.imgMenu:{
                finish();
                break;
            }
            case R.id.imgCall:{

                break;
            }
            case R.id.btnAccepted:{

                break;
            }
            case R.id.btnRejected:{

                break;
            }
        }
    }
}