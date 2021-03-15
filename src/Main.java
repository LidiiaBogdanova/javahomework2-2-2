public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float bmi = service.calculate(100F, 1.82F);
        System.out.println(bmi);
    }
}