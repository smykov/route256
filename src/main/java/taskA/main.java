package taskA;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            if (!scanner.hasNextLine()) {
                return;
            }
            String input = scanner.nextLine();
            String[] arr_str = input.split("\\p{Blank}+", 2);
            int sum = 0;
            if ("".equals(arr_str[0])) {
                return;
            }
            if (arr_str.length == 2) {
                sum = Integer.parseInt(arr_str[0]) + Integer.parseInt(arr_str[1]);
                System.out.println(sum);
            }
        }
    }
}
