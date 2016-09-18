package javaMultithreading;
/*
 * Write a class that can perform an operation in synchronisation mode 
 * and in non synchronisation mode.
 * Showcase the difference in output for both cases.
 */
public class Threading {

	public Threading(boolean isSync) {
		this.isSync = isSync;
	}
	public String op = "start ";
	private boolean isSync;
	public void callBuild(String str)
	{
		
		if(isSync)
			buildSnyc(str);
		else
			build(str);
	}
	public void build(String str){
		op = op + "{";
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		op = op + str;
		op = op + "}";
	}
	public synchronized void buildSnyc(String str){
		op = op + "{";
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		op = op + str;
		op = op + "}";
	}
	Thread threadOne = new Thread(new Runnable(){
		public void run()
		{
			for (int i=0;i<1;i++)
				callBuild("t1 ");
		}
	});
	Thread threadTwo = new Thread(new Runnable(){
		public void run()
		{

			for (int i=0;i<1;i++)
				callBuild("t2 ");
		}
	});
	public void Start()
	{
		threadOne.start();
		threadTwo.start();

		try{
			threadOne.join();
			threadTwo.join();
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}

}
