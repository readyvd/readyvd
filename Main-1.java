import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int itemsSold = 0;
        int compensation = 2000;
        String month;
        String year;
        
        System.out.print("Enter the month: ");
        month = input.nextLine();
        System.out.print("Enter the year: ");
        year = input.nextLine();
        System.out.print("Enter items sold: ");
        
        while(input.hasNext()){
            if(input.hasNextInt()){
                itemsSold += input.nextInt();
                System.out.printf("Gross sales: %d%n", itemsSold);
                System.out.print("Enter next value, if no more values, enter END");
            }
            else{
                break;
            }
        }
        
        compensation += (itemsSold * .2);
        System.out.printf("Employee's total compensation for %s, %s is %d.%n", month, year, compensation);
    }
}
