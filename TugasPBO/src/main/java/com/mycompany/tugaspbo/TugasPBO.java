package com.mycompany.tugaspbo;

class Lingkaran {
    public double radius;

    public Lingkaran(double r) {
        this.radius = r;
    }

    public double luas() {
        return Math.PI * this.radius * this.radius;
    }

    public double keliling() {
        return 2 * Math.PI * this.radius;
    }

    public double diameter() {
        return 2 * this.radius;
    }

    public void perbesar(double n) {
        this.radius *= n;
    }
}

public class TugasPBO {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran(5);

        System.out.println("Radius awal: " + lingkaran.radius);
        System.out.println("Luas: " + lingkaran.luas());
        System.out.println("Keliling: " + lingkaran.keliling());
        System.out.println("Diameter: " + lingkaran.diameter());

        lingkaran.perbesar(2);
        System.out.println("\nSetelah diperbesar 2x:");
        System.out.println("Radius baru: " + lingkaran.radius);
        System.out.println("Luas baru: " + lingkaran.luas());
        System.out.println("Keliling baru: " + lingkaran.keliling());
        System.out.println("Diameter baru: " + lingkaran.diameter());
    }
}