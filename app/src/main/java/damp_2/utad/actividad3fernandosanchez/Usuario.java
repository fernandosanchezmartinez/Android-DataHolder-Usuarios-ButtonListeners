package damp_2.utad.actividad3fernandosanchez;

/**
 * Created by fernando.sanchez on 30/10/2015.
 */
public class Usuario {

    private String nombre;
    private String pass;
    private String correo;

    public Usuario(String nombre, String pass, String correo ){
        this.nombre= nombre;
        this.pass= pass;
        this.correo= correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
