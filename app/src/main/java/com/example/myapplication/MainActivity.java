package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        EditText etUsername=findViewById(R.id.username);
        EditText etpassword=findViewById(R.id.password);
        Button btn_log=findViewById(R.id.logbu);

        btn_log.setOnClickListener(v->{
            Toast.makeText(this, "login button clicked", Toast.LENGTH_SHORT).show();
        });

    }
}