package com.example.testintent;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.testintent.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {
    private ActivitySecondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String name = getIntent().getStringExtra(MainActivity.NAME);
        binding.txtNameSecond.setText(name);
    }
}