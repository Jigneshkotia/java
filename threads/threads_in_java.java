class thread1 extends Thread {
    public void run(){
        while (true) {
            try {
                Thread.sleep(100);    
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("hello");
        }
    }
}

class thread2 extends Thread {
    public void run(){
        while (true) {
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("welcome");
        }
    }
}

class threads_in_java {
    public static void main(String[] args){

        thread1 t1 = new thread1();
        thread2 t2 = new thread2();

        t1.start();
        t2.start();

    }
}