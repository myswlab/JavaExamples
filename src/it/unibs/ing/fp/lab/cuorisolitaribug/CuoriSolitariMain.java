package it.unibs.ing.fp.lab.cuorisolitaribug;

public class CuoriSolitariMain {

	private String STR_SALUTO_INIZIALE = "Ciao! Inserisci i dati dei cuori solitari...";

	public static void main(String[] args) {
		System.out.println(STR_SALUTO_INIZIALE);
			
		CuoreSolitario cs1 = CuoriSolitariUtils.leggiCuoresolitario(); 
		CuoreSolitario cs2 = CuoriSolitariUtils.leggiCuoresolitario();
		
		String isAffine = cs1.isAffineWith(cs2) ? " non": "";
		String message = String.format("%s%s è potenzialmenteee affine con %s", cs1, isAffine, cs2);
		System.out.println(message);
	}

	

}
