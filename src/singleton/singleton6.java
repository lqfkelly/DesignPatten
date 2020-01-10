package singleton;

/**
 * 懒汉式：
 * syschronized 双重检查
 *
 */
public class singleton6 {
    private static singleton6 INSTANCE;

    private singleton6(){}

    public static singleton6 getInstance(){
        if(INSTANCE == null){
            synchronized (singleton6.class){
                if(INSTANCE == null){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new singleton6();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for(int i=0; i<100; i++){
            new Thread(() ->
                    System.out.println(singleton6.getInstance().hashCode())
            ).start();
        }
    }
}
