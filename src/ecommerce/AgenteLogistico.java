package ecommerce;

public class AgenteLogistico implements Observer {
    private String nome;
    public AgenteLogistico(String nome) {
        this.nome = nome;
    }
    public void update(String status, String detalhes) {
        if (status.equals("CONFIRMADA")) {
            System.out.println("Compra confirmada: " + detalhes + " - Agente Logistico " + nome);
        } else if (status.equals("CANCELADA")) {
            System.out.println("Compra cancelada: " + detalhes + " - Agente Logistico " + nome);
        }
    }

}