package my.dez;

public class Main
{
    public static void main(String[] args) throws InterruptedException {
        // Normal thread test
        long start = System.nanoTime();

        Normal[] normal = new Normal[10];
        for(int i = 0; i < 10; i++) {
            normal[i] = new Normal();
            normal[i].start();
        }
        for(int i = 0; i < 10; i++) {
            normal[i].join();
        }

        long end = System.nanoTime();
        double time = (end - start) / 1_000_000_000.0;

        // Synchronized thread test
        long startSynchronized = System.nanoTime();

        Synchronized[] syncThreads = new Synchronized[10];
        for(int i = 0; i < 10; i++) {
            syncThreads[i] = new Synchronized();
            syncThreads[i].start();
        }
        for(int i = 0; i < 10; i++) {
            syncThreads[i].join();
        }

        long endSync = System.nanoTime();
        double timeSynchronized = (endSync - startSynchronized) / 1_000_000_000.0;

        // Output
        System.out.printf("Normal thread: %.9f seconds\n", time);
        System.out.printf("Synchronized thread: %.9f seconds\n", timeSynchronized);
    }
}
