public class Question_2 {
    public static void main(String[] args) {
        int[] myArr = {8, 5, 7, 12, 11};

        int[] newArray = scrollRigthIndex(myArr);

        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }


    }

    static int[] scrollRigthIndex(int[] arr) {
        int[] newArray = arr;
        int firstIndex = newArray[0];
        newArray[0] = newArray[newArray.length - 1];
        newArray[newArray.length - 1] = firstIndex;
        return newArray;


    }
}
