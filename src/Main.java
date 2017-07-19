/**
 *   AbstractFactory design pattern
 */
public class Main {
    
    public static void main(String[] args) {
        
        Computer computer = new Computer();
        
        computer.setFactory(new DesktopFactory());
        String c1 = computer.createComputer();
        System.out.println(c1);
        
        computer.setFactory(new TabletFactory());
        String c2 = computer.createComputer();
        System.out.println(c2);
    }
    
}
