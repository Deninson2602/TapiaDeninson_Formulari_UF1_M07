package com.example.showme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imgLogo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgLogo = findViewById(R.id.formulario);
        imgLogo.setImageResource(R.drawable.formulario);
    }

    public void goFormulario (View view){
        Intent intent = new Intent (this, formulario.class);
        startActivity(intent);
    }
}