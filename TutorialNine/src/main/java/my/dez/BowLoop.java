package my.dez;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Random;
public class BowLoop implements Runnable
{
    private Safelock.Friend bower;
    private Safelock.Friend bowee;

    public BowLoop(Safelock.Friend bower, Safelock.Friend bowee){
        this.bowee= bowee;
        this.bower= bower;
    }

    public void run() {
        Random random = new Random();
        for (; ; ) {
            try {
                Thread.sleep(random.nextInt(10));
            } catch (InterruptedException e) {
            }
            bowee.bow(bower);
        }
    }
        public static void main(String[] args){
            final Safelock.Friend alphonse = new Safelock.Friend("Alphonse");
            final Safelock.Friend gaston = new Safelock.Friend("Gaston");
            new Thread(new BowLoop(alphonse, gaston)).start();
            new Thread(new BowLoop(gaston, alphonse)).start();
        }
}
