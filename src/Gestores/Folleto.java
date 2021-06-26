package Gestores;

import entidades.Oferta;
import java.util.ArrayList;

public class Folleto {

    private ArrayList<Oferta> ofertas = new ArrayList<>();

    public void agregarOferta(Oferta o) {
        ofertas.add(o);
    }

    public Object[] mostrarOferta() {
        return ofertas.toArray();
    }

    public int calcularStock() {
        int cantStock = 0;

        for (Oferta o : ofertas) {
            cantStock += o.getProducto().getStock();
        }
        return cantStock;
    }
    public int CalcularDiferenciaMayor()
    {
        int cant =0;
        
        for (Oferta o : ofertas) {
            float diferencia = (o.getProducto().getPrecio() - o.calcularOferta());
            if (diferencia >20) {
                cant ++;
            }
        }
        return cant;
    }
}
