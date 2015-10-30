package damp_2.utad.actividad3fernandosanchez;

import android.view.View;
import android.widget.Button;

/**
 * Created by fernando.sanchez on 30/10/2015.
 */
public class ButtonListeners2 implements View.OnClickListener {
    Activity2 ma;

    public ButtonListeners2(Activity2 ma1){
        ma=ma1;

    }

    @Override
    public void onClick(View v){

        Button btnTarget = (Button)v;
        if (btnTarget.getId() == (R.id.btnJugar)){

            ma.cambiarPagJugando();
        }

        if (btnTarget.getId() == (R.id.btnSalir)){
            ma.finish();
        }





    }
}
