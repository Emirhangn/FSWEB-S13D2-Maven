package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(isPalindrome(-79));
        System.out.println(isPalindrome(266));
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(5));

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
    public static boolean isPerfectNumber(int sayi){
        if(sayi<0){
            return false;
        }

        if (sayi <=1){
            return false;
        }

        int toplam = 1;

        for(int i = 2; i < sayi; i++){
            if(sayi % i == 0){
                toplam += i;
            }
        }
        return toplam == sayi;
    }
}
