package main;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Veiculo vel = new Veiculo("Ferrari Enzo", 2002, "Ferrari", 2000.0);

        System.out.println("O aluguel de uma Ferrari Enzo modelo 2002 é de: R$" + vel.calculaAluguel(30, vel));
        System.out.println("O valor da multa para "+ 5 +" dias de atraso de uma Ferrari Enzo 2002 é de: R$" + vel.calculaMulta(5, 10, vel));

    }
}