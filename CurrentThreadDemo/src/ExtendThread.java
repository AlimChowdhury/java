class NewThread1 extends Thread
{
    NewThread1()
    {
        //creat a new,2nd thread

        super("Demo Thread");
        System.out.println("Child Thread: "+this);
        start();
    }
    public void run()
    {
        try{
            for(int i=5;i>0;i--)
            {
                System.out.println("Child Thread : "+i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e)
        {
            System.out.println(("Child thread interrupted "));
        }
        System.out.println("Exiting Child thread ");
    }
}
class ExtendThread {
    public static void main(String args[])
    {
        new NewThread1();

        try{
            for(int n=5;n>0;n--)
            {
                System.out.println("Main Thread : "+n);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e)
        {
            System.out.println(("Main thread interrupted "));
        }
        System.out.println(("Main thread exiting "));

    }
}
