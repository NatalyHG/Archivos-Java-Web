package pe.egcc.demosession.service;
import java.util.ArrayList;
import java.util.List;
import pe.egcc.demosession.dto.Producto;

public class CarritoService {
private List<Producto> lista;
public CarritoService(){
	lista=new ArrayList<>();
}
public void agregar(Producto producto){
	//Calcular el importe
	producto.setImporte(producto.getPrecio()*producto.getCant());
	//Agregar a lista
	lista.add(producto);
}
public List<Producto> geLista(){
	return lista;
}
}
