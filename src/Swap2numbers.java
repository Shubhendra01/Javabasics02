public class Swap2numbers {

    public static void main(String[] args) {
        Integer a = 2,b = 3,c;
        System.out.println("The original numbers:"+"\na:"+a+"\nb:"+b);
        c = a;
        a = b;
        b = c;
        System.out.println("After swapping:"+"\na:"+a+"\nb:"+b);
    }
}
