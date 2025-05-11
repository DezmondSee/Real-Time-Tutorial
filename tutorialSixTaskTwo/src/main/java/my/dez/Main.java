package my.dez;

import java.io.IOException;
public class Main
{
    public static void main(String[] args)
    {
        runningThread run = new runningThread();
        run.start();

        System.out.println("Press Enter to stop Thread");
        try {
            System.in.read();
        }catch(IOException e){
            e.printStackTrace();
        }

        run.shutdown();
        System.out.println("Thread Stop");
    }
}
