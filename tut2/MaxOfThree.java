package PR1.tut2;

public class MaxOfThree {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 6;
        if (a>b && a>c){
            System.out.print(a+" is the largest number");}
        else if (b>a && b>c){
            System.out.print(b+" is the largest number");}
        else {System.out.print(c+" is the largest number");}
    }
}
