public class Mathematics {

    public static void main(String[] args){

        double x = 3.14;
        double y = -10;

        double z = Math.max(x, y);//max is higher value
        double a = Math.min(x, y);//min is lesser value
        double b = Math.abs(y);//absolute value of a number
        double c = Math.sqrt(x);//square root
        double d = Math.round(x);//round a number
        double e = Math.ceil(x);//rounds up
        double f = Math.floor(x);//rounds down

        System.out.println(z);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

    }
}