import java.util.*;
public class WheelsAndVehiclesProblem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int vehicle=sc.nextInt();
		int wheels=sc.nextInt();
		int TwoWheeler=((4*v)-w)/2;
		int FourWheeler=v-tw;
		System.out.println("TwoWheeler:"+TwoWheeler+" FourWheeler:"+FourWheeler);
	}

}
