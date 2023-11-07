package com.example.tallercalculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Double num1, num2, resultado;
    int operador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void resultado (View view){

        TextView tv = findViewById(R.id.textView);
        num2 = Double.parseDouble(tv.getText().toString());

        if (operador==1){
            resultado = num1+num2;
        }
        if (operador==2){
            resultado = num1-num2;
        }
        if (operador==3){
            resultado = num1/num2;
        }
        if (operador==4){
            resultado = num1*num2;
        }

        tv.setText(resultado.toString());
    }


    public void guardarNum1 (View view){
        TextView tv = findViewById(R.id.textView);
        num1 = Double.parseDouble(tv.getText().toString());
        tv.setText("");
    }

    public void botonSuma (View view){
        operador = 1;
        guardarNum1(view);
    }

    public void botonResta (View view){
        operador = 2;
        guardarNum1(view);
    }
    public void botonDivision (View view){
        operador = 3;
        guardarNum1(view);
    }
    public void botonMultiplicacion (View view){
        operador = 4;
        guardarNum1(view);
    }

    public void botonBorrarTodo(View view){
        num1 = 0.0;
        num2 = 0.0;
        TextView tv = findViewById(R.id.textView);
        tv.setText("");
    }
    public void borrarUltimaCifra (View view){
        TextView tv = findViewById(R.id.textView);
        String str = tv.getText().toString();
        str = str.substring(0, str.length()-1);
        tv.setText(str.toString());
    }

    public void boton1 (View view){

        TextView tv = findViewById(R.id.textView);
        tv.setText(tv.getText() + "1");
    }
    public void boton2 (View view){
        TextView tv = findViewById(R.id.textView);
        tv.setText(tv.getText() + "2");
    }
    public void boton3 (View view){
        TextView tv = findViewById(R.id.textView);
        tv.setText(tv.getText() + "3");
    }
    public void boton4 (View view){
        TextView tv = findViewById(R.id.textView);
        tv.setText(tv.getText() + "4");
    }
    public void boton5 (View view){
        TextView tv = findViewById(R.id.textView);
        tv.setText(tv.getText() + "5");
    }
    public void boton6 (View view){
        TextView tv = findViewById(R.id.textView);
        tv.setText(tv.getText() + "6");
    }
    public void boton7 (View view){
        TextView tv = findViewById(R.id.textView);
        tv.setText(tv.getText() + "7");
    }
    public void boton8 (View view){
        TextView tv = findViewById(R.id.textView);
        tv.setText(tv.getText() + "8");
    }
    public void boton9 (View view){
        TextView tv = findViewById(R.id.textView);
        tv.setText(tv.getText() + "9");
    }
    public void boton0 (View view){
        TextView tv = findViewById(R.id.textView);
        tv.setText(tv.getText() + "0");
    }
    public void botonComa (View view){
        TextView tv = findViewById(R.id.textView);
        tv.setText(tv.getText() + ".");
    }
}