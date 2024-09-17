public class SnakeInAMatrix {
	private static final int String = 0;

	public static int finalPositionOfSnake(int n, List<String> commands) {
	       int ans=0;
	       for(int i=0;i<commands.size();i++){
	            String temp=commands.get(i);
	        switch(temp){
	            case "UP":ans=ans-n;
	                        break;
	            case "DOWN":ans=ans+n;
	                        break;
	            case "LEFT":ans=ans-1;
	                        break;
	            case "RIGHT":ans=ans+1;
	                        break;
	        }
	        
	       } 
	       return ans;
	    }

	public static void main(String[] args) {
		List<String>commands=new ArrayList<>();
		int n=3;
		commands.add("RIGHT");
		commands.add("DOWN");
		commands.add("LEFT");
		commands.add("UP");
		int ans=finalPositionOfSnake(n,commands);
		System.out.println(ans);

	}

}
