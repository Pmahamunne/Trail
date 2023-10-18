public class Demo{
    public int sum(int a, int b){
        return a+b;
    }

}

class Sum extends Demo {
    public static void main(String[] args) {
        Sum sum = new Sum();
        System.out.println(sum.sum(1, 45));
        
    }

}