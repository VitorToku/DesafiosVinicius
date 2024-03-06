package br.edu.estudofecap.projetoaulainterfaceview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enviar(View view){
        TextInputEditText campoPO = findViewById(R.id.inputPO);
        TextInputEditText campoPI = findViewById(R.id.inputPI);
        TextInputEditText campoNI = findViewById(R.id.inputNI);

        TextView resultado = findViewById(R.id.textResultado);

        Double notaPO = Double.valueOf(campoPO.getText().toString());
        Double notaPI = Double.valueOf(campoPI.getText().toString());
        Double notaNI = Double.valueOf(campoNI.getText().toString());

        double media = (notaPO + notaPI + notaNI) /3;

        resultado.setText("Media = " + media);
    }
}