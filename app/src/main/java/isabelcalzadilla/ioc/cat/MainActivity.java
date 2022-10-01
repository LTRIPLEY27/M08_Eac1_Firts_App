package isabelcalzadilla.ioc.cat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    // variables para la impresión de los valores deseados en el LOG
    private static  final String PrimeraPantalla = "Primera Pantalla";
    private static  final String message = "Soc Isabel Calzadilla i escriu desde el log";

    /*
    *  ADICIÓN DEL LOG EN EL 'ONCREATE' PARA ENVIAR MENSAJE CON LA INFORMACIÓN REQUERIDA
    * */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // llamado a la impresión del tag y mensaje en el Log con la 'i' indicativo del nivel de 'Info'
        Log.i(PrimeraPantalla, message);
    }
}