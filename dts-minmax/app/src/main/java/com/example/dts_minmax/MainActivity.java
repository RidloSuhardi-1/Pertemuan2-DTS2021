package com.example.dts_minmax;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editNumX;
    EditText editNumY;
    TextView textResult;
    Button btnCompare;

    float numX;
    float numY;
    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNumX = findViewById(R.id.numX);
        editNumY = findViewById(R.id.numY);
        textResult = findViewById(R.id.labelResult);
        btnCompare = findViewById(R.id.buttonCompare);

        btnCompare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numX = Float.parseFloat(editNumX.getText().toString());
                numY = Float.parseFloat(editNumY.getText().toString());


                // cek apakah nilai X dan Y sama

                if ( numX != numY ) {

                    // cari tahu mana nilai yang lebih besar
                    if ( numX > numY ) {
                        result =  "nilai X (" +  numX + ") lebih besar dari Y ( " + numY + ")";
                    } else {
                        result = "nilai Y (" +  numY + ") lebih besar dari X ( " + numX + ")";
                    }
                } else {
                    result = "nilai sama-sama " + numX;
                }

                // tampilkan hasil perbandingan
                textResult.setText(result);
            }
        });
    }
}