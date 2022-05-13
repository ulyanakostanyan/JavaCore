package chapters.chapter3;

public class BoolTest {
    public static void main(String[] args) {
        boolean b;
        b = false;
        System.out.println("b havasar e" + b);
        b = true;
        System.out.println("b havasar  e" + b);
        //boolean tipi nshanakutyune kareli e xekavarel if
        if (b) System.out.println("kode irakanacvum e");
        b = false;
        if (b) System.out.println("kode chi irakanacvum");
        //ardyunqi hamematum-boolean tipi nshanakuryune
        System.out.println("10>9 havasar  e" + (10 > 9));
    }
}
