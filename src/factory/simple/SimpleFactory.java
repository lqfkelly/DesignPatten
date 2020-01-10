package factory.simple;

public class SimpleFactory {
    public Pay getPayMethod(String type){
        if("zfb".equals(type)){
            return new ZFBPay();
        }else if("wx".equals(type)){
            return new WxPay();
        }else{
            return null;
        }
    }

    public static void main(String[] args) {
        Pay pay = new SimpleFactory().getPayMethod("zfb");
        pay.pay();
        pay = new SimpleFactory().getPayMethod("wx");
        pay.pay();
    }
}
