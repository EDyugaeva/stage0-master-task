package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for (int i = 0; i < cathetusLength; i++) {
            for (int j = 0; j < cathetusLength*2 - 1; j++) {
                if (j == cathetusLength - 1) {
                    System.out.print(1);
                }
                else if (j >= Math.abs(cathetusLength- i - 1) && j < cathetusLength) {
                    System.out.print(Math.abs(j - cathetusLength));
                }
                else if (j <= Math.abs(cathetusLength+i-1)&& j >= cathetusLength) {
                    System.out.print(Math.abs(j - cathetusLength+2));
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(6);
    }

}
