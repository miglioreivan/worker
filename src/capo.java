
public class capo extends lavoratore{

    public capo(String n, String c)
    {
        super(n,c);
    }
@Override
public double stipendio(int giorni)
{   int guadagno;
    int rgiornaliera=50;
    guadagno=rgiornaliera*giorni+1000;
    return guadagno;
}
}
