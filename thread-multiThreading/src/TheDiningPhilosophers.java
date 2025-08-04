import java.util.concurrent.Semaphore;

public class TheDiningPhilosophers {
    private final Semaphore[] forks;
    private final Semaphore mutex;

    public TheDiningPhilosophers() {
        forks = new Semaphore[5];
        for (int i = 0; i < 5; i++) {
            forks[i] = new Semaphore(1);
        }
        mutex = new Semaphore(1);
    }

    public void wantsToEat(int philosopher,
                           Runnable pickLeftFork,
                           Runnable pickRightFork,
                           Runnable eat,
                           Runnable putLeftFork,
                           Runnable putRightFork) throws InterruptedException {
        int leftFork = philosopher;
        int rightFork = (philosopher + 1) % 5;

        mutex.acquire();
        forks[leftFork].acquire();
        pickLeftFork.run();
        forks[rightFork].acquire();
        pickRightFork.run();
        eat.run();
        putLeftFork.run();
        forks[leftFork].release();
        putRightFork.run();
        forks[rightFork].release();
        mutex.release();
    }

    public static void main(String[] args) {
        TheDiningPhilosophers philosophers = new TheDiningPhilosophers();

        Thread[] threads = new Thread[5];

        for (int i = 0; i < 5; i++) {
            final int philosopherId = i;
            threads[i] = new Thread(() -> {
                try {
                    philosophers.wantsToEat(philosopherId,
                            () -> System.out.println("Philosopher " + philosopherId + " picks up left fork"),
                            () -> System.out.println("Philosopher " + philosopherId + " picks up right fork"),
                            () -> System.out.println("Philosopher " + philosopherId + " is eating"),
                            () -> System.out.println("Philosopher " + philosopherId + " puts down left fork"),
                            () -> System.out.println("Philosopher " + philosopherId + " puts down right fork"));
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
            threads[i].start();
        }

        for (int i = 0; i < 5; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("All philosophers have finished eating.");
    }
}
