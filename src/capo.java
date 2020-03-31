
public class capo extends lavoratore{

    public capo(String n, String c){
        super(n,c);
    }

    @Override public double stipendio(int giorni)
    {   int guadagno;
        int rgiornaliera=50+1000;
        guadagno=rgiornaliera*giorni;
        return guadagno;
    }

}
