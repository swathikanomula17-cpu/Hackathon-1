import java.util.Scanner;
class Usage {
    static int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter morning usage and evening usage:");

        int morningUsage = sc.nextInt();
        int eveningUsage = sc.nextInt();

        int total = calculateTotal(morningUsage, eveningUsage);

        System.out.println(total);
    }
}