package com.infotech4it.cibovendor.activities;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.infotech4it.cibovendor.R;
import com.infotech4it.cibovendor.databinding.ActivityLoginBinding;
import com.infotech4it.cibovendor.helpers.UIHelper;

public class LoginActivity extends AppCompatActivity {
    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login);

        init();
    }

    private void init() {
        binding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UIHelper.openActivity(LoginActivity.this, MainActivity.class);
            }
        });

    }
}