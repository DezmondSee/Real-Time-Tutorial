package my.dez;

public class multiplication extends Thread
{
    int number;
    public multiplication(int number)
    {
        this.number=number;
    }

    public void run()
    {
        for(int i=0;i<=3;i++)
        {
            System.out.println("Thread-"+number+""+i+"="+(number*i));
        }
    }
}
