package com.example.dts_luaslingkaran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editJariJari;
    TextView textKeliling;
    TextView textLuas;
    Button buttonHitung;

    float  jariJari;
    double keliling;
    double luas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editJariJari =  findViewById(R.id.inJariJari);
        textKeliling = findViewById(R.id.kelilingResult);
        textLuas = findViewById(R.id.luasResult);
        buttonHitung = findViewById(R.id.buttonResult);


        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jariJari = Float.parseFloat(editJariJari.getText().toString()) ;

                keliling  =  jariJari*2* Math.PI;
                textKeliling.setText("Keliling : " + String.valueOf(keliling) );

                luas  =  Math.pow(jariJari, 2)* Math.PI;
                textLuas.setText( "Luas : " + String.valueOf(luas));
            }
        });
    }
}