package org.campus02;

public class DemoPerson {

    public static void main(String[] args) {
        Person susi = new Person();
        susi.alter = 23;
        susi.nachname = "Sorglos";
        susi.vorname = "Susi";

        Person max = new Person();
        max.alter = 33;
        max.vorname = "Maxi";
        max.nachname = "Muster";

        print(susi);
        print(max);
    }

    public static void print(Person p)
    {
        System.out.println(p.vorname + " " + p.nachname + ", " + p.alter);

    }

}
