package facade;

public class Facade {
    private SubSys1 sys1;
    private SubSys2 sys2;
    private SubSys3 sys3;
    public Facade(){
        sys1 = new SubSys1();
        sys2 = new SubSys2();
        sys3 = new SubSys3();
    }
    public void method(){
        sys1.method1();
        sys2.method2();
        sys3.method3();
    }

    public static void main(String[] args) {
        new Facade().method();
    }
}
