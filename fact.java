class factorial{
    int fact=1;
    void factorial(int n){
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
    }
    void display(){
        System.out.println(fact);
    }
}
public class fact {
    public static void main(String[]ar){
        factorial fa=new factorial(); 
        fa.factorial(4);
        fa.display();
    }
}
