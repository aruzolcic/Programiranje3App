package ffos.aruzolcic_19.proizvodaciautomobila;

public class ProizvodaciAutomobila {


    private int sifra;
    private String markaAutomobila;
    private String proizvodac;
    private String sjediste;
    private String opis;

    public ProizvodaciAutomobila(int sifra, String markaAutomobila, String proizvodac, String sjediste, String opis) {
        this.sifra = sifra;
        this.markaAutomobila = markaAutomobila;
        this.proizvodac = proizvodac;
        this.sjediste = sjediste;
        this.opis = opis;
    }

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public String getMarkaAutomobila() {
        return markaAutomobila;
    }

    public void setMarkaAutomobila(String markaAutomobila) {
        this.markaAutomobila = markaAutomobila;
    }

    public String getProizvodac() {
        return proizvodac;
    }

    public void setProizvodac(String proizvodac) {
        this.proizvodac = proizvodac;
    }

    public String getSjediste() {
        return sjediste;
    }

    public void setSjediste(String sjediste) {
        this.sjediste = sjediste;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }
}
