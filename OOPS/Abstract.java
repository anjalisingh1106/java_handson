package OOPS;

abstract class AbstractClass{
    abstract void m1();
}
class Concrete extends AbstractClass{
    void m1(){
        System.out.println("m1");
    }
}
public class Abstract {
    // AbstractClass a = new AbstractClass();
}

// abstract final class checkFinal{
//     abstract void m1();
// }


// abstract private class checkPrivate{
//     abstract void m1();
// }