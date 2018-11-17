package org.campus02;

public class Konto {
    public String inhaber;
    public double kontostand;

    public void setInhaber(String inhaber)
    {
        this.inhaber = inhaber;
        this.kontostand = 0;
        // kontostand = 0;
    }

    public double aufbuchen(double betrag)
    {
        this.kontostand = this.kontostand + betrag;
        return kontostand;
       // kontostand += betrag;
    }

    public void abbuchen(double betrag)
    {
        if (kontostand - betrag >= 0)
        {
            kontostand = kontostand - betrag;
            //kontostand -= betrag;
        }
    }

    public void print()
    {
        System.out.println(this.inhaber + "; Kontostand: "
                + this.kontostand);
    }
}
