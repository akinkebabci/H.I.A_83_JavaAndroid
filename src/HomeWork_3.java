public class HomeWork_3 {
    public static void main(String[] args) {
        int num1 = 195;
        int num2  = 755;
        int[] arr = {0,0,0};
        int[] arr2 = {0,0,0};
        int resul = 0;
        for (int i = 0; i < 3; i++) {
            if (num1 % 10 > 0 && (num2 % 10) > 0){
                arr[i] = num1 % 10;
                arr2[i] = num2 % 10;
                num1 /= 10;
                num2 /=10;
            }
            if(arr[i] == arr2[i]){
                System.out.println("Ortak Basamak Değeri !...");
                }
            }
    }
}
