package view;
public class Main {
	public static void main(String[] args) {
		
		int num = 7;
		int fat = recursivaFat(num);
		System.out.println(fat);
	}

	private static int recursivaFat(int num) {
		if(num==0) { //condição de parada
			return 1;
		}
		return num * recursivaFat(num-1); //chamada recursiva
	}
}
