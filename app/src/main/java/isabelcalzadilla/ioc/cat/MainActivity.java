package isabelcalzadilla.ioc.cat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static  final String PRIMERA_PANTALLA = "Primera Pantalla";
    private static  final String message = "Soc Isabel Calzadilla i escriu desde el log";

    /*
    *  ADICIÓN DEL LOG EN EL 'ONCREATE' PARA ENVIAR MENSAJE CON LA INFORMACIÓN REQUERIDA
    * */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(PRIMERA_PANTALLA, message);
    }
}