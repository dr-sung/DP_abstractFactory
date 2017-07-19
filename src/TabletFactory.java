/**
 *   participant: ConcreteFactory2
 */
public class TabletFactory implements ComputerFactory {

    @Override
    public CPU makeCPU() {
        return new CPUMobile();
    }

    @Override
    public Screen makeScreen() {
        return new ScreenMobile();
    }
    
}
