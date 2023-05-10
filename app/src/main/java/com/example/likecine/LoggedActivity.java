package com.example.likecine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoggedActivity extends AppCompatActivity {

    String RA;

    private Button btTeste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            RA = extras.getString("RA");
        }

        btTeste = (Button) findViewById(R.id.btTeste);

        btTeste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoggedActivity.this, PlaylistActivity.class));
            }
        });
    }
}