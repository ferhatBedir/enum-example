package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı girşi yapınız..");
        long x = Long.parseLong(scanner.nextLine());

        for (int i = 1; i <= x; i++) {
            for (Months m : Months.values()) {
                System.out.println(Months.valueOf(m.name()));
                Thread.sleep(200);
            }
            System.out.println(i + " Kez yazdırıldı.");
            System.out.println();
            Thread.sleep(5000);
        }
        System.out.println();
        System.out.println(Months.ARALIK);
        System.out.println(Months.ARALIK.getMonth());
        System.out.println();


        for (Fruits f : Fruits.values()) {
            System.out.println(f);
            Thread.sleep(200);
        }
        int price = Fruits.ARMUT.totalPrice(3, 4);
        System.out.println(Fruits.valueOf("ARMUT") + " " + price + " TL");

        Fruits.ELMA.setKg(1);
        Fruits.ELMA.setPrice(2);
        Fruits.ELMA.setUretimYeri("Amasya");

        System.out.println(Fruits.ELMA.ordinal() + 1); //enum sınıfı ıcerısınde lıstede kacıncı sırada oldugunu gosteriyor.



    }
}
