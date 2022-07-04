package ua.lviv.lgs;
import java.util.Scanner;
public class MyThread extends Thread{
	public void run() {
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();
        int[] f = new int [numb];
        f[0] = 1;
        f[1] = 1;
        for ( int i = 2; i < numb; ++i ) {
            f[i] = f[i - 1] + f[i - 2];
        }
        for( int i = 0; i < numb; i++ ){
            System.out.print( "Thread : " + f[i] + " ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println ( );

    }
}
