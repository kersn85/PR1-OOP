package org.campus02;

public class Car {
    public String manufacturer;
    public String colour;
    public int horsePower;
    public String model;
    public String fuel;
    public int year;
    public int currentGear;

    public int getCurrentGear()
    {
        return currentGear;
    }

    public void setYear(int year)
    {
        if (year >= 2000 && year <= 2030)
            this.year = year;
        else
            System.out.println("Fehler, nicht erlaubt");
    }

    public void setCurrentGear(int newGear)
    {
        if (newGear <= 7 && newGear >= 1) {
            currentGear = newGear;
        }
        else {
            System.out.println("Falscher Wert: " + newGear
                    + " nicht erlaubt");
        }
    }
}
