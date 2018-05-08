package com.example.sistemas.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Clase2 extends AppCompatActivity {

    TextView name,apellido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clase2);

        name = findViewById(R.id.name);
        apellido = findViewById(R.id.apellido);


        name.setText(getIntent().getStringExtra("Dato1"));
        apellido.setText(getIntent().getStringExtra("Dato2"));

    }

    public void regresar(View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
        finish();
    }
}
