package p18_09_2023.Zadatak3;

import java.util.ArrayList;

public class FigureGenerator {

    public FigureGenerator() {
    }

    public static Figure generate(String figureType) {
        if (figureType.equals("rectangle")) {
            return new Rectangle(5, 10);
        } else if (figureType.equals("triangle")) {
            return new EquilateralTriangle(5);
        }
        return null;
    }

}


