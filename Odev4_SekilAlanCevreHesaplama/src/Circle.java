public class Circle {
    public final static double PI = Math.PI;
    private double radius;

    public Circle(double radius) {
        if (radius < 0) {
            radius = 1;
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateArea() {
        return PI * (radius * radius);
    }

    public double calculateEnvironment() {
        return 2 * PI * radius;
    }

    public void showInfo() {
        System.out.println("Şeklimiz : " + "Çemberdir");
        System.out.println("Şeklimizin Özellikleri ve Bunların Değerleri");
        System.out.println("Yarı Çapı : " + this.radius);
        System.out.println("Şeklimizin Alanı : " + calculateArea());
        System.out.println("Şeklimizin Çevresi : " + calculateEnvironment());

    }
}
