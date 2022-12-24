
public class Question_4 {
    public static void main(String[] args) {
        int[] myArr = {6, 8, 9,10,11};
        int[] result = findUnderCountNumber(myArr);

    }

    static int[] findUnderCountNumber(int[] arr) {
        int foundNum = arr[0];
        int indexNum = 0;
        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == foundNum) {
                newArr[i] = arr[i];

                indexNum = i +1;
                foundNum = arr[i];
                foundNum++;
            }
        }
        newArr[indexNum] = foundNum;

        for (int i = indexNum + 1; i <= arr.length; i++) {
            newArr[i] = arr[i - 1];
        }
        return newArr;
    }
}
