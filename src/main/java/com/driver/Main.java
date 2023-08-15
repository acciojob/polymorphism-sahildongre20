package com.driver;

public class Main {

    public static class Product {
        public int product(int x, int y) {
            return x*y;
        }

        public int product(int x, int y, int z) {
            return x*y*z;
        }

        public double product(double x, double y) {
            return x*y;
        }
    }

    public static void main(String[] args) {
        Product p = new Product();
        int p1 = p.product(1, 2);
        int p2 = p.product(1, 2, 3);
        double p3 = p.product(1.0, 2.0);

//        System.out.print(p1 + " " + p2 + " " + p3);
    }

}