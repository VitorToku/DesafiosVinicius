package br.edu.estudofecap.ProjetoAulaInterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortearNumero(View view){

    }
    
    public void sortearMegaSena(View view){
        TextView texto = findViewById(R.id.textResultado);
        String resultado = "";

        int[] numeros = new int[6];

        for (int i = 0; i < numeros.length;)
        {
            int num = new Random().nextInt(9) + 1;

            if(!numeroEstaNaLista(num,numeros)){
                numeros[i] = num;
                i++;
            }
        }
        for(int i=0; i< numeros.length; i++){
            resultado += numeros[i];
            if(i<numeros.length -1){
               resultado+= " - ";
            }
        }

        texto.setText(resultado);
    }
    private boolean numeroEstaNaLista(int numero, int[] lista){
        boolean estaNaLista = false;

        for(int numeroProcurado: lista){
            if(numeroProcurado == numero){
                return true;
            }
        }
        return estaNaLista;
    }
}