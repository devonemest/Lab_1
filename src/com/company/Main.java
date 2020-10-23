package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(integralTrapec(0, 2, x -> { return Math.pow(x, 2) + (Math.sin(2*x)) + x - 3; }));
        more();
    }
    // h - шаг по х
    // i - количество разбиений
    public static double integralTrapec(double a, double b, Function function){
        double A=0;
        double h=0.001;
        for (int i=0; i<(b-a)/h; i++){
            A += h * (0.5 * (function.func(a + i * h)+function.func(a+(i+1)*h)));

        }
        return A;
    }
    public static void more(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to restart? If No, print 'exit'!");
        String input = scanner.nextLine();
        if (input.equals("exit")){ }
        else {
            main();
        }
    }

    private static void main() {
        System.out.println(integralTrapec(0, 2, x -> { return Math.pow(x, 2) + (Math.sin(2*x)) + x - 3; }));
        more();
    }

}

interface Function{
    public double func(double x);
}

