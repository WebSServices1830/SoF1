package Persistencia;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.*;

public class Main {

	public static void main(String[] args) {
		JaxbWriterReader jaxb = new JaxbWriterReader();
		Campeonato c = (Campeonato) jaxb.jaxbReader(Campeonato.class, "C:\\Users\\Michael\\eclipse-workspace\\JAXB-SoF1\\Data\\campeonato.xml");
				
		//jaxb.jaxbWriter(c, "campeonato.xml");
		
	}
}
