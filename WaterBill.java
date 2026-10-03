 import java.util.Scanner;
 public class WaterBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Water Consumption: ");
        int WaterConsumption = scanner.nextInt();
        if (WaterConsumption<=500) {
            System.out.println("The Water Bill is " + 100);}
            else {
                System.out.println("The Water Bill is " + 200);
            }
        }

    }
