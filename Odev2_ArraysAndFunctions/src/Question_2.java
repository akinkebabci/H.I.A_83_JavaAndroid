

public class Question_2 {
    public static void main(String[] args) {
        int[] myArr = {8, 5, 7, 12, 15,78,54};

        int[] newArray = scrollRigthIndex(myArr);
    }

    static int[] scrollRigthIndex(int[] arr) {

        int[] newArray = new int[arr.length];

        for (int i = 0; i < arr.length-1; i++) {
            newArray[i+1] = arr[i];
            newArray[0] = arr[arr.length-1];

        }

        return newArray;


    }
}
