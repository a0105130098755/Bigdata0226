package 메모리구조;

public class Memorymap {
    public static void main(String[] args) {
        int age = 25;
        String name = "곰돌이사육사";
        String name2 = new String("달빛사냥꾼");

        int[] inrArray = null;
        String name3 = null;
        Integer jobs = null;

        String strVal1 = "나희도";
        String strVal2 = new String("나희도");
        String strVal3 ="나희도";

        if (strVal1 == strVal3){
            System.out.println("참조 타입의 주소가 같음을 의미");

        }else{
            System.out.println("참조 타입의 주소가 다름을 의미");
        }

        if (strVal1.equals((strVal2))){
            System.out.println("참조 타입의 주소가 같음을 의미");
        }else{
            System.out.println("참조 타입의 주소가 다름을 의미");
        }
    }
}
