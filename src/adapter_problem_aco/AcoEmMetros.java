package adapter_problem_aco;

public class AcoEmMetros implements AcoMetroInterface {

    public Aco comprarAco(double qtdEmMetro) {
        System.out.println("Comprando " + qtdEmMetro + " metros de aço.");
        return new Aco(qtdEmMetro);
    }

}
