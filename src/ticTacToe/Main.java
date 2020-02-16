package ticTacToe;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char a1 = scanner.findInLine(".").charAt(0);
        char a2 = scanner.findInLine(".").charAt(0);
        char a3 = scanner.findInLine(".").charAt(0);
        char b1 = scanner.findInLine(".").charAt(0);
        char b2 = scanner.findInLine(".").charAt(0);
        char b3 = scanner.findInLine(".").charAt(0);
        char c1 = scanner.findInLine(".").charAt(0);
        char c2 = scanner.findInLine(".").charAt(0);
        char c3 = scanner.findInLine(".").charAt(0);
        System.out.println("---------");
        System.out.print('|' + " ");
        System.out.print(a1 + " ");
        System.out.print(a2 + " ");
        System.out.print(a3 + " ");
        System.out.println('|' + " ");
        System.out.print('|' + " ");
        System.out.print(b1 + " ");
        System.out.print(b2 + " ");
        System.out.print(b3 + " ");
        System.out.println('|' + " ");
        System.out.print('|' + " ");
        System.out.print(c1 + " ");
        System.out.print(c2 + " ");
        System.out.print(c3 + " ");
        System.out.println('|' + " ");
        System.out.println("---------");
        int n = 0;
        int nX = 0;
        int nO = 0;
        int i = 0;
        for(i = 1; i < 10; i++){
            char a = scanner.findInLine(".").charAt(0);
            if(a == 'X'){
                nX++;
                //win X
                //
            }
            if(a == 'O'){
                nO++;
                //win O
            }
            if(nX - nO > 1 || nX - nO < -1){  // прописать когда и х и о выигрышные
                System.out.println("Impossible");
            }
            if(a == '_'){                     //это после проверки на выигрыш
                n++;
                if(n > 0){
                    System.out.println("Game not finished");
                }
            }

        }

        if(a1 == a2 && a2 == a3 || b1 == b2 && b2 == b3 || c1 == c2 && c2 == c3 ||
                a1 == b1 && b1 == c1 || a2 == b2 && b2 == c2 || a3 == b3 && b3 == c3 ||
                a3 == b2 && b2 == c1 || a1 == b2 && b2 == c3){
            System.out.println(a1 + " wins");
        }
    }
}