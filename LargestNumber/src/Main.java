public class Main {
    public static void main(String[] args) {
        int a, b,c;
        a= 10;
        b= 20;
        c= 30;

        if(a>b & a>c){
            System.out.println("The largest number Is : "+a);
        } else if (b>a & b>c) {
            System.out.println("The Largest Number Is : "+b);
        }else {
            System.out.println("The Largest Number Is : "+c);
        }

    }
}