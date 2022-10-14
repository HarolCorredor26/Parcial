package com.example.universidad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    public EditText Nombre;
    public EditText Apellido;
    public EditText Tdocumento;
    public EditText Ndocumento;
    public EditText Direccion;
    public EditText Telefono;
    public EditText Credito;
    private Button  Enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Nombre = findViewById(R.id.Nombre);
        Apellido = findViewById(R.id.Apellido);
        Tdocumento = findViewById(R.id.Tdocumento);
        Ndocumento = findViewById(R.id.Ndocumento);
        Direccion = findViewById(R.id.Direccion);
        Telefono = findViewById(R.id.Telefono);
        Credito = findViewById(R.id.Creditos);
        Enviar = findViewById(R.id.Enviar);

        Enviar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if(validar())
                {
                    String Nombre_1 = Nombre.getText().toString();
                    String Apellido_1 = Apellido.getText().toString();
                    String T_documento = Tdocumento.getText().toString();
                    int N_documento = Integer.parseInt(Ndocumento.getText().toString());
                    String Direccion_1 = Direccion.getText().toString();
                    int Telefono_1 = Integer.parseInt(Telefono.getText().toString());
                    int Credito_1 = Integer.parseInt(Credito.getText().toString());

                    Alumno a = new Alumno(Nombre_1,Apellido_1,T_documento,N_documento,Direccion_1,Telefono_1,Credito_1);

                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);

                    Bundle bundle = new Bundle();
                    bundle.putSerializable("alumno",a);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            }

            private boolean validar()
            {
                boolean result = true;
                String valor = Nombre.getText().toString();
                String valor1 = Apellido.getText().toString();
                String valor2 = Tdocumento.getText().toString();
                String valor3 = Ndocumento.getText().toString();
                String valor4 = Direccion.getText().toString();
                String valor5 = Telefono.getText().toString();
                String valor6 = Credito.getText().toString();

                if(valor.isEmpty())
                {
                    Nombre.setError("Diligencie este espacio");
                    result = false;
                }
                if(valor1.isEmpty())
                {
                    Apellido.setError("Diligencie este espacio");
                    result = false;
                }
                if(valor2.isEmpty())
                {
                    Tdocumento.setError("Diligencie este espacio");
                    result = false;
                }
                if(valor3.isEmpty())
                {
                    Ndocumento.setError("Diligencie este espacio");
                    result = false;
                }
                if(valor4.isEmpty())
                {
                    Direccion.setError("Diligencie este espacio");
                    result = false;
                }
                if(valor5.isEmpty())
                {
                    Telefono.setError("Diligencie este espacio");
                    result = false;
                }
                if(valor6.isEmpty())
                {
                    Credito.setError("Diligencie este espacio");
                    result = false;
                }

                return result;
            }
        });
    }
}