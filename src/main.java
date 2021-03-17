public class main {
    public static void main(String[] args) {
        BmService service = new BmService();
        float weight = 90f;
        float height = 180f;
        float index = service.calculate(weight, height);
        System.out.println(index);

    }
}
