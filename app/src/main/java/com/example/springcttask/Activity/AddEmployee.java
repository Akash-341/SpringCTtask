package com.example.springcttask.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.springcttask.Activity.DBHelper.DatabaseHelper;
import com.example.springcttask.R;
import com.example.springcttask.databinding.ActivityAddEmployeeBinding;

public class AddEmployee extends AppCompatActivity {
ActivityAddEmployeeBinding binding;
DatabaseHelper databaseHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityAddEmployeeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        databaseHelper=new DatabaseHelper(this);

        binding.add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = binding.name.getText().toString();
                String age = binding.age.getText().toString();
                String address = binding.address.getText().toString();
                String city = binding.city.getText().toString();

                Boolean checkInsertData = databaseHelper.insertData(name, age, address, city);
                if (checkInsertData) {
                    Toast.makeText(AddEmployee.this, "Data Added", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(AddEmployee.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(AddEmployee.this, "Failed to add data", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}