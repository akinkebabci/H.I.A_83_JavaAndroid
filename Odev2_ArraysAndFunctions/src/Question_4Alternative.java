import java.util.Arrays;

public class Question_4Alternative {
    public static void main(String[] args) {
        int[] myArr = {6, 7, 8,10,11,12};
        int[] result = findUnderCountNumber(myArr);
        System.out.println(Arrays.toString(result));
    }

    static int[]  findUnderCountNumber(int[] arr){
        int[] newArr = new int[arr.length+1];
        int find = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != newArr[i]){
                newArr[i] = find;
                find++;
            }
            newArr[arr.length] = arr[arr.length-1];

        }
        return newArr;
    }
}
