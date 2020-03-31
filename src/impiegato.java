
public class impiegato extends lavoratore{

    public impiegato(String n, String c){
        super(n,c);
    }

    @Override public double stipendio(int giorni)
    {   int guadagno
        int rgiornaliera=50+1000;
        guadagno=(rgiornaliera*giorni)+(10*giorni);
        return guadagno;
    }

}
