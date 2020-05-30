package adapter_problem_aco;

public class Client {

    public static void main(String[] args) {
        System.out.println("Adapter para classes:");
        AcoEmPesInterface adapterInterfaceClass = new AcoEmPesImplClass();

        adapterInterfaceClass.comprarAcoEmPes(1);
        adapterInterfaceClass.comprarAcoEmPes(10);

        System.out.println("-----------------------------------------------------------");

        System.out.println("Adapter para objetos:");
        AcoEmPesInterface adapterInterfaceObject = new AcoEmPesImplObject();

        adapterInterfaceObject.comprarAcoEmPes(1);
        adapterInterfaceObject.comprarAcoEmPes(40);
    }

}
