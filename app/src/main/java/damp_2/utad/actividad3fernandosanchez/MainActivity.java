package damp_2.utad.actividad3fernandosanchez;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    ButtonListeners btnListener;

    public EditText edtxtUsuario = null;
    public EditText edtxtPass = null;

    public EditText edtxtUsuario2 = null;
    public EditText edtxtPass2 = null;
    public EditText edtxtRepPass = null;
    public EditText edtxtMail = null;


    public LinearLayout activity_layout1=null;
    public LinearLayout activity_layout2=null;

    public Button btnLogin=null;
    public Button btnRegistrarse=null;

    public Button btnAceptar=null;
    public Button btnCancelar=null;


    public void init_buttons() {
        btnListener=new ButtonListeners(this);

        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnRegistrarse = (Button) findViewById(R.id.btnRegistrarse);

        btnAceptar = (Button) findViewById(R.id.btnAceptar);
        btnCancelar = (Button) findViewById(R.id.btnCancelar);

        btnLogin.setOnClickListener(btnListener);
        btnRegistrarse.setOnClickListener(btnListener);

        btnAceptar.setOnClickListener(btnListener);
        btnCancelar.setOnClickListener(btnListener);


    }

    public void init_text(){
        edtxtUsuario=(EditText) findViewById(R.id.edtxtUsuario);
        edtxtPass=(EditText) findViewById(R.id.edtxtPass);

        edtxtUsuario2=(EditText) findViewById(R.id.edtxtUsuario2);
        edtxtPass2=(EditText) findViewById(R.id.edtxtPass2);
        edtxtRepPass=(EditText) findViewById(R.id.edtxtRepPass);
        edtxtMail=(EditText) findViewById(R.id.edtxtMail);


    }

    public void initLayouts(){

        activity_layout1=(LinearLayout)findViewById(R.id.activity_layout1);
        activity_layout2=(LinearLayout)findViewById(R.id.activity_layout2);

    }

    public void cambiarPagRegistrarse() {
        activity_layout1.setVisibility(View.GONE);
        activity_layout2.setVisibility(View.VISIBLE);
    }

    public void cambiarPagLogin(){
        Intent intent = new Intent(getBaseContext(),Activity2.class);
        startActivity(intent);
        finish();
    }

    public void botonAceptar(){
        if (edtxtPass2.getText() == edtxtRepPass.getText() ){
            edtxtRepPass.setHighlightColor(Color.RED);
        }else{
            activity_layout1.setVisibility(View.VISIBLE);
            activity_layout2.setVisibility(View.GONE);
        }

    }

    public void botonCancelar(){
        activity_layout1.setVisibility(View.VISIBLE);
        activity_layout2.setVisibility(View.GONE);
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
