class Adder{
    void add(float a,float b){
        System.out.println(a+b);
    }
    void add(int a,int b){
        System.out.println(a+b);
    }
}
class Sub{
    static double sub(int a,int b){
        return a-b;
    }
    static int sub(int a,int b,int c){
        return a-b-c;
    }
}
public class OverLoad {
    public static void main(String[]ar){
        Adder ad=new Adder();
        Sub su=new Sub();
        ad.add(10,11);
        ad.add(2.3f,4.5f);
        System.out.println(su.sub(27,78,34));
        System.out.println(su.sub(5,3));

    }
}
