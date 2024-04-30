package src;
//자바 사용법//
public class start {
    public static void main(String[] args) { //클래스 내 main 함수 생성 psvm이라 적고 엔터치면 자동으로 생성된다.(단축키)
        System.out.println("Hello World"); //단축키(sout 엔터)
        System.out.println(12);
        System.out.println(-34);
        System.out.println(3.14);
        System.out.println(true);
        System.out.println(false);
        System.out.println(123 + 345);

        int hour = 15;
        double score = 90.5;
        char grade = 'A';
        boolean pass = false;
        float f = 3.14F; //float형은 F를 붙여줘야 한다.
        long l = 100000000000L; //long 형도 마찬가지 int는 21억까지
        l = 1_000_000_000_000L; // 위에와 같은 의미이지만 이렇게 가시성 좋게 만들 수도 있다.
        String name; //변수 선언
        name = "김규일"; // 변수 정의
        System.out.println(name + " 자바 진짜못해 " + hour + "년은 더 공부해야겠네"); // 변수 + 문자열 출력

    }

}
