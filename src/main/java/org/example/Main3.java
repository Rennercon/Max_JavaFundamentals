package org.example;

public class Main3 {
    // Атрибуты
    static float kg = 1;
    static float funt = 1;
    static float km = 1;
    static float mi = 1;


    //Конструктор


    public static void main(String[] args) {
        // Вывод на экран
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

    // Методы:
    // Перевод кг в фунты
    public static double toFunt(float kg) {
        return (kg * 2.205f);
    }

    // Фунты в кг
    public static double toKg(float funt) {
        return funt / 2.205f;
    }

    // мили  в км
    public static double toKm(float mi) {
        return mi / 1.609f;
    }

    //км в мили
    public static double toMi(float km) {
        return km * 1.609f;
    }

    // вывод всех значений в массиве
    public static void printArray(Integer[] arr) {
        for (int i : arr) {
            System.out.println(i + " ");
        }

    }
}