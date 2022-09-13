package com.example.emicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    View home,gold,electricdevices,vehicle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        home=findViewById(R.id.home);
        gold=findViewById(R.id.gold);
        electricdevices=findViewById(R.id.electricdevices);
        vehicle=findViewById(R.id.vehicle);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this,home.class);
                intent.putExtra("mode",1);
                startActivity(intent);
            }
        });
        gold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,gold.class);
                intent.putExtra("mode",2);
                startActivity(intent);
            }
        });

        electricdevices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,electric.class);
                intent.putExtra("mode",1);
                startActivity(intent);
            }
        });
        vehicle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,vehicle.class);
                intent.putExtra("mode",2);
                startActivity(intent);
            }
        });

    }
}