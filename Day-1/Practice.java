import java.util.Scanner;

class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal (p): ");
        double p = sc.nextDouble();
        System.out.print("Enter Rate of Interest (r): ");
        double r = sc.nextDouble();
        System.out.print("Enter Time (t in years): ");
        double t = sc.nextDouble();
        double amount = p * Math.pow((1 + r / 100), t);
        double ci = amount - p;
        System.out.println("Amount = " + amount);
        System.out.println("Compound Interest = " + ci);

        sc.close();
    }
}
