public class HomeWork_2 {
    public static void main(String[] args) {
/*
        ikizkenar üçgen çizdireceğiz.(Daha önce yıldızlarla yaptığımıza benzer bir şekilde).
        Elimizde bir kenar uzunluğu olacak. Bizde bu uzunluğa göre yıldızlar yerine sayıları kullanarak üçgen
        çizdireceğiz.

        Yani normalde yıldızlarla 5 kenar uzunluğuna sahip bir üçgen çizdirdiğimizde

        *
        **
        ***
        ****
        *****

        şeklinde bir çıktı olmaktaydı. Bu ödevde sizden beklediğim yıldızlar yerine, şu şekilde

        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15

        seklinde sayılarla ve her sayının arasına bir boşluk koyarak üçgeni çizdirmektir.
        Burada kenar uzunluğu bir integer değişkeni olarak tanımlamanızı bekliyorum, ben test
        ederken bunu değiştirip denemeler yapacağım.
*/
        int num = 22;
        int country = 1;
        for (int i = 1; country < num; i++) {

            for (int j = 1; j <= i ; j++) {
                System.out.print(country++ +" ");

            }
            System.out.println();


        }
    }
}
