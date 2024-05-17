package com.example.springcttask.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.springcttask.R;
import com.example.springcttask.databinding.ActivitySplashScreenBinding;

public class SplashScreen extends AppCompatActivity {
    ActivitySplashScreenBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySplashScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        int duration =2000;

        new Handler().postDelayed(()->{
            Intent intent=new Intent(SplashScreen.this,LoginActivity.class);
            startActivity(intent);
            finish();
        },duration);
    }
}