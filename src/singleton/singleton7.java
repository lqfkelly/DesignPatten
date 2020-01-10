package singleton;

/**
 * 懒汉式：
 * 静态内部类
 *
 */
public class singleton7 {
    private singleton7(){}

    private static class singletonInner{
        private static final singleton7 INSTANCE = new singleton7();
    }

    public static singleton7 getInstance(){
        return singletonInner.INSTANCE;
    }

    public static void main(String[] args) {
        for(int i=0; i<100; i++){
            new Thread(() ->
                    System.out.println(singleton7.getInstance().hashCode())
            ).start();
        }
    }
}
