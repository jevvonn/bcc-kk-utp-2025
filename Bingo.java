import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int matrix_number = scan.nextInt();

        int[][] numbers = new int[matrix_number][matrix_number];
        String[][] numbers_map = new String[matrix_number][matrix_number];

        for (int i = 0; i < matrix_number; i++) {
            for (int j = 0; j < matrix_number; j++) {
                numbers[i][j] = scan.nextInt();
                numbers_map[i][j] = ".";
            }
        }

        int announce = scan.nextInt();
        for (int i = 0; i < announce; i++) {
            int bingo_number = scan.nextInt();
            numbers_map = changeMap(numbers, numbers_map, bingo_number);
            if (checkBingo(numbers_map))
                break;
        }

        System.out.println("Bingo!");
        for (int i = 0; i < numbers_map.length; i++) {
            for (int j = 0; j < numbers_map[i].length; j++) {
                System.out.print(numbers_map[i][j] + " ");
            }
            System.out.println();
        }

        scan.close();

    }

    public static boolean checkBingo(String[][] map) {
        boolean check = false;

        for (int i = 0; i < map.length; i++) {
            check = true;
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == ".") {
                    check = false;
                    break;
                }
            }
        }

        return check;
    }

    public static String[][] changeMap(int[][] numbers, String[][] map, int bingoNumber) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (bingoNumber == numbers[i][j]) {
                    map[i][j] = "o";
                }
            }
        }

        return map;
    }
}
