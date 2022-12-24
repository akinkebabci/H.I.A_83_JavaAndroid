public class Question_1 {
    public static void main(String[] args) {
        int[] myArr = {4, 7, 8, 10, 11};
        int result = findUnderCountNumber(myArr);
        System.out.println(result);
    }

    static int findUnderCountNumber(int[] arr) {
        int foundNum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == foundNum) {

                foundNum = arr[i];
                foundNum++;

            }
        }
        return foundNum;

    }
}