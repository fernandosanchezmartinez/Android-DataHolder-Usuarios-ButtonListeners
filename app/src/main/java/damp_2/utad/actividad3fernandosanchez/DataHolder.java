package damp_2.utad.actividad3fernandosanchez;

/**
 * Created by fernando.sanchez on 30/10/2015.
 */
public class DataHolder {

    private Usuario user;

    private static final DataHolder holder = new DataHolder();

    public Usuario getData(){
        return user;
    }

    public void setData(String data){
        this.user=user;
    }

    public static DataHolder getInstance(){
        return  holder;
    }
}
