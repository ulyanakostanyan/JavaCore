package chapters.chapter3;

public class Scope {
    public static void main(String[] args) {
        int x;
        x = 10;
        if (x == 10) {
            int y = 20;
            System.out.println("x ev y: " + x + " " + y);
            x = y * 2;
            y = 100;// sxal popoxakan y haytararac che
            System.out.println(" x havasar " + x);


        }
    }
}
