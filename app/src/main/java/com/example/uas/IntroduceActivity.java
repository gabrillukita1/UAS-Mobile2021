package com.example.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class IntroduceActivity extends AppCompatActivity {

    private TextView tvName, tvAddress, tvAge, tvPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduce);

        tvName = findViewById(R.id.tv_name);
        tvAddress = findViewById(R.id.tv_address);
        tvAge = findViewById(R.id.tv_age);
        tvPhone = findViewById(R.id.tv_phone);

        tvName.setText(getIntent().getStringExtra("EXTRA_NAME"));
        tvAddress.setText(getIntent().getStringExtra("EXTRA_ADDRESS"));
        tvAge.setText(getIntent().getStringExtra("EXTRA_AGE"));
        tvPhone.setText(getIntent().getStringExtra("EXTRA_PHONE"));
    }
}