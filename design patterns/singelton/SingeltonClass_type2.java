public class SingeltonClass_type2 {
    //Lazy initialization

    private static SingeltonClass_type2 instance = null;

    private SingeltonClass_type2(){

    }

    public static SingeltonClass_type2 getInstance(){
        if(instance == null){
            instance = new SingeltonClass_type2();
        }
        return instance;
    }
    
}
