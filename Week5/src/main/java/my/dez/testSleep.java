package my.dez;

public class testSleep
{
    public static void main(String[] args)
    {
        for(int i=0;i<21;i++)
        {
            Thread thread = new Thread(new Output());
            thread.start();

            try {
                thread.join();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
