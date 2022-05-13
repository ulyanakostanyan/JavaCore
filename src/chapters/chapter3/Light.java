package chapters.chapter3;

public class Light {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;
        // լույսի մոտավոր արագությունը, միլ վայրկյանում
        lightspeed = 1860000;
        days = 1000;// իմանալ օրերի քանակը
        seconds = days * 24 * 60 * 60;
        //փոխակերպել վայրկյանների
        distance = lightspeed * seconds;
        //հաշվարկել հեռավորությունը
        System.out.println("За" + days);
        System.out.println("օրվա լույսը կանցնի մոտ");
        System.out.println(distance + "մղոն");

    }


}
