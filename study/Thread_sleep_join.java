package concepts.java.study;

class Thread_sleep_join extends Thread{    
	 public void run(){    
	  for(int i=1;i<=5;i++){    
	   try{    
	    Thread.sleep(500);    
	   }
	   catch(Exception e){System.out.println(e);}    
	  
	   System.out.println(i);    
	  }    
	 } 
	 
	public static void main(String args[]){    
		Thread_sleep_join t1=new Thread_sleep_join();    
		Thread_sleep_join t2=new Thread_sleep_join();    
		Thread_sleep_join t3=new Thread_sleep_join();    
	 
	 t1.start();    
	 
	 try{    
	  t1.join();   //First the whole t1 is executed then the other threads start their execution 
	 }
	 catch(Exception e){System.out.println(e);}    
	    
	 t2.start();    
	 t3.start();    
	 }    
	}    

