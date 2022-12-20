public class HomeWork_3 {
    public static void main(String[] args) {
        /*Üçüncü kısımda elimizde iki tane integer değişkenimiz olacak ve bunların değeri 3 basamaklı
        herhangi bir sayı olacaktır. Sizden beklediğim bu sayıların aynı basamağında aynı rakam varsa
        ekrana ortak rakam vardır şeklinde bir şey yazdırmanızdır. Yoksa bir şey yazdırmanıza gerek
        yoktur.
                Mesela sayılar 112 ve 215 olsun bunların onlar basamağında aynı rakam olduğu için ekrana
        mesaj yazacaktır. Sayılarımız 304 ve 213 olduğunda aynı basamaklara denk gelen aynı rakam
        olmadığı için mesajı yazmayacaktır.
        */

        int num1 = 489;
        int num2 = 375;
        int result = 0;
        int result2 = 0;

        while (num1 != 0 && num2 != 0) {
            result = num1 % 10;
            result2 = num2 % 10;
            if (result == result2) {
                System.out.println("Ortak Rakam Bulundu..!");
            }
            num1 = num1 / 10;
            num2 = num2 / 10;

        }

    }
}
