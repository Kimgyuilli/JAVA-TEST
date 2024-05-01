package src;

public class _04_Comment {
    public static void main(String[] args) {
        System.out.println("(10분 전) 잠시 후 강의가 시작 예정입니다"); //ctrl D 해당 줄 복사
        System.out.println("(5분 전) 잠시 후 강의가 시작 예정입니다");
//        System.out.println("지금부터 강의를 시작하겠습니다."); 주석처리 ctrl + /
        int size = 1;
        size = size + 10;
        System.out.println(size);
        size += 10;
        System.out.println(size);
        int key = 10;
        System.out.println(size+key);

        final String KR_COUNTRY_CODE = "+82"; //상수는 final로 사용

        // 형 변환
        // int score = 93 + 3.3; 형변환 오류
        int score = 93;
        System.out.println(score);
        System.out.println((float)score); //float형 형 변환 93.0
        System.out.println((double)score); //double형 형 변환 93.0

        float score_f = 93.3F;
        double score_d = 93.3;
        System.out.println((int)score_f); //93
        System.out.println((int)score_d); //93

        score_d = 93 + 98.8; //암시적 형 변환으로 오류 발생 X
        double score_d2 = score_f;
        // int -> long -> float -> double 순서로  암시적 현변환 가능
        // 숫자를 문자열로
        String s1 = String.valueOf(93);
        System.out.println(s1);
        s1 =  Integer.toString(93);

        int i = Integer.parseInt("93");
        double dd = Double.parseDouble("93.3");
    }
}
