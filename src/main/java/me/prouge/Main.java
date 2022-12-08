package me.prouge;

public class Main {

    public static void main(String[] args){
        final TruncatedCone cone = new TruncatedCone(12, 5.3, 7.5);
        final TruncatedCone cone2 = new TruncatedCone(new Circle(12), new Circle(5.3), 7.5);

        cone.printToConsole();
        cone2.printToConsole();
    }

}
