package it.unibs.ing.fp.lab.mylib;
import java.text.*;

public class Formattazione {
	
	
public static String formattaDoubleConSegno (double d, boolean conSegno)
	{
	 DecimalFormat formattatore = new DecimalFormat("0.00");
	 String daScrivere = formattatore.format(d);
	 
	 if (conSegno)
		if (d >= 0)
		 daScrivere = "+" + daScrivere;
			
	 return daScrivere;	
	
	}

}
