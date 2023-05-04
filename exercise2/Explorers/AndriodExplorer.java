package Explorers;
import Planets.*;


public class AndriodExplorer implements Explorer {

    @Override
    public void visit(Mercury mercury) {
       System.out.println("Krazy Andriod Explorer landed at .........Mercury");
    }

    @Override
    public void visit(Mars mars) {
        System.out.println("Krazy Andriod Explorer landed at .........Mars");
    }

    @Override
    public void visit(Saturn saturn) {
        System.out.println("Krazy Andriod Explorer landed at .........Saturn");
    }

    @Override
    public void visit(Earth earth) {
        System.out.println("Krazy Andriod Explorer landed at .........Earth");
    }

    @Override
    public void visit(Venus venus) {
        System.out.println("Krazy Andriod Explorer landed at .........Venus");
    }

    @Override
    public void visit(Uranus uranus) {
        System.out.println("Krazy Andriod Explorer landed at .........Mercury");
    }

    @Override
    public void visit(Jupiter jupiter) {
        System.out.println("Krazy Andriod Explorer landed at .........Jupiter");
    }

    @Override
    public void visit(Neptune neptune) {
        System.out.println("Krazy Andriod Explorer landed at .........Neptune");
    }

    @Override
    public void visit(Pluto pluto) {
        System.out.println("Krazy Andriod Explorer landed at .........Pluto");
    }

}