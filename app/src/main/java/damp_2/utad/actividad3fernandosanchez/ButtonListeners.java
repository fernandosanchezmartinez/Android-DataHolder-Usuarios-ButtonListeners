package damp_2.utad.actividad3fernandosanchez;


import android.view.View;
import android.widget.Button;

public class ButtonListeners implements View.OnClickListener{

    MainActivity ma;

    public ButtonListeners(MainActivity ma1){
        ma=ma1;

    }

    @Override
    public void onClick(View v){

        Button btnTarget = (Button)v;
            if (btnTarget.getId() == (R.id.btnRegistrarse)){

            ma.cambiarPagRegistrarse();
             }

        if (btnTarget.getId() == (R.id.btnLogin)){
            ma.cambiarPagLogin();
        }

        if (btnTarget.getId() == (R.id.btnAceptar)){
            ma.botonAceptar();
        }

        if (btnTarget.getId() == (R.id.btnCancelar)){
            ma.botonCancelar();
        }



    }
}
