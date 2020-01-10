package singleton;

/**
 * 饿汉式： 跟singleton1相同
 * 类加载到内存后就实现一个实例对象，JVM保证线程安全
 * 简单实用，推荐使用
 * 缺点：不管用到与否，类装载就完成实例化
 */
public class singleton2{
    private static final singleton2 INSTANCE;
    static {
        INSTANCE = new singleton2();
    }
    private singleton2(){
    }
    public static singleton2 getInstance(){
        return INSTANCE;
    }
    public static void main(String[] args) {
        for(int i=0; i<100; i++){
            new Thread(() ->
                    System.out.println(singleton2.getInstance().hashCode())
                    ).start();
        }
    }
}
