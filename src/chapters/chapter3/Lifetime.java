package chapters.chapter3;

public class Lifetime {
    public static void main(String[] args) {
        int x;
        for (x = 0; x < 3; x++) {
            int y = -1;
            System.out.println("y rovno e:" + y);
            //zdes vsegda vivoditsa znachenie-1
            y = 100;
            System.out.println("y 33hima havasar e: +y");

        }
    }
}
