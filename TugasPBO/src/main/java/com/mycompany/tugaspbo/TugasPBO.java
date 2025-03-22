package com.mycompany.tugaspbo;

class Lingkaran {
    public double radius;

    // Constructor untuk menginisialisasi radius
    public Lingkaran(double r) {
        this.radius = r;
    }

    // Method untuk menghitung luas (π * r^2)
    public double luas() {
        return Math.PI * this.radius * this.radius;
    }

    // Method untuk menghitung keliling (2 * π * r)
    public double keliling() {
        return 2 * Math.PI * this.radius;
    }

    // Method untuk menghitung diameter (2 * r)
    public double diameter() {
        return 2 * this.radius;
    }

    // Method untuk memperbesar radius sebanyak n kali
    public void perbesar(double n) {
        this.radius *= n;
    }
}

public class TugasPBO {
    public static void main(String[] args) {
        // Membuat objek lingkaran dengan radius 5
        Lingkaran lingkaran = new Lingkaran(5);

        // Menampilkan informasi awal
        System.out.println("Radius awal: " + lingkaran.radius);
        System.out.println("Luas: " + lingkaran.luas());
        System.out.println("Keliling: " + lingkaran.keliling());
        System.out.println("Diameter: " + lingkaran.diameter());

        // Memperbesar radius sebanyak 2 kali
        lingkaran.perbesar(2);
        System.out.println("\nSetelah diperbesar 2x:");
        System.out.println("Radius baru: " + lingkaran.radius);
        System.out.println("Luas baru: " + lingkaran.luas());
        System.out.println("Keliling baru: " + lingkaran.keliling());
        System.out.println("Diameter baru: " + lingkaran.diameter());
    }
}