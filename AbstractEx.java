abstract class Bike {
    abstract void run();

    {
        System.out.println("running very safely");
    }
}

class Honda4 extends Bike {
    void run() {
        System.out.println("running safely");
    }
}

public class AbstractEx {

    public static void main(String args[]) {
        Bike obj=new Honda4();
        obj.run();
        
    }
}
