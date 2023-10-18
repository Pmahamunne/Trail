public class Demo{
    public int sum(int a, int b){
        return a+b;
    }

}
class Multiply extends Demo{
    public int multi(int a, int b){
        return a*b;
    }

}

class Sum extends Multiply {
    public static void main(String[] args) {
        Sum sum = new Sum();
        System.out.println(sum.multi(23, 67));
        System.out.println(sum.sum(1, 45));
        
    }

}