package proyecto;

import java.util.ArrayList;
import proyecto.clase1;
public class arreglo {
	private ArrayList<clase1>tienda;

public arreglo() {
	tienda=new ArrayList<clase1>();
	adicionar(new clase1(1020,"Fideos","NOSE",10,10));
}
public void adicionar(clase1 c) {
tienda.add(c);
}
public clase1 obtener(int c) {
	return tienda.get(c);
}
public clase1 buscar(int code) {
	for (int i=0;i<tienda.size();i++) {
		if(obtener(i).getCodigo()==code) return obtener(i);
	}
	return null;
}
public int tamaño() {
	return tienda.size();
}
}

