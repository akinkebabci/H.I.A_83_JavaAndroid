public class Circle {
    private final static double pi = 3.14f;
    private double radius;

    public Circle(double radius) {
        if (radius < 0) {
            radius = 0;
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public static double calculateArea(double radius) {
        return pi * (radius * radius);
    }

    public static double calculateEnvironment(double radius) {
        return 2 * pi * radius;
    }

    public void showInfo() {
        System.out.println("Şeklimiz : " + "Çemberdir");
        System.out.println("Şeklimizin Özellikleri ve Bunların Değerleri");
        System.out.println("Yarı Çapı : " + this.radius);
        System.out.println("Şeklimizin Alanı : " + calculateArea(this.radius));
        System.out.println("Şeklimizin Çevresi : " + calculateEnvironment(this.radius));

    }
}
