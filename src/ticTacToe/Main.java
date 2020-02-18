package ticTacToe;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int nX = 0;
        int nO = 0;
        int i = 0;
        int j = 0;
        char res = 0;
        char arr[][] = new char[3][3];
        for(i = 0; i < 3; i++){         //заполняем массив
            for(j =0; j < 3; j++) {
                arr[i][j] = scanner.findInLine(".").charAt(0);
            }
        }
        System.out.println("---------");     //печатаем поле
        for(i = 0; i < 3; i++){
            System.out.print('|' + " ");
            for(j =0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println('|' + " ");
        }
        System.out.println("---------");

        /*if (arr[i][j] == 'X') {
            nX++;
            //win X
            //
        } else {
            if (arr[i][j] == 'O') {
                nO++;
                //win O
            } else {
                if (arr[i][j] == '_') {                     //это после проверки на выигрыш
                    n++;
                    if (n > 0) {
                        System.out.println("Game not finished");
                    }
                }
            }
        }
        if (nX - nO > 1 || nX - nO < -1) {  // прописать когда и х и о выигрышные
            System.out.println("Impossible");
        }*/


        /*if(a1 == a2 && a2 == a3 || b1 == b2 && b2 == b3 || c1 == c2 && c2 == c3 ||
                a1 == b1 && b1 == c1 || a2 == b2 && b2 == c2 || a3 == b3 && b3 == c3 ||
                a3 == b2 && b2 == c1 || a1 == b2 && b2 == c3){
            System.out.println(a1 + " wins");
        }*/
    }
}