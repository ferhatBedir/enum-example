package com.company;

public enum Fruits {

    ELMA,
    ARMUT,
    KARPUZ,
    KAVUN,
    ERIK;

    private int kg;
    private String uretimYeri;
    private int price;

    Fruits() {
    }

    Fruits(int kg, String uretimYeri, int price) {
        this.kg = kg;
        this.uretimYeri = uretimYeri;
        this.price = price;
    }

    public int getKg() {
        return kg;
    }

    public void setKg(int kg) {
        this.kg = kg;
    }

    public String getUretimYeri() {
        return uretimYeri;
    }

    public void setUretimYeri(String uretimYeri) {
        this.uretimYeri = uretimYeri;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    int totalPrice(int kg, int price) {
        return kg * price;
    }
}
