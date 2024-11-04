class examplethread1 extends Thread {
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

class examplethread2 extends Thread {
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

        examplethread1 t1 = new examplethread1();
        examplethread2 t2 = new examplethread2();

        t1.start();
        t2.start();

    }
}