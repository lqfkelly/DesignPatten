package singleton;

/**
 * 懒汉式：
 * 虽然达到了按需初始化的目的，但是带来了线程安全的问题
 * 妄图在使用的时候通过synchronized解决，以减少同步代码块来提高效率，但是判断与创建不为一体，达不到线程安全
 */
public class singleton5 {
    private static singleton5 INSTANCE;
    private singleton5(){}
    public static singleton5 getInstance(){
        if(INSTANCE == null){
            synchronized (singleton5.class){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE = new singleton5();
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for(int i=0; i<100; i++){
            new Thread(() ->
                    System.out.println(singleton5.getInstance().hashCode())
            ).start();
        }
    }
}
