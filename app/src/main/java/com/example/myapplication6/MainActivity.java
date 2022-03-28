package com.example.myapplication6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private TextView vhod;
private TextView welcome;
private TextView vypolnite;
private EditText gmail;
private EditText password;
private Button inter;
private TextView forget;
private TextView click;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vhod = findViewById(R.id.Vhod);
        welcome = findViewById(R.id.Welcome);
        vypolnite = findViewById(R.id.Vypolnite);
        gmail = findViewById(R.id.gmail);
        password = findViewById(R.id.password);
        inter = findViewById(R.id.inter);
        forget = findViewById(R.id.forget);
        click = findViewById(R.id.click);

        gmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (gmail.getText().toString().isEmpty()) {

                    inter.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.gray));

                }else{
                    inter.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));

                }
            }
        });
        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (password.getText().toString().isEmpty()) {

                    inter.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.gray));

                }else{
                    inter.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));

                }
            }
        });
        inter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gmail.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    inter.setVisibility(View.GONE);
                    vhod.setVisibility(View.GONE);
                    password.setVisibility(View.GONE);
                    gmail.setVisibility(View.GONE);
                    forget.setVisibility(View.GONE);
                    click.setVisibility(View.GONE);
                    vypolnite.setVisibility(View.GONE);

                }
            }
        });
        Toast.makeText(MainActivity.this, "Вы успешно прошли", Toast.LENGTH_LONG).show();
    }
}