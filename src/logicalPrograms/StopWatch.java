package logicalPrograms;

import java.util.Scanner;

public class StopWatch {
	
	public long startTimer=0;
	public long stopTimer=0;
	public long elapsed;
	
	public void start() {
		startTimer = System.currentTimeMillis();
		System.out.println("Start Time is : "+startTimer);
	}
	
	public void stop() {
		stopTimer = System.currentTimeMillis();
		System.out.println("Stop Time is : "+stopTimer);
	}
	
	public long elapsedTime() {
		elapsed = stopTimer - startTimer;
		return elapsed;
	}
	
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StopWatch sw = new StopWatch();
		Scanner s = new Scanner(System.in);
		System.out.print("Start Time : ");
		int n = s.nextInt();
		sw.start();
		
		System.out.println();
		System.out.print("Stop Time : ");
		int m = s.nextInt();
		sw.stop();
		
		long l = sw.elapsedTime();
		System.out.println();
		System.out.println("Total Time Elapsed is : "+l);
		System.out.println();
		System.out.println("Converting Millisec to Seconds : "+(l/1000)+" Sec");
	}


}
