package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(isPalindrome(-79));
        System.out.println(isPalindrome(266));
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(5));
        System.out.println(numberToWords(798));
        System.out.println(numberToWords(286));

    }

    public static boolean isPalindrome(int sayi){
        String strSayi = String.valueOf(Math.abs(sayi));
        String tersSayi = new StringBuilder(strSayi).reverse().toString();
        if(strSayi.equals(tersSayi)){
            return true;
        }else{
            return false;
        }
    }
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
    public static String numberToWords(int sayi){
        if(sayi < 0){
            System.out.println("invalid Value");
        }
        if(sayi == 0){
            System.out.println("Zero");
        }

        String sayiStr = String.valueOf(sayi);
        StringBuilder sonuc = new StringBuilder();

        for(int i = 0; i<sayiStr.length();i++){
            char rakam = sayiStr.charAt(i);

            switch (rakam) {
                case '0':
                    sonuc.append("Zero");
                    break;
                case '1':
                    sonuc.append("One");
                    break;
                case '2':
                    sonuc.append("Two");
                    break;
                case '3':
                    sonuc.append("Three");
                    break;
                case '4':
                    sonuc.append("Four");
                    break;
                case '5':
                    sonuc.append("Five");
                    break;
                case '6':
                    sonuc.append("Six");
                    break;
                case '7':
                    sonuc.append("Seven");
                    break;
                case '8':
                    sonuc.append("Eight");
                    break;
                case '9':
                    sonuc.append("Nine");
                    break;
            }
            if (i < sayiStr.length() - 1) {
                sonuc.append(" ");
            }
        }
        return sonuc.toString();
    }
}
