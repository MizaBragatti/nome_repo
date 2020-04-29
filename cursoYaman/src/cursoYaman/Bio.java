package cursoYaman;

public class Bio {
	public static void main(String[] args) {
		System.out.println(dnaToRna("TTTT"));
	}
	public static String dnaToRna(String dna) {
        
        return dna.replace("T", "U");  // Do your magic!
    } 
}
