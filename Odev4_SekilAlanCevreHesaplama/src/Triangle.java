public class Triangle {
    private int firstSteepEdge;
    private int secondSteepEdge;

    public Triangle(int firstSteepEdge, int secondSteepEdge) {
        if (firstSteepEdge < 0) {
            firstSteepEdge = 1;

        }
        if (secondSteepEdge < 0){
            secondSteepEdge = 1 ;
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

    public int calculateArea() {
        return (this.firstSteepEdge * this.secondSteepEdge) / 2;
    }

    public double calculateEnvironment() {
        return (this.firstSteepEdge + this.secondSteepEdge) + Math.sqrt((this.firstSteepEdge*this.firstSteepEdge) + (this.secondSteepEdge * this.secondSteepEdge));
    }

    public void showInfo() {
        System.out.println("Şeklimiz : " + "Dik Üçgendir");
        System.out.println("Şeklimizin Özellikleri ve Bunların Değerleri");
        System.out.println("Birinci Dik Kenarı : " + this.firstSteepEdge + " , İkinci Dik Kenarı : " + this.secondSteepEdge);
        System.out.println("Şeklimizin Alanı : " + calculateArea());
        System.out.println("Şeklimizin Çevresi : " + calculateEnvironment());

    }
}
