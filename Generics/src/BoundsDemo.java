class Stats<T extends Number>
{
    T[] numbs;

    Stats(T[] ob)
    {
        numbs =ob;
    }

    double average()
    {
        double sum= 0.0;

        for(int i=0;i<numbs.length;i++)
        {
            sum+=numbs[i].doubleValue();

        }

        return sum/numbs.length;
    }
}
public class BoundsDemo {
    public static void main(String[] args)
    {
        Integer inums[] = {1,2,3,8,5};
        Stats<Integer>iob;

        iob= new Stats<Integer>(inums);
        double v= iob.average();
        System.out.println("iob average is : "+ v);

    }
}
