package com.example.sistemas.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText1, editText2,url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1=findViewById(R.id.editText);
        editText2=findViewById(R.id.editText2);
        url=findViewById(R.id.url);

    }


    public void enviar(View view){
        Intent i = new Intent(this,Clase2.class);
        i.putExtra("Dato1",editText1.getText().toString());
        i.putExtra("Dato2",editText2.getText().toString());
        startActivity(i);
        finish();
    }

    public void navegar(View view){
        Intent i = new Intent(this,Clase3.class);
        i.putExtra("URL",url.getText().toString());
        startActivity(i);
        finish();
    }
}
