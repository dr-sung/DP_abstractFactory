
/**
 * participant: Client
 */
public class Computer {

    private ComputerFactory factory;

    public void setFactory(ComputerFactory factory) {
        this.factory = factory;
    }

    String createComputer() {
        CPU cpu = factory.makeCPU();
        Screen screen = factory.makeScreen();

        return cpu.getSpecification() + " | " + screen.getSpecification();
    }

}
