package my.dez;

public class TaskOne
{
    public static void main(String[] args)
    {
        multiplication thread1 = new multiplication(1);
        multiplication thread2 = new multiplication(2);
        multiplication thread3 = new multiplication(3);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
