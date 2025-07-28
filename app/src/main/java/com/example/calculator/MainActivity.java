package com.example.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4;
    EditText e1,e2;

    TextView t1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        b1=findViewById(R.id.button);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        b4=findViewById(R.id.button4);
        e1=findViewById(R.id.editTextNumber3);
        e2=findViewById(R.id.editTextNumber4);
        t1=findViewById(R.id.textView);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a=Double.parseDouble(e1.getText().toString());
                String x=e2.getText().toString();
                double b=Double.parseDouble(x);
                double c=a+b;
                t1.setText(""+c);
                Toast.makeText(MainActivity.this, "Addition = "+c, Toast.LENGTH_SHORT).show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a=Double.parseDouble(e1.getText().toString());
                String x=e2.getText().toString();
                double b=Double.parseDouble(x);
                double c=a-b;
                t1.setText(""+c);
                Toast.makeText(MainActivity.this, "Difference = "+c, Toast.LENGTH_SHORT).show();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a=Double.parseDouble(e1.getText().toString());
                String x=e2.getText().toString();
                double b=Double.parseDouble(x);
                double c=a*b;
                t1.setText(""+c);
                Toast.makeText(MainActivity.this, "Product = "+c, Toast.LENGTH_SHORT).show();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a=Double.parseDouble(e1.getText().toString());
                String x=e2.getText().toString();
                double b=Double.parseDouble(x);
                if (b==0)
                    Toast.makeText(MainActivity.this, "Enter Non-Zero Value", Toast.LENGTH_SHORT).show();
                else {
                    double c = a / b;
                    t1.setText("" + c);
                    Toast.makeText(MainActivity.this, "Division = " + c, Toast.LENGTH_SHORT).show();
                }
            }
        });




    }
}