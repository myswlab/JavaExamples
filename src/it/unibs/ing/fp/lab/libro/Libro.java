package it.unibs.ing.fp.lab.libro;

import java.net.MalformedURLException;
import java.net.URL;

public class Libro implements OnLine, HasCopyRight {

	private static final String PAGE_MESSAGE = "Il numero di pagine è :";
	protected int numPagine;
	
	Libro(int pagine) {
		this.numPagine = pagine;
	}
	
	
	
	public void pageMessage() {
		System.out.println(PAGE_MESSAGE + numPagine);
	}



	@Override
	public URL getUrl() {
		
		try {
			return new URL("blablabla");
		} catch (MalformedURLException e) {
			
			//manage exception here
			return null;
		}
	}



	@Override
	public String getISBNCode() {
		
		//method implementation!!
		return "";
	}
}
