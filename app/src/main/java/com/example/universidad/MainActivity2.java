package com.example.universidad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity
{
    private TextView Nombre_1;
    private TextView Apellido_1;
    private TextView Ndocumento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Nombre_1 = findViewById(R.id.Nombre_1);
        Apellido_1 = findViewById(R.id.Apellido_1);

        Bundle sendObj = getIntent().getExtras();

        Alumno alum = null;
        if(sendObj != null)
        {
            alum =(Alumno) sendObj.getSerializable("alumno");
            Nombre_1.setText(alum.getNombre());
            Apellido_1.setText(alum.getApellido());
            Ndocumento.setText(alum.getCedula());
        }

    }
}