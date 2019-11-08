package com.example.lib;

public class hw2 {
    public  static  void main(String[] argv) {
        java.util.Scanner scanner= new
                java.util.Scanner(System.in);

        System.out.println("birthday Year:");
        int inp1=scanner.nextInt();

        System.out.println("birthday Month:");
        int inp2=scanner.nextInt();

        System.out.println("birthday Day:");
        int inp3=scanner.nextInt();

        System.out.println("Your birthday:"+inp1+"/"+inp2+"/"+inp3);
    }
}