import java.util.Random;
import java.util.Scanner;

class HeadsorTailsUser{
    public static void main(String[] arg){
	int res,h=0,t=0;
	String name;

	Random rnd = new Random();
	Scanner sc = new Scanner(System.in);

	System.out.println("Who are you?");
	name=sc.next();
	System.out.println("Hello, "+name+"!");
	
	System.out.println("Tossing a coin...");

	for(int i=0;i<3;i++){
	    System.out.print("Round "+(i+1)+": ");
	    res = rnd.nextInt(2);

	    if(res==0){
		System.out.println("Heads");
		h++;
	    }
	    else if(res==1){
		System.out.println("Tails");
		t++;
	    }
	}

	System.out.println("Heads: "+h+", Tails: "+t);
    }
}
