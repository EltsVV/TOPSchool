package org.RPS.player;

import org.RPS.game.Figure;

import java.util.Scanner;

public class CyborgPlayer extends Player {
    public CyborgPlayer(String _name) {
        super(_name);
        countChoice = 0;
    }
    int countChoice;
    @Override
    public void choiceFigure() {
        if (countChoice < 3) {
            setCurrentFigure(Figure.getFigure());
            countChoice++;
        }
        else {
            countChoice = 0;
            System.out.println("Выберите номер фигуры:");
            Figure.printFigures();

            Figure tmpFigure = null;

            Scanner in = new Scanner(System.in);
            do {
                int numFigure = -1;

                numFigure = in.nextInt();

                tmpFigure = Figure.getFigure(numFigure);
                if (tmpFigure == null)
                    System.out.println("Неверно выбрана фигура");
            } while (tmpFigure == null);

            setCurrentFigure(tmpFigure);
        }

    }
}
