
public class main {
    public static void main(String argv[])
    {

        double stipendio;
        lavoratore l1 = new lavoratore("Luca","Abete");
        stipendio=l1.stipendio(29);
        System.out.println("Lo stipendi di "+l1.getCognome()+" è di: €"+stipendio);

        capo c1 = new capo("Giacchino","Belli");
        stipendio=c1.stipendio(29);
        System.out.println("Lo stipendi di "+c1.getCognome()+" è di: €"+stipendio);

        fattorino f1 = new fattorino("Fred","Marcelli");
        stipendio=f1.stipendio(29);
        System.out.println("Lo stipendi di "+f1.getCognome()+" è di: €"+stipendio);

        impiegato i1 = new impiegato("Mario","Blu");
        stipendio=i1.stipendio(29);
        System.out.println("Lo stipendi di "+i1.getCognome()+" è di: €"+stipendio);


    }
}
