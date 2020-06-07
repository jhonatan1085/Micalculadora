package com.example.micalculadora;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class TabCalculadora extends Fragment {
    Button btnUno, btnDos, btnTres, btnCuatro, btnCinco, btnSeis, btnSiete, btnOcho, btnNueve,
            btnSuma, btnResta, btnMultiplica, btnDivide, btnClean, btnBorrar, btnPunto, btnIgual;
    TextView Resultado;
    double resultado;
    String operador, mostrar , reserva;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_main, container, false);

                btnUno = view.findViewById(R.id.Uno);
        btnDos = view.findViewById(R.id.Dos);
        btnTres = view.findViewById(R.id.Tres);
        btnCuatro = view.findViewById(R.id.Cuatro);
        btnCinco = view.findViewById(R.id.Cinco);
        btnSeis = view.findViewById(R.id.Seis);
        btnSiete = view.findViewById(R.id.Siete);
        btnOcho = view.findViewById(R.id.Ocho);
        btnNueve = view.findViewById(R.id.Nueve);
        btnSuma = view.findViewById(R.id.Suma);
        btnResta = view.findViewById(R.id.Resta);
        btnMultiplica = view.findViewById(R.id.Multiplica);
        btnDivide = view.findViewById(R.id.Divide);
        btnClean = view.findViewById(R.id.Clean);
        btnBorrar = view.findViewById(R.id.Borrar);
        Resultado = view.findViewById(R.id.Etiqueta);
        btnPunto = view.findViewById(R.id.Punto);
        btnIgual = view.findViewById(R.id.Igual);
        btnUno.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "1";
                Resultado.setText(mostrar);
            }
        });


        btnDos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "2";
                Resultado.setText(mostrar);
            }
        });

        btnTres.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "3";
                Resultado.setText(mostrar);
            }
        });

        btnCuatro.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "4";
                Resultado.setText(mostrar);
            }
        });

        btnCinco.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "5";
                Resultado.setText(mostrar);
            }
        });

        btnSeis.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "6";
                Resultado.setText(mostrar);
            }
        });

        btnSiete.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "7";
                Resultado.setText(mostrar);
            }
        });

        btnOcho.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "8";
                Resultado.setText(mostrar);
            }
        });

        btnNueve.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "9";
                Resultado.setText(mostrar);
            }
        });

        btnSuma.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                reserva = Resultado.getText().toString();
                operador = "+";
                Resultado.setText("");
            }
        });

        btnResta.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                reserva = Resultado.getText().toString();
                operador = "-";
                Resultado.setText("");
            }
        });

        btnMultiplica.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                reserva = Resultado.getText().toString();
                operador = "*";
                Resultado.setText("");
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                reserva = Resultado.getText().toString();
                operador = "/";
                Resultado.setText("");
            }
        });

        btnPunto.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + ".";
                Resultado.setText(mostrar);
            }
        });

        btnClean.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = "";
                Resultado.setText(mostrar);
                reserva = "";
                operador = "";
            }
        });

        btnBorrar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar.substring(0,mostrar.length()-1);
                Resultado.setText(mostrar);
            }
        });

        btnIgual.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "1";
                if(operador.equals("-")){
                    resultado = Double.parseDouble(reserva) - Double.parseDouble(Resultado.getText().toString());
                    Resultado.setText(String.valueOf(resultado));
                }
                if(operador.equals("+")){
                    resultado = Double.parseDouble(reserva) + Double.parseDouble(Resultado.getText().toString());
                    Resultado.setText(String.valueOf(resultado));
                }
                if(operador.equals("/")){
                    resultado = Double.parseDouble(reserva) / Double.parseDouble(Resultado.getText().toString());
                    Resultado.setText(String.valueOf(resultado));
                }
                if(operador.equals("*")){
                    resultado = Double.parseDouble(reserva) * Double.parseDouble(Resultado.getText().toString());
                    Resultado.setText(String.valueOf(resultado));
                }
            }
        });

        return view;
    }
}