
public class Calculation extends Calcul  {
		  public void multiplication(int x, int y) {
		      z = x * y;
		      System.out.println("The product of the given numbers:"+z);
		   }
			public void division(int x, int y) {
				z=x/y;
			System.out.println("the division is:" +z);
			}
			public static void main(String args[]) {
		      int a = 20, b = 10;
		      Calcul demo = new Calcul ();
		       demo.addition(a, b);
		      demo.Subtraction(a, b);
		      demo.multiplication(a, b);
		      demo.division(a,b);
		   }
		}
