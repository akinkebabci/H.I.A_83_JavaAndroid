public class Rectangle {
    private int shortEdge;
    private int longEdge;

    public Rectangle(int shortEdge, int longEdge) {
        if (shortEdge < 0 || longEdge < 0) {
            shortEdge = 0;
            longEdge = 0;
        }
        this.shortEdge = shortEdge;
        this.longEdge = longEdge;
    }

    public int getShortEdge() {
        return shortEdge;
    }

    public int getLongEdge() {
        return longEdge;
    }

    public static int calculateArea(int fistEdge, int secondEdge) {
        return fistEdge * secondEdge;
    }

    public static int calculateEnvironment(int firstEdge, int secondEdge) {
        return (2 * firstEdge) + (2 * secondEdge);
    }

    public void draw(){
        if (this.shortEdge != 0 || this.longEdge != 0 ){
            for (int i = 0; i < this.shortEdge; i++) {
                for (int j = 0; j < this.longEdge; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }else {
            System.out.println("Şekil Çizilemedi...");
        }


    }
    public void showInfo(){
        System.out.println("Şeklimiz : " +"Dikdörtgendir");
        System.out.println("Şeklimizin Özellikleri ve Bunların Değerleri");
        System.out.println("Kısa Kenarı : " + this.shortEdge + " , Uzun Kenarı : " + this.longEdge);
        System.out.println("Şeklimizin Alanı : " + calculateArea(this.shortEdge,this.longEdge));
        System.out.println("Şeklimizin Çevresi : " + calculateEnvironment(this.shortEdge,this.longEdge));
        System.out.println("Şeklimizin GÖrüntüsü : ");
        draw();
    }
}
