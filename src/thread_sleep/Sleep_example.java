package thread_sleep;

public class Sleep_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			System.out.println("Sleep you shit");
			Thread.sleep(1000);
			
			System.out.println("Again you shit");
			Thread.sleep(6000);
			
			System.out.println("I said na sleepppp!!!");
			Thread.sleep(600);
		}  catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
