class Test
{
    int a;
    public int b;
    private int c;

    void setc(int i)
    {
        c=i;
    }

    int getc()
    {
        return c;
    }
}
public class Main {
    public static void main(String[] args)
    {
        Test ob =new Test();

        ob.a=10;
        ob.b=15;
        ///ob.setc()=100 (error!!! as it is private value)

        ob.setc(25);

        System.out.println("a, b, c :"+ob.a+" "+ob.b +" "+ob.getc());
    }
}