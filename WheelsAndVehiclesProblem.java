import java.util.*;
public class WheelsAndVehiclesProblem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int v=sc.nextInt();
		int w=sc.nextInt();
		int tw=((4*v)-w)/2;
		int fw=v-tw;
		System.out.println("TW:"+tw+" FW:"+fw);
	}

}
