package com.example.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText name, age, phone, address;
    private Button btn_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.et_name);
        age = findViewById(R.id.et_age);
        phone = findViewById(R.id.et_hp);
        address = findViewById(R.id.et_address);
        btn_submit = findViewById(R.id.btn_submit);

        btn_submit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, IntroduceActivity.class);
            intent.putExtra("EXTRA_NAME", name.getText().toString());
            intent.putExtra("EXTRA_AGE", age.getText().toString());
            intent.putExtra("EXTRA_PHONE", phone.getText().toString());
            intent.putExtra("EXTRA_ADDRESS", address.getText().toString());

            startActivity(intent);
    }
}