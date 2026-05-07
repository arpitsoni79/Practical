package designPattern.singleton;

public class Arpit {
    private static volatile Arpit arpit;
    private Arpit(){
    }
    public static Arpit getArpit(){
        if (arpit == null){
            synchronized (Arpit.class){
                if(arpit == null){
                  arpit = new Arpit() ;
                }
            }
        }
        return arpit;
    }
}
class Example{
    public static void main(String[] args){
        Arpit a1 = Arpit.getArpit();
        Arpit a2 = Arpit.getArpit();
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
    }
}
