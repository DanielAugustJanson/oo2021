public class funktsioon1{
    //See on funktsioon?
    public static double ringiPindala(double r){
        return Math.PI*r*r;
    }
    public static String tempHinnang(int t){
        if(t>18){
            return("soe");
        }else{
            return("külm");
        }
    }

    public static double TaksoDistants(double km){
        return(3+km*0.80);
    }
    public static void main(String[] arg){
        System.out.println(TaksoDistants(Integer.parseInt(arg[0])));
    }

}
