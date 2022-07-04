package ua.lviv.lgs;

public class Main {
	public static void main(String[] args) {
        MyThread th = new MyThread();
        th.start();
        try {
            th.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread rth = new Thread( new RunnableThread());
        th.start();
    }
}
