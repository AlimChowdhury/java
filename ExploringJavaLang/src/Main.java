public class Main {
    public static void main(String[] args)
    {
        Double d1= new Double(1/0.);
        Double d2 = new Double(0/0.);

        System.out.println(d1.isInfinite());
    }
}