package com.example.cambiodepantalla;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2<integer> extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        double SueldoIngresado,RE;

        TextView Nombre = (TextView)findViewById(R.id.lNombre);
        TextView Sueldo   = (TextView)findViewById(R.id.lSueldo);
        TextView Renta = (TextView)findViewById(R.id.lRespuesta);
        Button btnRegresar  = (Button)findViewById(R.id.btnregresar);
        Bundle datosRecibidos = this.getIntent().getExtras();
        String Nombre2 = datosRecibidos.getString("pNombre");
        String Sueldo2 = datosRecibidos.getString("psueldo");
        Nombre.setText("Tu nombre es: "+Nombre2);
        Sueldo.setText("Tu sueldo es: "+Sueldo2);

        SueldoIngresado = Integer.parseInt(Sueldo2);

       if(SueldoIngresado >= 5664.01 &&  SueldoIngresado <= 10742.86 ){
            Renta.setText("la Renta es: "+SueldoIngresado* 0.10);
       }
       else if(SueldoIngresado > 10742.86 &&  SueldoIngresado <= 24457.14 ){
           Renta.setText("la Renta es: "+SueldoIngresado* 0.20);
        }
         else if(SueldoIngresado > 24457.14){
        Renta.setText("la Renta es: "+SueldoIngresado* 0.30);
    }
         else{
            Renta.setText("No aplica Renta");
        }
        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vuelva = new Intent(Activity2.this,Activity1.class);
                startActivity(vuelva);
            }
        });

    }
}