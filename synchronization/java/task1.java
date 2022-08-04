package packager.synchronization.java;

class task1{  
void printTable(int n){  
   for(int i=1;i<=5;i++){  
     System.out.println(n*i);  
     try{  
      Thread.sleep(400);  
     }catch(Exception e){System.out.println(e);}  
   }  
  
 }  
}  
  
class MyThread1 extends Thread{  
task1 t;  
MyThread1(task1 t){  
this.t=t;  
}  
public void run(){  
t.printTable(5);  
}  
  
}  
class MyThread2 extends Thread{  
task1 t;  
MyThread2(task1 t){  
this.t=t;  
}  
public void run(){  
t.printTable(100);  
}  
}  
  
class TestSynchronization1{  
public static void main(String args[]){  
task1 obj = new task1();  
MyThread1 t1=new MyThread1(obj);  
MyThread2 t2=new MyThread2(obj);  
t1.start();  
t2.start();  
}  
}  