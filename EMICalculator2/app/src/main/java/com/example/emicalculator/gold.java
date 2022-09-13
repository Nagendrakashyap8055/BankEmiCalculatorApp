package com.example.emicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class gold extends AppCompatActivity {
    Button calculate;
    TextView result;
    EditText pe, ne, re;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gold);
        calculate =  findViewById(R.id.calculate);
        result =  findViewById(R.id.result);
        pe = findViewById(R.id.p);
        ne = findViewById(R.id.n);
        re = findViewById(R.id.r);

        re.setInputType(0);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( pe.getText().toString().length() == 0 )
                    Toast.makeText(getApplicationContext(),"Principle is required!",Toast.LENGTH_SHORT).show();
                if( ne.getText().toString().length() == 0 )
                    Toast.makeText(getApplicationContext(),"Duration is required is required!",Toast.LENGTH_SHORT).show();

                Double p = Double.parseDouble(pe.getText().toString());
                Double n = Double.parseDouble(ne.getText().toString());
                Double r = Double.parseDouble(re.getText().toString());
                Double rate= r;
                Double i = (p * rate * n / 100);
                Double newp=i+p;
                Double months=n*12;
                Double res=Math.ceil(newp/months);
                result.setText("EMI = "+String.valueOf(res));
            }
        });
    }
}