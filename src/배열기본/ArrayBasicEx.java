package 배열기본;

public class ArrayBasicEx {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 85;
        arr[1] = 100;
        arr[2] = 67;
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + "");
        }
        System.out.println();
        for (int e : arr){
            System.out.println(e + "");
        }
        }
    }

