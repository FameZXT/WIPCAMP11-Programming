/*
 * WIP XI Computer Programing 
 */
package XI.Project;

import java.util.Scanner;

/**
 *
 * @author sittiwatlcp
 */
public class WIPCargo {

    public static void main(String[] args) {

        int item = 5;
        int limit = 10;
        System.out.println("item" + item + ",limit" + limit);

        Scanner input = new Scanner(System.in);

        System.out.println("1.Add");
        System.out.println("2.Remove");
        System.out.println("3.Check");
        System.out.println("Input your menu");

        int menu = input.nextInt();

        if (menu == 1) {
            if (item < limit) {
                System.out.println("amout to add");
                int amount = input.nextInt();
                if (item + amount > limit) {
                    System.out.println("ไอเท็มเกินลิมิต");
                } else {
                    item = item + amount;
                    System.out.println("item" + item + ",limit" + limit);
                }
            } else {

                System.out.println("ไอเท็มเต็มแล้ว");
            }
        }
        if (menu == 2) {
            System.out.println("Amount to Remove");
            if (0 <= item && item <= limit) {
                int amount = input.nextInt();
                if (item - amount < 0) {
                    System.out.println("ไอเท็มเไม่เพียงพอ");
                } else {
                    item = item - amount;
                    System.out.println("item" + item + ",limit" + limit);
                }
            } else {

                System.out.println("ไอเท็มไม่เพียงพอ");
            }
        }
        if (menu == 3) {
            System.out.println("item" + item + ",limit" + limit);
        }
    }
}
