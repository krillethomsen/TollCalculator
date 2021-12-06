public class Motorbike implements Vehicle  {
    public boolean rushhour;
    public int howmany; 

    public int getFee() {
        return 8;
    }

    public int HowManyTimes() {
        return howmany;
    }

    public boolean rushhour() {
        return true;
    }

    public Motorbike (boolean rushhour, int howmany){
        this.rushhour = rushhour;
        this.howmany = howmany;

    }
 
    public void PrintDetail() {
        
        System.out.println("The fee for Motorbike is " + getFee());
        System.out.println("It passed "+ howmany + " times today.");

        // it maybe should be specified with specific time. 
        if (rushhour == true){
            System.out.println("You passed under the rushhour, extra fee is charged");
        }
        // it should be limited maximum 60kr  
        System.out.println("Total fee is : " + HowManyTimes()*getFee());

    }

}