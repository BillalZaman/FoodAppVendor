package com.infotech4it.cibovendor.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.infotech4it.cibovendor.R;
import com.infotech4it.cibovendor.databinding.ActivityOrderListBinding;
import com.infotech4it.cibovendor.fragments.AcceptedFragment;
import com.infotech4it.cibovendor.fragments.CompletedFragment;
import com.infotech4it.cibovendor.fragments.PendingFragment;
import com.infotech4it.cibovendor.fragments.RejectedFragment;

public class OrderListActivity extends AppCompatActivity {
    private ActivityOrderListBinding binding;
    private PendingFragment pendingFragment = new PendingFragment();
    private AcceptedFragment acceptedFragment = new AcceptedFragment();
    private CompletedFragment completedFragment = new CompletedFragment();
    private RejectedFragment rejectedFragment = new RejectedFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_order_list);

        init();
    }

    private void init() {
        binding.setOnClick(this);
        replaceFragment(this,R.id.frameLayout,pendingFragment);
        binding.btnPendingOrder.setBackgroundColor(getResources().getColor(R.color.yellow));
        binding.btnAcceptedOrder.setBackgroundColor(getResources().getColor(R.color.tab));
        binding.btnCompletedOrder.setBackgroundColor(getResources().getColor(R.color.tab));
        binding.btnRejected.setBackgroundColor(getResources().getColor(R.color.tab));
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.imgMenu:{
                finish();
                break;
            }
            case R.id.btnPendingOrder:{
                replaceFragment(this,R.id.frameLayout,pendingFragment);
                binding.btnPendingOrder.setBackgroundColor(getResources().getColor(R.color.yellow));
                binding.btnAcceptedOrder.setBackgroundColor(getResources().getColor(R.color.tab));
                binding.btnCompletedOrder.setBackgroundColor(getResources().getColor(R.color.tab));
                binding.btnRejected.setBackgroundColor(getResources().getColor(R.color.tab));
                break;
            }
            case R.id.btnAcceptedOrder:{
                replaceFragment(this,R.id.frameLayout,acceptedFragment);
                binding.btnPendingOrder.setBackgroundColor(getResources().getColor(R.color.tab));
                binding.btnAcceptedOrder.setBackgroundColor(getResources().getColor(R.color.yellow));
                binding.btnCompletedOrder.setBackgroundColor(getResources().getColor(R.color.tab));
                binding.btnRejected.setBackgroundColor(getResources().getColor(R.color.tab));
                break;
            }
            case R.id.btnCompletedOrder:{
                replaceFragment(this,R.id.frameLayout,completedFragment);
                binding.btnPendingOrder.setBackgroundColor(getResources().getColor(R.color.tab));
                binding.btnAcceptedOrder.setBackgroundColor(getResources().getColor(R.color.tab));
                binding.btnCompletedOrder.setBackgroundColor(getResources().getColor(R.color.yellow));
                binding.btnRejected.setBackgroundColor(getResources().getColor(R.color.tab));
                break;
            }
            case R.id.btnRejected:{
                replaceFragment(this,R.id.frameLayout,rejectedFragment);
                binding.btnPendingOrder.setBackgroundColor(getResources().getColor(R.color.tab));
                binding.btnAcceptedOrder.setBackgroundColor(getResources().getColor(R.color.tab));
                binding.btnCompletedOrder.setBackgroundColor(getResources().getColor(R.color.tab));
                binding.btnRejected.setBackgroundColor(getResources().getColor(R.color.yellow));
                break;
            }
        }
    }

    public static void replaceFragment(Context context, int id, Fragment fragment) {
        FragmentTransaction fragmentTransaction = ((AppCompatActivity) context).getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(id, fragment);
        fragmentTransaction.commit();
    }
}