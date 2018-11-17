package org.campus02;

public class Main {

    public static void main(String[] args) {

        String name = "Susi Sorglos";

        Car porsche911 = new Car();
        porsche911.colour = "blue";
        porsche911.horsePower = 320;
        porsche911.fuel = "Diesel";
        porsche911.manufacturer = "Porsche";
        porsche911.model = "911";
        porsche911.year = 2018;

        Car golf = new Car();
        golf.colour = "white";
        golf.horsePower = 90;
        golf.fuel = "Diesel";
        golf.manufacturer = "VW";
        golf.model = "Golf VII";
        golf.year = 2017;

        System.out.println(porsche911.model);
        System.out.println(golf);
        System.out.println(porsche911);

    }
}
