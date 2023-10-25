package OOPS;

public final class Singleton {
    private static Singleton instance;
    private Singleton(){

    }

    public static Singleton getInstance(){
        if(instance==null){
            instance= new Singleton();
        }
        return instance;
    }

    public static void main(String[] args){
        Singleton obj1= Singleton.getInstance();
        System.out.println(obj1);

        Singleton obj2= Singleton.getInstance();
        System.out.println(obj2);

    }

}
