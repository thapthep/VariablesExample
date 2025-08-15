import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("height: ");
        float height = scanner.nextFloat();
        System.out.println("weight: ");
        float weight = scanner.nextFloat();
        float BMI = weight / (height * height);
        System.out
                .println(
                        "your BMI for weight = " + weight + "kg and height = " + height + "meters is :" + BMI
                                + "bmi");
        scanner.close();
    }
}
