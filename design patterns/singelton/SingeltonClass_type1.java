//Eager initialization

public class SingeltonClass_type1{
    private static final SingeltonClass_type1 INSTANCE = new SingeltonClass_type1();

    private SingeltonClass_type1(){

    }

    public static SingeltonClass_type1 getInstance(){
        return INSTANCE;
    }
}