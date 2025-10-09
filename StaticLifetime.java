public class StaticLifetime {
 //Q1
    static int counter=0;
    public void incrementsCounter() {
        counter++;
        System.out.println("Counter: " + counter);
    }
    public static void main (String[]args){
        StaticLifetime obj1= new StaticLifetime();
        obj1.incrementsCounter();
        StaticLifetime obj2= new StaticLifetime();
        obj2.incrementsCounter();
    }






}




