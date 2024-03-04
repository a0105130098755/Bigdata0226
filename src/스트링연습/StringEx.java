package 스트링연습;

public class StringEx {
    public static void main(String[] args) {
//        String a = "hello java"; //리트럴 상수
//        String b = new String("b"); //객체 생성
//        String c = new String("b"); // 주소가 다름

     //문자열 내장 메소드 사용
     //문자열 비교
        String a = "Hello";
        String b = "Hello";
        String c = "Hello";
        System.out.println(a.equalsIgnoreCase(c));

        String d = "hello java";
        System.out.println(d.indexOf("java"));
        System.out.println(d.contains("hel"));
        System.out.println(d.charAt(6));
        System.out.println(d.replace("java","python"));
        System.out.println(d.replaceAll("//s",""));
        System.out.println(d.substring(5));
        System.out.println(d.substring(0, 5));
        System.out.println(d.toLowerCase());
        System.out.println(d.toUpperCase());

        String e = " Hello World      ";
        System.out.println(e.trim());
        String time = "12:56:22";
        String[] rst = time.split(":");
        System.out.println(rst[0]+"시"+rst[1]+"분"+rst[2]+"초");

      //  System.out.println("I eat %d apples\n",3);
        String buffer = String.format("I eat %d apples. %d banana",3,5);
        System.out.println(buffer);

        String addr = "Seoul Gangnamgu";
        char[] addrCh = addr.toCharArray();
        for (char ee : addrCh) System.out.print(ee+" ");
    }
}
