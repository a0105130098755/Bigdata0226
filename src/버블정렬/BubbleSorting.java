package 버블정렬;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] arr = {9,4,5,8,2,8,9,87,6,9};
        int tmp = 0;
        for (int i =0; i< arr.length; i++){
            for (int j = i; j < arr.length; j++){
                if (arr[i]<arr[j]){
                    tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
        for (int e : arr) System.out.print(e + " ");
    }
}
