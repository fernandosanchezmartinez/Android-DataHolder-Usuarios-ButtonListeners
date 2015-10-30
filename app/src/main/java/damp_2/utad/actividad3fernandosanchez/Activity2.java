package damp_2.utad.actividad3fernandosanchez;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

/**
 * Created by fernando.sanchez on 30/10/2015.
 */
public class Activity2 extends Activity {

    ButtonListeners2 btnListener;

    public EditText edtxtuser = null;
    public EditText edtxtcorreo = null;

    public LinearLayout ly_1=null;
    public LinearLayout ly_2=null;

    public Button btnJugar=null;
    public Button btnMenu=null;




    public void initLayouts(){

        ly_1=(LinearLayout)findViewById(R.id.activity_layout1);
        ly_2=(LinearLayout)findViewById(R.id.activity_layout2);

    }
    public void init_text(){
        edtxtuser=(EditText) findViewById(R.id.edtxtuser);
        edtxtcorreo=(EditText) findViewById(R.id.edtxtcorreo);
    }

    public void init_buttons() {
        btnListener=new ButtonListeners2(this);

        btnJugar = (Button) findViewById(R.id.btnJugar);
        btnMenu = (Button) findViewById(R.id.btnMenu);

        btnJugar.setOnClickListener(btnListener);
        btnMenu.setOnClickListener(btnListener);
    }

    public void cambiarPagJugando() {
        ly_1.setVisibility(View.GONE);
        ly_2.setVisibility(View.VISIBLE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        this.initLayouts();
        this.init_buttons();
        this.init_text();
    }
}
