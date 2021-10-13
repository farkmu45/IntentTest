package com.example.testintent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.testintent.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    public static final String NAME = "NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnSubmit.setOnClickListener(view -> {
            String prefix = binding.txtValue.getPrefixText().toString();
            String val = binding.txtValue.getEditText().getText().toString();
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(prefix + val));
            startActivity(intent);
        });

        binding.btnSubmitName.setOnClickListener(view -> {
            String name = binding.txtName.getEditText().getText().toString();
            startActivity(new Intent(this, SecondActivity.class).putExtra(NAME, name));
        });
    }


}