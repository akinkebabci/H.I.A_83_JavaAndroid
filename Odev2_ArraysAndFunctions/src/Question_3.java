public class Question_3 {
    public static void main(String[] args) {
        char[] charArr = {'P','c','t','Y'};
        charIndexTranslate(charArr);
    }

    static void charIndexTranslate(char[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]  >= 65 &&  arr[i] <=90 ){
                arr[i] += 32;

            }else {
                arr[i] -= 32;
            }
            System.out.println(arr[i]);
        }
    }
}
