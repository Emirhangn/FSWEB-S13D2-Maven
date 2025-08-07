package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(isPalindrome(-79));

    }

    public static boolean isPalindrome(int sayi){
        String strSayi = String.valueOf(Math.abs(sayi));
        String tersSayi = new StringBuilder(strSayi).reverse().toString();
        if(strSayi.equals(tersSayi)){
            return true;
        }else{
            return false;
        }
    };
}
