package com.example.logingreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Usuario;
    EditText Contraseña;
    Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Usuario=(EditText)findViewById(R.id.ecusuario);
        Contraseña=(EditText)findViewById(R.id.etcontraseña);
        Login=(Button)findViewById(R.id.btnlogin);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre;
                String clave;
                nombre = Usuario.getText().toString();
                clave = Contraseña.getText().toString();
                if ((nombre.equals("cris"))  &&  (clave.equals("0320"))) {
                    Intent intent = new Intent( MainActivity.this, pantalla2.class);
                    startActivity(intent);
                }
                  else {
                    Toast.makeText( MainActivity.this, "usuario o contraseña incorrecta", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}