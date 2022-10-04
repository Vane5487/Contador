package com.example.contador;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ContadorActivity extends AppCompatActivity {

    private int contador=0;

    TextView tv_pulsado;
    Button btnLimpiar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contador);

        tv_pulsado = findViewById(R.id.tv_pulsado);
        btnLimpiar = findViewById(R.id.btn_limpiar);

        Button btnPulsar = findViewById(R.id.button);
        TextView textView = findViewById(R.id.textView);

        tv_pulsado.setVisibility(View.INVISIBLE);

        btnPulsar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador++;
                if (contador==1) {
                    textView.setText( "Has pulsado 1 vez");
                }
                else if (contador>1){
                    textView.setText( "Has pulsado "+ contador + " veces");
                }

                tv_pulsado.setVisibility(View.VISIBLE);

                btnLimpiar.setVisibility(View.VISIBLE);
            }
        });

        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador=0;
                tv_pulsado.setVisibility(View.INVISIBLE);
                btnLimpiar.setVisibility(View.INVISIBLE);
            }
        });
    }

}
