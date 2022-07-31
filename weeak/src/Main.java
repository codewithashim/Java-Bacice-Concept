import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int date;
        String weeak = null;
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the day number:");
        date = scr.nextInt();

        switch (date){

            case 7:
                weeak = "Today is Saturday";
                break;
            case 6:
                weeak = "Today is Sunday";
                break;
            case 5:
                weeak = "Today is monday";
                break;
            case 4:
                weeak ="Today is tuesday";
                break;
            case 3:
                weeak = "Today is wednessday";
                break;
            case 2:
                weeak = "Today is Thusday ";
                break;
            case 1:
                weeak = "Today is fri day";
                break;
        }

        System.out.println(weeak);
        scr.close();
    }

}