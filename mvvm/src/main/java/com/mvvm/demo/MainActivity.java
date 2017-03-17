package com.mvvm.demo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.mvvm.demo.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
    User booob;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        booob = new User("Test","User");
        binding.setUser(booob);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                booob.setFirstName("Test Kimikh");
            }
        }  ,5000);
    }
}
