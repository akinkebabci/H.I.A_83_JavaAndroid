public class Triangle {
    private int firstSteepEdge;
    private int secondSteepEdge;

    public Triangle(int firstSteepEdge, int secondSteepEdge) {
        if (firstSteepEdge < 0 || secondSteepEdge < 0) {
            firstSteepEdge = 0;
            secondSteepEdge = 0;
        }
        this.firstSteepEdge = firstSteepEdge;
        this.secondSteepEdge = secondSteepEdge;
    }

    public int getFirstSteepEdge() {
        return firstSteepEdge;
    }

    public int getSecondSteepEdge() {
        return secondSteepEdge;
    }

    public static int calculateArea(int x, int y) {
        return (x * y) / 2;
    }

    public static int calculateEnvironment(int x, int y) {
        return x + y + Math.abs((x * 2) + (y * 2));
    }

    public void showInfo() {
        System.out.println("Şeklimiz : " + "Dik Üçgendir");
        System.out.println("Şeklimizin Özellikleri ve Bunların Değerleri");
        System.out.println("Birinci Dik Kenarı : " + this.firstSteepEdge + " , İkinci Dik Kenarı : " + this.secondSteepEdge);
        System.out.println("Şeklimizin Alanı : " + calculateArea(this.firstSteepEdge, this.secondSteepEdge));
        System.out.println("Şeklimizin Çevresi : " + calculateEnvironment(this.firstSteepEdge, this.secondSteepEdge));

    }
}
