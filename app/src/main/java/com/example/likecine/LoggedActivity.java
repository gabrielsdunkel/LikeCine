package com.example.likecine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class LoggedActivity extends AppCompatActivity {

    String RA;
    public ListView list_item_filme;
    ArrayList<Filme> listafilme;

    private Button btPL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            RA = extras.getString("RA");
        }
        list_item_filme = (ListView) findViewById(R.id.lvFilmes);
        btPL = (Button) findViewById(R.id.btPL);

        btPL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoggedActivity.this, PlaylistActivity.class));
            }
        });
    }
}