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
        int res = 0; //считает количество выигрышей
        char win = '0';
        char arr[][] = new char[3][3];
        for(i = 0; i < 3; i++){         //заполняем массив
            for(j =0; j < 3; j++) {
                arr[i][j] = scanner.findInLine(".").charAt(0);
                if(arr[i][j] == 'X'){  //считает количество Х
                    nX++;
                }
                else {
                    if (arr[i][j] == 'O') { //считает количество О
                        nO++;
                    } else {
                        if (arr[i][j] == '_') {    //считает количество _
                            n++;
                        }
                    }
                }
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
        //System.out.println(nX + " - X");
       // System.out.println(nO + " - O");
       // System.out.println(n + " - _ ");

        if (nX - nO > 1 || nX - nO < -1) {   //ошибка когда Х или О больше чем на 1
            System.out.println("Impossible");
        }
        else {
            if ((arr[0][0] == arr[0][1] && arr[0][0] == arr[0][2])
                || (arr[0][0] == arr[1][0] && arr[0][0] == arr[2][0])
                || (arr[0][0] == arr[1][1] && arr[0][0] == arr[2][2])){

                if (arr[0][0] == 'X' || arr[0][0] == 'O') {
                    win = arr[0][0];
                    res++;
                }
            }
            if ((arr[1][0] == arr[1][1] && arr[1][0] == arr[1][2])
                || (arr[0][1] == arr[1][1] && arr[0][1] == arr[2][1])){
                if (arr[1][1] == 'X' || arr[1][1] == 'O') {
                    win = arr[1][1];
                    res++;
                }
            }
            if (arr[2][0] == arr[2][1] && arr[2][0] == arr[2][2]) {
                if (arr[2][0] == 'X' || arr[2][0] == 'O') {
                    win = arr[2][0];
                    res++;
                }
            }
            if ((arr[0][2] == arr[1][2] && arr[0][2] == arr[2][2])
                || (arr[0][2] == arr[1][1] && arr[0][2] == arr[2][0])){
                if (arr[0][2] == 'X' || arr[0][2] == 'O') {
                    win = arr[0][2];
                    res++;
                }
            }
            if(res >= 2){
                System.out.println("Impossible");
            }
            else{
                if(res == 1) {
                    if (win == 'X' || win == 'O') {
                        System.out.println(win + " wins");
                    }
                }
                else{
                    if(res == 0){
                        if (n > 0) {
                            System.out.println("Game not finished");
                        }
                        else {
                            System.out.println("Draw");
                        }
                    }
                }
            }
        }
    }
}