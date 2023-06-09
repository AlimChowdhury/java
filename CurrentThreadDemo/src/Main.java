
class NewThread implements Runnable
{
    Thread t;

    NewThread()
    {
        t= new Thread(this,"Demo thread");
        System.out.println("Child Thread: "+t);
        t.start();

    }
    public void run()
    {
        try{
            for(int n=5;n>0;n--)
            {
                System.out.println("Child Thread : "+n);
                Thread.sleep(500);
            }
        }catch (InterruptedException e)
        {
            System.out.println(("Child thread interrupted "));
        }
        System.out.println("Exiting Child thread ");
    }

}


public class Main {
    public static void main(String[] args)
    {
        new NewThread();
        // Thread t= Thread.currentThread();
        //System.out.println("Current Thread : "+t);
        //change the name of the thread
        //t.setName("My Thread");
        //System.out.println("After name change : "+t);

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