public class Question_1 {
    public static void main(String[] args) {
        /*1 - Ödevinizin ilk kısmında amacımız sıfırla yüz arasındaki sayılardan kaç tanesinin elimizdeki bir sayıya tam bölünebildiğini bumak olacaktır.

        Yani bölmeyi test edeceğimiz sayı 7 olsun. 0 ile 100 arasında kaç sayı 7 ye bölünebiliyor bunu döngüler ile bulacağız. Döngüden sonra kaç tane sayının 7’ye bölünebildiğini ekrana yazdıracağız. (7 ‘yi örnek olarak yazdım, 5’e bölünebilen sayıların sayısını bulmak isteyebilirim. Yani bölmeyi test ettiğimiz sayı bir integer değişkende olsun, ben onu değiştirip test edeceğim.)

        Örneğin 15’e bölünebilenlerin sayısını bulmak istediğimde

        15,30,45,60,75,90 sayıları oluyor. Yani 6 sayı olmuş oluyor, Ekrana 6 yazacağız.*/


        int num = 5;
        int counter = 0;

        System.out.print(num + " sayısına " + "Bölünebilen sayılar");
        for (int i = 0; i < 100; i++) {
            if (i % num == 0) {
                System.out.println(i);
                counter++;
            }
        }
        System.out.println("'0' ile '100' arasında '5'e bölünebilen Toplam " + counter + " sayı vardır");

    }
}