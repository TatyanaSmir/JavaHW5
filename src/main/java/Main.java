import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        System.out.println("Попадание в диапазон " + service.calcSqrOfNumber( 200, 300) + " раз(а)");
    }
}
