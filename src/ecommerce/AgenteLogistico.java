package ecommerce;

public class AgenteLogistico implements Observer {
    public void update(String status, String detalhes) {
        if (status.equals("CONFIRMADA")) {
            System.out.println("Compra confirmada: " + detalhes);
        } else if (status.equals("CANCELADA")) {
            System.out.println("Compra cancelada: " + detalhes);
        }
    }
}