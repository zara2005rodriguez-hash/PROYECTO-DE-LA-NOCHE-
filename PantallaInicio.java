package com.example.miproyectonoche;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PantallaInicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla_inicio);

        Button boton = findViewById(R.id.btnEmpezar);
        boton.setOnClickListener(v ->
                Toast.makeText(this, R.string.mensaje_empezar, Toast.LENGTH_SHORT).show());
    }
}
