public class CashRegister{
    // Valor a ser pago
    private double value;
    // Numero de produtos registrados
    private int nProd;

    // Adiciona item a item a partir do preço unitario
    public void addItem(double price){
        value += price;
        nProd++;
    }

    // Retornar o total a ser pago
    public double getTotal(){
        return value;
    }

    // Retornar o Numero de itens inseridos na compra corrente
    public int getCount(){
        return nProd;
    }

    // Prepara a caixa registradora para uma nova venda
    public void clean(){
        value = 0;
        nProd = 0;
    }


}