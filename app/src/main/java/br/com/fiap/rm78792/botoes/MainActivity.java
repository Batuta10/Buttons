package br.com.fiap.rm78792.botoes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtNumero;
    int cont = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNumero = (TextView) findViewById(R.id.txtNumero);

    }//OnCreate

    public void mais(View view) {
        if (cont < 10){
            cont++;
        }else {
            Toast.makeText(this, R.string.txtIncremete, Toast.LENGTH_SHORT).show();
        }
        txtNumero.setText("" + cont);
    }//Mais
    public void menos(View view) {
        if (cont > 0){
           cont += - 1; 
        }else {
            Toast.makeText(this, R.string.txtDecrementar, Toast.LENGTH_SHORT).show();
        }
        txtNumero.setText("" + cont);
    }//Menos
}//Main Class