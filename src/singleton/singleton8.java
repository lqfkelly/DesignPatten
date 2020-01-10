package singleton;

/**
 * 枚举实例
 * 解决线程同步，还防止反序列化
 * 其他7种无法防止反射攻击
 * 最完美
 *
 * 在通过反射生成实例时会屏蔽枚举类
 */
public enum  singleton8 {
    INSTANCE;

    public static void main(String[] args) {
        for(int i=0; i<100; i++){
            new Thread(() ->
                    System.out.println(singleton8.INSTANCE.hashCode())
            ).start();
        }
    }
}
