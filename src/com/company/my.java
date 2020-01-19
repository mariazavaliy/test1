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

        Humans human1 = new Humans();
        Humans human2 = new Humans("Denis");
        Humans human3 = new Humans("Vasja", 25);
        System.out.println (human3.GetName());

    }

    static boolean foo (int a ) {
        int b = 3;
        int c = a % b;
       return c != 0;
    }

}