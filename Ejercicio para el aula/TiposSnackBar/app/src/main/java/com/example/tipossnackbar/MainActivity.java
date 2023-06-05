package com.example.tipossnackbar;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button corto,medio,largo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        corto = findViewById(R.id.corto);
        medio = findViewById(R.id.medio);
        largo = findViewById(R.id.largo);
        corto.setOnClickListener(this);
        medio.setOnClickListener(this);
        largo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.corto){
            Snackbar.make(v, "Mostrando tipo corto", Snackbar.LENGTH_SHORT).show();
        }
        if(v.getId()==R.id.medio){
            Snackbar.make(v, "Mostrando tipo medio", Snackbar.LENGTH_LONG).show();
        }
        if(v.getId()==R.id.largo){
            Snackbar.make(v, "Mostrando tipo largo", Snackbar.LENGTH_INDEFINITE).show();
        }

    }
}