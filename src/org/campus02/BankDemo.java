package org.campus02;

public class BankDemo {

    public static void main(String[] args) {
        Konto kontoVonSusi = new Konto();

        kontoVonSusi.setInhaber("Susi");
        kontoVonSusi.print();
        kontoVonSusi.aufbuchen(1000);
        kontoVonSusi.print();
        kontoVonSusi.abbuchen(800);
        kontoVonSusi.print();
        kontoVonSusi.abbuchen(200);
        kontoVonSusi.print();
    }
}
