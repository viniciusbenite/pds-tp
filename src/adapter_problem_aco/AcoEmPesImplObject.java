package adapter_problem_aco;

public class AcoEmPesImplObject implements AcoEmPesInterface {

    private final AcoMetroInterface acoEmMetros = new AcoEmMetros();

    public Aco comprarAcoEmPes(double qtdEmPes) {
        double qtdEmMetros = pesParaMetros(qtdEmPes);
        return acoEmMetros.comprarAco(qtdEmMetros);
    }

    private double pesParaMetros(double qtdEmPes) {
        return qtdEmPes * 0.3048;
    }

}
