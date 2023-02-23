package Rimador;

import java.util.Scanner;

public class NouPc {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introdueix el preu i el sou (preu sou)");
        float preu = keyboard.nextInt();
        float sou = keyboard.nextInt();

        System.out.println(NouPc.calcularDies(preu, sou));

    }
    public static int calcularDies(float preu, float sou){
        int dies;

        dies = Math.round(preu/(sou/30));

        return dies;
    }
}
