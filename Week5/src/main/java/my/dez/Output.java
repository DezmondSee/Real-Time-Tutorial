package my.dez;

public class Output implements Runnable
{
    @Override
    public void run()
    {
        try{
            System.out.println("One");
            Thread.sleep(200);

            System.out.println("Two");
            Thread.sleep(200);

            System.out.println("Three");
            Thread.sleep(200);

            System.out.println("XXXXXXXXXX");

        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
