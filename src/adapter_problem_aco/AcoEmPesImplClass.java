package adapter_problem_aco;

public class AcoEmPesImplClass extends AcoEmMetros implements AcoEmPesInterface {

    public Aco comprarAcoEmPes(double qtdEmPes) {
        double qtdEmMetros = PesParaMetro(qtdEmPes);
        return comprarAco(qtdEmMetros);
    }

    private double PesParaMetro(double qtdEmPes) {
        return qtdEmPes * 0.3048;
    }

}
