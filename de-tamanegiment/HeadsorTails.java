import java.util.Random;

class HeadsorTails{
    public static void main(String[] arg){
	int res,h=0,t=0;

	Random rnd = new Random();

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
