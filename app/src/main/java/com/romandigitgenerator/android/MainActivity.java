package com.romandigitgenerator.android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.romandigitgenerator.android.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.buttonGenerate.setOnClickListener(v -> {
            if (Integer.parseInt(binding.editTextDigit.getText().toString()) <= 3999 && Integer.parseInt(binding.editTextDigit.getText().toString()) >= 1) {
                Generator generator = new Generator();
                String value = generator.generate(Integer.parseInt(binding.editTextDigit.getText().toString()));
                binding.textViewRomanNumeral.setText(value);
            } else {
                Toast.makeText(MainActivity.this, "Please enter value between 1 to 3999.", Toast.LENGTH_LONG).show();
            }
        });
    }


}