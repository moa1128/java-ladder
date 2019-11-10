package view;

import model.Line;
import model.Ladder;
import model.Names;

public class OutputView {
    public static void showResult(int height, Names names, Ladder ladder) {
        System.out.println("실행결과\n");
        printNames(names);
        printAllLine(height, names.getMaxNameLength(), names.getNamesSize(), ladder);
    }

    private static void printNames(Names names) {
        for (int i = 0; i < names.getNamesSize(); i++) {
            setTheInterval(names.getMaxNameLength() - names.getName(i).length(), " ");
            System.out.print(names.getName(i) + " ");
        }
        System.out.println();
    }

    private static void printAllLine(int height, int maxNameLength, int countOfPerson, Ladder ladder) {
        for (int i = 0; i < height; i++) {
            printLine(maxNameLength, countOfPerson, ladder.getLine(i));
        }
    }

    private static void printLine(int maxNameLength, int countOfPerson, Line line) {
        for (int i = 0; i < countOfPerson; i++) {
            drawHorizontalLine(i, maxNameLength, line);
            drawVerticalLine();
        }
        System.out.println();
    }

    private static void drawVerticalLine() {
        System.out.print("|");
    }

    private static void drawHorizontalLine(int curIndex, int maxNameLength, Line line) {
        setTheInterval(maxNameLength, line.makeBridge(curIndex));
    }

    private static void setTheInterval(int interval, String sign) {
        for (int i = 0; i < interval; i++) {
            System.out.print(sign);
        }
    }
}
