package ua.lviv.lgs;
import java.util.Scanner;
public class RunnableThread implements Runnable{
	@Override
    public void run ( ) {
        Scanner sc = new Scanner( System.in);
        int num = sc.nextInt();
        int[] f = new int [num];
        f[0] = 1;
        f[1] = 1;
        for ( int i = 2; i < num; ++i ) {
            f[i] = f[i - 1] + f[i - 2];
        }
        for( int i = num-1; i >= 0; i-- ){
            System.out.print( "Runnable: " + f[i] + " ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
