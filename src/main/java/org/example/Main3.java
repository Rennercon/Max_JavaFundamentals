package org.example;

public class Main3 {
    // Atributes
    static float kg = 1;
    static float funt = 1;
    static float km = 1;
    static float mi = 1;


    //Konstructor


    public static void main(String[] args) {
        // Output on display
        Integer[] lol = new Integer[4];
        lol[0] = 1;
        lol[1] = 2;
        lol[2] = 3;
        lol[3] = 4;
        printArray(lol);
        System.out.println("Фунты: " + Main3.toFunt(kg));
        System.out.println("Кг: " + Main3.toKg(funt));
        System.out.println("Км: " + Main3.toKm(mi));
        System.out.println("Миль:" + Main3.toMi(km));

    }

    // Metods:
    // Convert kg to pounds
    public static double toFunt(float kg) {
        return (kg * 2.205f);
    }

    // Pounds to kg
    public static double toKg(float funt) {
        return funt / 2.205f;
    }

    // miles to km
    public static double toKm(float mi) {
        return mi / 1.609f;
    }

    //km to miles
    public static double toMi(float km) {
        return km * 1.609f;
    }

    // output all values in the array
    public static void printArray(Integer[] arr) {
        for (int i : arr) {
            System.out.println(i + " ");
        }

    }
}