package PR1.tut8;

public class PrintTable {
    public static void main (String[] arg) {
        int[][] table = {
                {8, 1, 6},
                {3, 5, 7},
                {4, 9, 2}
        };

        System.out.println("+-----------+");
        /** cách của thầy
         for (int[] rows: table) {
            System.out.print("|");
            for (int value: rows) {
                System.out.print(" " + value +" |");
            }
            System.out.println();
        }*/
        for (int i = 0; i < table.length; i++){
            System.out.print("|");
            for(int j = 0; j <table[i].length; j++){
                System.out.print(" "+ table[i][j] + " |");
            }
            System.out.println();
        }
        System.out.print("+-----------+");
    }
}
