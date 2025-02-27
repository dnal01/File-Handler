package app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static private double balance;

    public static void main(String[] args) {
        setBalance(1000.00);

        try {
            validateAmount(getBalance(), getAmount());
        }   catch (InputMismatchException e) {
            System.out.printf("The input %s is invalid.", e.getMessage());
        }
    }

    public static double getBalance() {
        return balance;
    }

    public static void setBalance(double balance) {
        Main.balance = balance;
    }

    public static double getAmount() throws InputMismatchException {
        System.out.printf("Balance is USD %.2f." + "%nEnter purchase amount, USD: ", getBalance());
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    private static void validateAmount(double balance, double withdrawal) {
        try {
            if (withdrawal > balance) {
                throw new FundsException("Insufficient funds!");
            }
            else {
                balance = getBalance(balance, withdrawal);
                System.out.printf("Funds are OK. Purchase paid." + "%nBalance is USD %.2f", balance);
            }
        } catch (FundsException e) {
            System.out.println(e.getMessage());
        }
    }

    private static double getBalance(double balance, double withdrawal) {
        return balance - withdrawal;
    }
}
