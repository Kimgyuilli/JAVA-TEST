package cond;

public class switch4 {
    public static void main(String[] args) {
        int grade = 1;

        int coupon = switch (grade){
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };
        System.out.println("coupon = " + coupon);
    }
}
