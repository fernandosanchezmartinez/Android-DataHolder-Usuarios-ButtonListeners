package damp_2.utad.actividad3fernandosanchez;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

    ButtonListeners btnListener;

    public EditText edtxtUsuario = null;
    public EditText edtxtPass = null;


    public LinearLayout activity_layout1=null;
    public LinearLayout activity_layout2=null;

    public Button btnLogin=null;
    public Button btnRegistrarse=null;


    public void init_buttons() {
        btnListener=new ButtonListeners(this);

        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnRegistrarse = (Button) findViewById(R.id.btnRegistrarse);

        btnLogin.setOnClickListener(btnListener);
        btnRegistrarse.setOnClickListener(btnListener);


    }

    public void init_text(){
        edtxtUsuario=(EditText) findViewById(R.id.edtxtUsuario);
        edtxtPass=(EditText) findViewById(R.id.edtxtPass);


    }

    public void initLayouts(){

        activity_layout1=(LinearLayout)findViewById(R.id.activity_layout1);
        activity_layout2=(LinearLayout)findViewById(R.id.activity_layout2);

    }

    public void cambiarPag() {
        activity_layout1.setVisibility(View.GONE);
        activity_layout2.setVisibility(View.VISIBLE);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.initLayouts();
        this.init_buttons();
        this.init_text();
    }
}
