public class SingeltonClass_type3 {
    //Double-checked locking
    private static volatile SingeltonClass_type3 instance = null;

    private SingeltonClass_type3(){

    }

    public static SingeltonClass_type3 getInstance(){
        if(instance == null){
            synchronized(SingeltonClass_type3.class){
                if(instance == null ){
                    instance = new SingeltonClass_type3();
                }
            }
        }
        return instance;
    }
    
}
