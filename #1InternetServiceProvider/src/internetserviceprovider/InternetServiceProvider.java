/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internetserviceprovider;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class InternetServiceProvider {

    String packageType;
    double totalTime;
    double extraTime;
    double totalcost;

    public static void main(String[] args) {

        InternetServiceProvider java416 = new InternetServiceProvider();
        java416.perform();

    }

    private String getPackageType() {
        System.out.print("Please input the Package you choose(a,b,c in upper or lower case)");
        Scanner sc = new Scanner(System.in);
        String type;
        String input;
        while (true) {
            input = sc.next();
            type = input.toLowerCase();
            if (type.equals("a") || type.equals("b") || type.equals("c")) {
                break;

            } else {
                System.out.println("Unvalid pacakaget type, please input again ");
            }
            sc.nextLine();

        }
        System.out.println("The pakage you choose is " + type);
        return type;
    }

    private double getTime() {
        System.out.print("Please input how many hour time you use");
        Scanner sc = new Scanner(System.in);
        double time;
        while (true) {
            if (sc.hasNextDouble()) {
                time = sc.nextDouble();
                if (time >= 0 && time <= 744) {
                    break;
                }
            }
            System.out.println("Unvalid time, please input again ");
            sc.nextLine();

        }
        System.out.println("The time you use is " + time);
        return time;
    }

    private double calculate(String type, double time) {
        char x = type.charAt(0);
        double cost = 0;
        switch (x) {
            case 'a':
                if (time <= 10) {
                    cost = 9.55;
                } else {
                    cost = 9.55 + 2 * (time - 10);
                }
                break;

            case 'b':
                if (time <= 20) {
                    cost = 14.95;
                } else {
                    cost = 14.95 + 1 * (time - 20);
                }
                break;

            case 'c':
                cost = 19.95;
                break;

            default:
                System.out.print("The program is failed ");
                break;
        }
        return cost;

    }

    private void display(double cost) {
        NumberFormat money = NumberFormat.getCurrencyInstance(Locale.CANADA_FRENCH);
        money.setMaximumFractionDigits(2);
        money.setMinimumFractionDigits(2);
        String priceString = money.format(cost);
        System.out.print("Your total cost is " + priceString);

    }

    private void perform() {
        packageType = getPackageType();
        totalTime = getTime();
        totalcost = calculate(packageType, totalTime);
        display(totalcost);
    }

}
