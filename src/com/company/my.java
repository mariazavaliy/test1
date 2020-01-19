    package com.company;

    import java.util.Scanner;

    class Main {

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        if (foo(a))
            System.out.println ("False!!!");
        else
            System.out.println ("True!!!");
    }

    static boolean foo (int a ) {
        int b = 3;
        int c = a % b;
       return c != 0;
    }

}