package com.example.aluno.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText campo;
    private EditText campo1;
    private Button mult;
    private Button div;
    private Button soma;
    private Button sub;
    private Button limp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campo = (EditText) findViewById(R.id.campo);
        campo1 = (EditText) findViewById(R.id.campo1);
        soma = (Button) findViewById(R.id.soma);
        sub = (Button) findViewById(R.id.sub);
        div= (Button) findViewById(R.id.div);
        mult = (Button) findViewById(R.id.mult);
        limp = (Button) findViewById(R.id.limp);

        soma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Double result = Double.parseDouble(campo.getText().toString());
                    Double valor = Double.parseDouble(campo1.getText().toString());

                    result = result + valor;

                    Toast.makeText(MainActivity.this, "O valor é: "+result, Toast.LENGTH_LONG).show();

                }catch (Exception E){
                    Toast.makeText(MainActivity.this, "Houve um problema. Tente novamente!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Double result = Double.parseDouble(campo.getText().toString());
                    Double valor = Double.parseDouble(campo1.getText().toString());

                    result = result - valor;

                    Toast.makeText(MainActivity.this, "O valor é: "+result, Toast.LENGTH_LONG).show();

                }catch (Exception E){
                    Toast.makeText(MainActivity.this, "Houve um problema. Tente novamente!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Double result = Double.parseDouble(campo.getText().toString());
                    Double valor = Double.parseDouble(campo1.getText().toString());

                    result = result / valor;

                    Toast.makeText(MainActivity.this, "O valor é: "+result, Toast.LENGTH_LONG).show();

                }catch (Exception E){
                    Toast.makeText(MainActivity.this, "Houve um problema. Tente novamente!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Double result = Double.parseDouble(campo.getText().toString());
                    Double valor = Double.parseDouble(campo1.getText().toString());

                    result = result * valor;

                    Toast.makeText(MainActivity.this, "O valor é: "+result, Toast.LENGTH_LONG).show();

                }catch (Exception E){
                    Toast.makeText(MainActivity.this, "Houve um problema. Tente novamente!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        limp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {


                    campo.setText(" ");
                    campo1.setText(" ");

                }catch (Exception E){
                    Toast.makeText(MainActivity.this, "Houve um problema ao limpar. Tente novamente!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

}
