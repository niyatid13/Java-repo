package concepts.java.study;

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        
        System.out.println("Thank you ");
//        while(true){
//            System.out.println("I am a thread");
//        }
    }
}

public class ConstructorThr {
    public static void main(String[] args) {
    MyThr t1 = new MyThr("Harry");
    MyThr t2 = new MyThr("Ram Candr");
    t1.start();
    t2.start();
    System.out.println("The id of the thread t1 is " + t1.getId());
    System.out.println("The name of the thread t1 is " + t1.getName());
    System.out.println("The id of the thread t2 is " + t2.getId());
    System.out.println("The name of the thread t2 is " + t2.getName());

    }
}

