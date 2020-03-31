
public class fattorino extends lavoratore{

    public fattorino(String n, String c){
        super(n,c);
    }
    @Override
    public double stipendio(int giorni)
    {   int guadagno;
        int rgiornaliera=50;
        guadagno=(rgiornaliera*giorni)/2;
        return guadagno;
    }
}
