public class App{
	public static void main(String[] args){
		int a =0;
		int b=1;
		for(int i =0; i < 13; i++){
			System.out.print(a+" ");
			int c = a +b;
			a = b;
			b = c;
		}
	}
}