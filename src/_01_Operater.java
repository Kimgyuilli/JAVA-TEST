package src;

import javax.jws.soap.SOAPBinding;

public class _01_Operater {
    public static void main(String[] args) {
        //산술 연산자

        //일반 연산자
        System.out.println(4+2); //6
        System.out.println(4-2); //2
        System.out.println(4*2); //8
        System.out.println(4/2); //2
        System.out.println(5/2); //2 소숫점 반영 x
        System.out.println(5%2); //1

        //우선순위 연산
        System.out.println(2+2*2); //6 *연산 우선
        System.out.println((2+2)*2); //8

        int a = 20;
        int b = 10;
        int c;
        c = a+b;
        System.out.println(c); //30

        c = a - b;
        System.out.println(c); //10
        c = a * b;
        System.out.println(c); // 200
        c = a / b;
        System.out.println(c); // 2
        c = a % b;
        System.out.println(c); // 0

        // 증감연산
        int val = 10;
        System.out.println(val); //10
        System.out.println(++val); //11
        System.out.println(val++); //11
        System.out.println(val); //12

        val = 10;
        System.out.println(val); //10
        System.out.println(--val); //9
        System.out.println(val--); //9
        System.out.println(val); //8

        // 대입연산자
        int num = 10;
        num = num + 2;
        System.out.println(num); //12
        num = num - 2;
        System.out.println(num); // 10
        num = num * 2;
        System.out.println(num); // 20
        num = num / 2;
        System.out.println(num); // 10
        num = num % 2;
        System.out.println(num); // 0

        // 복합 대입 연산자
        num = 10;
        num += 2;
        System.out.println(num); //12
        num -= 2;
        System.out.println(num); //10
        num *= 2;
        System.out.println(num); //20
        num /= 2;
        System.out.println(num); //2
        num %= 2;
        System.out.println(num); //0

        // 비교 연산자
        System.out.println(5 > 3); //true
        System.out.println(5 < 3); //false
        System.out.println(5 >= 3); //true
        System.out.println(5 <= 3); //false
        System.out.println(5 == 3); //false
        System.out.println(5 == 5); //true
        System.out.println(5 != 5); //false
        System.out.println(5 != 3); //true

        //논리 연산자
        boolean 수학 = true;
        boolean 과학 = true;
        boolean 영어 = false;
        System.out.println(수학 || 과학 || 영어); //true
        System.out.println(수학 && 과학 && 영어); //false

        System.out.println(!true); //false
        System.out.println(!false); //true

        //삼항 연산자
        //결과 = (조건) ? (참) : (거짓)
        int x = 5;
        int y = 3;
        int max = (x > y) ? x : y;
        System.out.println(max); //5
        //














    }
}
