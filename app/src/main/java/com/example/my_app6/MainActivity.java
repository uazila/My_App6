package com.example.my_app6;

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

    private EditText et_mail, et_password;
    private Button btn_next;
    private TextView tv_vhod, tv_vypolnite, tv_zabyli;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_mail = findViewById(R.id.et_mail);
        et_password = findViewById(R.id.et_password);
        btn_next = findViewById(R.id.voity);
        tv_vhod = findViewById(R.id.vhod);
        tv_vypolnite = findViewById(R.id.text);
        tv_zabyli = findViewById(R.id.password_zabyl);

        et_mail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length() > 0) {
                    btn_next.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));
                } else {
                    btn_next.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.gray));
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        et_password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length() > 0) {
                    btn_next.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));
                } else {
                    btn_next.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.gray));
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (et_password.getText().toString().equals("admin") && et_mail.getText().toString().equals("admin")) {
                    Toast.makeText(MainActivity.this, "Успешно!", Toast.LENGTH_SHORT).show();
                    et_mail.setVisibility(View.INVISIBLE);
                    et_password.setVisibility(View.INVISIBLE);
                    btn_next.setVisibility(View.INVISIBLE);
                    tv_vhod.setVisibility(View.INVISIBLE);
                    tv_vypolnite.setVisibility(View.INVISIBLE);
                    tv_zabyli.setVisibility(View.INVISIBLE);
                } else {
                    Toast.makeText(MainActivity.this, "Повторите", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}