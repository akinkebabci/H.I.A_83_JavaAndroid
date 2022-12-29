import java.util.Arrays;

public class Question_2 {
    public static void main(String[] args) {
        int[] myArr = {8, 5, 7, 12, 15,78,54};

        int[] newArray = scrollRigthIndex(myArr);

    }

    static int[] scrollRigthIndex(int[] arr) {

        int[] newArray = new int[arr.length];

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < i ; j++) {
                newArray[i] = arr[j];
                newArray[0] = arr[arr.length-1];
            }
        }

        return newArray;


    }
}
