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

class Divide extends Multiply{
    public int divide(int a, int b){
        return a/b;
    }
}
class Minus extends Divide{
    public int minus(int a, int b){
        return a/b;
    }
}


class Sum extends Minus {
    public static void main(String[] args) {
        Sum sum = new Sum();
        System.out.println(sum.minus(34, 12));

        System.out.println(sum.divide(34, 12));
        System.out.println(sum.multi(23, 67));
        System.out.println(sum.sum(1, 45));
        
    }

}