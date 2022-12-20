public class HomeWork_4 {
    public static void main(String[] args) {
/*
        - Son kısmında elimizde bir integer sayı olacak arkadaşlar.
        Ve bizde bu sayının asal olup olmadığını bulmaya çalışacağız.
        Eğer sayı asal değil ise sayı asal değildir şeklinde bir mesaj yazacağız.
        Eğer asal ise bir şey yazdırmamıza gerek yoktur. (Burada break kullanmanızı bekliyorum)
*/

        int num = 9;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("sayı asal değil...");
                break;
            }

        }
    }
}
