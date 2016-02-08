package mx.edu.utng.abstractas;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * JesusDO
 */
public class AreasActivity extends Activity {

    private  Cuadrado cuadrado;
    private Triangulo tringulo;
    private EditText edtLado;
    private EditText edtBase;
    private EditText edtAltura;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.areas_layout);
        cuadrado = new Cuadrado();
        edtLado= (EditText)findViewById(R.id.edtlado);
        tringulo= new Triangulo();
        edtBase= (EditText)findViewById(R.id.edtBase);
        edtAltura= (EditText)findViewById(R.id.edtAltura);
    }
    public void calcular(View view){
        float lado=Float.parseFloat(edtLado.getText().toString());
        cuadrado.setLado(lado);
        Toast.makeText(this,"Area de cuadrado: "+cuadrado.calcularArea(),Toast.LENGTH_SHORT).show();
    }




}
