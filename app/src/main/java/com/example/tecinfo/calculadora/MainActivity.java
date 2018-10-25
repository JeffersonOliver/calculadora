package com.example.tecinfo.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String memoria;
    private String operacao;
    private double valor1 = 0;
    private double valor2 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView displayConta = (TextView) findViewById(R.id.displayConta);
        final TextView displayResultado = (TextView) findViewById(R.id.displayResultado);


        final Button btn0 = (Button) findViewById(R.id.btn0);
        final Button btn_virtula = (Button) findViewById(R.id.btn_virtula);
        final Button btn_igual = (Button) findViewById(R.id.btn_igual);
        final Button btn_p = (Button) findViewById(R.id.btn_p);
        final Button btn_s = (Button) findViewById(R.id.btn_s);
        final Button btn_soma = (Button) findViewById(R.id.btn_soma);
        final Button btn_d = (Button) findViewById(R.id.btn_d);
        final Button btn_m = (Button) findViewById(R.id.btn_m);
        final Button btn1 = (Button) findViewById(R.id.btn1);
        final Button btn2 = (Button) findViewById(R.id.btn2);
        final Button btn3 = (Button) findViewById(R.id.btn3);
        final Button btn4 = (Button) findViewById(R.id.btn4);
        final Button btn5 = (Button) findViewById(R.id.btn5);
        final Button btn6 = (Button) findViewById(R.id.btn6);
        final Button btn7 = (Button) findViewById(R.id.btn7);
        final Button btn8 = (Button) findViewById(R.id.btn8);
        final Button btn9 = (Button) findViewById(R.id.btn9);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                memoria =(String)displayConta.getText();
                displayConta.setText(memoria + "0");

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                memoria = (String) displayConta.getText();
                displayConta.setText(memoria + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                memoria = (String) displayConta.getText();
                displayConta.setText(memoria + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                memoria = (String) displayConta.getText();
                displayConta.setText(memoria + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                memoria = (String) displayConta.getText();
                displayConta.setText(memoria + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                memoria = (String) displayConta.getText();
                displayConta.setText(memoria + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                memoria = (String) displayConta.getText();
                displayConta.setText(memoria + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                memoria = (String) displayConta.getText();
                displayConta.setText(memoria + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                memoria = (String) displayConta.getText();
                displayConta.setText(memoria + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                memoria = (String) displayConta.getText();
                displayConta.setText(memoria + "9");
            }
        });

        btn_virtula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                memoria = (String) displayConta.getText();
                displayConta.setText(memoria + ",");
            }
        });

        btn_p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                memoria = "";
                displayConta.setText("");
                displayResultado.setText("");
            }
        });

        btn_soma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacao = "+";
                valor1 = Double.parseDouble(displayConta.getText().toString());
                displayResultado.setText(displayConta.getText().toString() + "+");
                displayConta.setText("");

            }
        });

        btn_s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacao = " - ";
                valor1 = Double.parseDouble(displayConta.getText().toString());
                displayResultado.setText(displayConta.getText().toString());
                displayConta.setText("");
            }
        });

        btn_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacao = " / ";
                valor1 = Double.parseDouble(displayConta.getText().toString());
                displayResultado.setText(displayConta.getText().toString());
                displayConta.setText("");
            }
        });

        btn_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacao = " * ";
                valor1 = Double.parseDouble(displayConta.getText().toString());
                displayResultado.setText(displayConta.getText().toString());
                displayConta.setText("");
            }
        });

        btn_igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(displayConta.getText().equals("")){

                    Toast.makeText(getApplicationContext(),
                            "Digite um numero !", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
