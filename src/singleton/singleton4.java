package singleton;

/**
 * 懒汉式：
 * 虽然达到了按需初始化的目的，但是带来了线程安全的问题
 * 通过synchronized解决，每次使用都要加锁，效率会下降
 */
public class singleton4 {
    private static singleton4 INSTANCE;
    private singleton4(){
    }
    public static synchronized singleton4 getInstance(){
        if(INSTANCE == null){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new singleton4();
        }
        return INSTANCE;
    }
    public static void main(String[] args) {
        for(int i=0; i<100; i++){
            new Thread(() ->
                    System.out.println(singleton4.getInstance().hashCode())
            ).start();
        }
    }
}
