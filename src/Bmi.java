import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("BMIを計算します。");
        System.out.println("身長(m)を入力してください");
        Double high = scanner.nextDouble();

        try {
            if (high > 2.5) {
                throw new RuntimeException();
            }
            System.out.println("体重（kg）入力してください");
            Double weight = scanner.nextDouble();
            System.out.println("BMI = " + weight / (high * high));
        } catch (RuntimeException e) {
            System.out.println("入力可能範囲を超えています。");
            e.printStackTrace();
        } finally {
            System.out.println("計算終了");
        }
    }
}
