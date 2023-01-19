import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Rectangle[] rectangles = new Rectangle[2];
        System.out.println("********HOŞGELDİNİZ********");
        int sayac = 0;
        while (true) {

            System.out.print(
                    "Dikdörtgen Hesaplamak İçin \"1\" 'e Basınız\n" +
                            "Üçgen Hesaplamak için \"2\" 'ye Basınız\n" +
                            "Çember Hesaplamak için \"3\" 'e Basınız\n" +
                            "Çıkmak İçin \"4\" 'e Basınız\n\n");
            System.out.println("Lütfen Seçim Yapınız : ");

            String secim = scanner.nextLine().replace(" ", "");

            if (secim.equals("1")) {
                System.out.println("Kenarları Giriniz : ");
                String input = scanner.nextLine().trim();
                String[] values = input.split(" ");
                int firstValues = Integer.parseInt(values[0]);
                int secondValues = Integer.parseInt(values[1]);
                Rectangle rectangle = new Rectangle(firstValues, secondValues);
                rectangle.showInfo();
                if (sayac <= 1) {
                    rectangles[sayac] = rectangle;
                }
                sayac++;

            } else if (secim.equals("2")) {
                System.out.println("Kenarları Giriniz : ");
                String input = scanner.nextLine().trim();
                String[] values = input.split(" ");
                int firstValues = Integer.parseInt(values[0]);
                int secondValues = Integer.parseInt(values[1]);
                Triangle triangle = new Triangle(firstValues, secondValues);
                triangle.showInfo();

            } else if (secim.equals("3")) {
                System.out.println("Yarı Çap Giriniz : ");
                String input = scanner.nextLine().trim();
                double yaricap = Double.parseDouble(input);
                Circle circle = new Circle(yaricap);
                circle.showInfo();

            } else if (secim.equals("4")) {
                for (int i = 0; i < sayac; i++) {
                        rectangles[i].showInfo();
                    }
                System.out.println("**********Hoşçakalın**********");
                break;
                }

                System.out.println("*******************************************");
            }


    }

}
