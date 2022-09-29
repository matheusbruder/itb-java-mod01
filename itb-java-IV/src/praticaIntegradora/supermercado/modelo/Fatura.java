package praticaIntegradora.supermercado.modelo;

import java.util.List;

public class Fatura {
    private int codigo;

    private Cliente cliente;
    private List<Item> listaItens;
    private double valorTotal;

    public Fatura(Cliente cliente, List<Item> listaItens) {
        this.cliente = cliente;
        this.listaItens = listaItens;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Item> getListaItens() {
        return listaItens;
    }

    public void setListaItens(List<Item> listaItens) {
        this.listaItens = listaItens;
    }

    public double getValorTotal() {
        for (Item item : listaItens) {
            valorTotal += item.getPreco() * item.getQuantidade();
        }
        return valorTotal;
    }

    @Override
    public String toString() {
        return "Fatura" +
                "[" + codigo +
                "], cliente=" + cliente +
                ", listaItens=" + listaItens +
                ", valorTotal=" + valorTotal;
    }
}
