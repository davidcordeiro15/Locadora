package main;

public class Veiculo {

    private String modelo;
    private int ano;
    private String marca;
    private double diaria;

    public Veiculo(String modelo, int ano, String marca, double diaria) {
        this.modelo = modelo;
        this.ano = ano;
        this.marca = marca;
        this.diaria = diaria;
    }

    public Double calculaAluguel(int dias, Veiculo veiculo) {
        if (dias <= 0) {
            return 0.0;
        }
        if (dias >= 30) {
            // Desconto de 30% para alugueis com mais de 30 dias
            return (veiculo.diaria * dias)*0.7;
        } else if (dias >= 20) {
            // Desconto de 20% para alugueis com mais de 20 dias
            return (veiculo.diaria * dias) * 0.8;
        } else if(dias >= 7)
            // Desconto de 10% para alugueis de mais de 7 dias
            return (veiculo.diaria * dias)*0.9;
        return veiculo.diaria * dias;
    }

    public Double calculaMulta(int diasPagos, int diasUsados,Veiculo veiculo) {
        if (diasPagos < diasUsados) {
            // Multa de 20%
            return calculaAluguel(diasUsados, veiculo)*1.2;
        }
        return 0.0;
    }


}
