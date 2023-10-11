package actividad1;

import java.io.IOException;

public class Actividad1 {

	public static void main(String[] args) throws IOException {

		String ruta = "C:\\\\WINDOWS\\\\system32\\\\notepad.exe";

		Ejecutar ejecutar = new Ejecutar();

		ejecutar.Ruta(ruta);
		System.out.println("Hecho");

	}

}
