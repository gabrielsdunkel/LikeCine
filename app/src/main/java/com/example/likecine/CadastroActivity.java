package com.example.likecine;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Collection;

public class CadastroActivity extends AppCompatActivity {
    private DatabaseReference reference = FirebaseDatabase.getInstance().getReference();
    private DatabaseReference User = reference.child("Usuario");

    public EditText inpNome, inpRA;
    public Button bttCriar;
    String  nome, RA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        inpNome = (EditText) findViewById(R.id.ptNome);
        inpRA = (EditText) findViewById(R.id.ptRA);
        bttCriar = (Button) findViewById(R.id.bttCadastrarRealizar);

        bttCriar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                nome = inpNome.getText().toString();
                RA = inpRA.getText().toString();
                User.child(RA).child("Nome:").setValue(nome);
            }
        });

    }

}