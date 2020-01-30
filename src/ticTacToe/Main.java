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
    }
}