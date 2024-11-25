class test{
    int i;
    int j;
    public test(){

    }
    void testt(int i,int j){
        this.i=i;
        this.j=j;
    }
    void display(){
        System.out.println(i);
        System.out.println(j);
    }
}
public class class1{
    public static void main(String[]args){
        test t=new test();
        t.testt(6,7);
        t.display();
    }
}