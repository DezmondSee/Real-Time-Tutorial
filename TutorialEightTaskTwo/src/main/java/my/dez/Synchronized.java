package my.dez;

public class Synchronized extends Thread
{
    private static int counter =0;

    @Override
    public void run()
    {
        for(int i=0; i<1000;i++)
        {
            synchronized (Synchronized.class)
            {
                counter++;
            }
        }
    }
}
