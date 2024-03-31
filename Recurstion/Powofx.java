public class Powofx {

    public static int pow(int x,int y){
        if(y == 0){
            return 1;
        }
        return y%2 == 0 ? pow(x, y/2)*pow(x, y/2): x*(pow(x, y/2)*pow(x, y/2));
    }
    public static void main(String[] args) {
        System.err.println(pow(2,10));
    }
}
