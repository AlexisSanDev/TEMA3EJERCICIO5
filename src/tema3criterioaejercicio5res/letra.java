package tema3criterioaejercicio5res;

public class letra {
	
	private char letra;
	letra(char l){
		letra = 1;
		
		if(l >= 'a') {
			letra -= 'a';
			letra += 'A';
		}
		
	}
	
	public char getLetras(){
		return letra;
	}
	
	public void printLetra() {
		System.out.println(letra);
	}
}
