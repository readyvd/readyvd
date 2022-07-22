import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter a 5 letter word: ");
        String input = stdin.nextLine();
        char[] array = input.toCharArray();
        
        System.out.print(array[0]);
        System.out.print("  ");
        System.out.print(array[1]);
        System.out.print("   ");
        System.out.print(array[2]);
        System.out.print("     ");
        System.out.print(array[3]);
        System.out.print("      ");
        System.out.print(array[4]);
    }
}