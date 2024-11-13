package PR1.tut2;

public class CoinConverter {
    public static void main (String[] args){
        int s = 483274;
        int xu = s % 10;
        s = s / 10;
        int hao = s % 10;
        s = s / 10;
        int dong = s % 100;
        s = s / 100;
        int quan = s % 100;
        System.out.println("483274 xu converts into:");
        System.out.print(quan + " quan, " + dong + " dong, " + hao + " hao, " + xu + " xu.");
    }
}
