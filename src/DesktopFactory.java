/**
 *   participant: ConcreteFactory1
 */
public class DesktopFactory implements ComputerFactory {

    @Override
    public CPU makeCPU() {
        return new CPUDesktop();
    }

    @Override
    public Screen makeScreen() {
        return new ScreenDesktop();
    }
    
}
