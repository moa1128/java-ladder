package view;

import model.Line;
import model.Ladder;
import model.Names;
import model.Result;

import java.util.List;


public class OutputView {
    public static void showLadder(int height, Names names, Result result, Ladder ladder) {
        System.out.println("사다리 결과");
        printNames(names);
        printAllLine(height, names.getMaxNameLength(), names.getNamesSize(), ladder);
        printResults(result, names.getMaxNameLength());
        System.out.println();
    }

    private static void printNames(Names names) {
        for (int i = 0; i < names.getNamesSize(); i++) {
            setTheInterval(names.getMaxNameLength() - names.getName(i).length(), " ");
            System.out.print(names.getName(i) + " ");
        }
        System.out.println();
    }
  
    private static void printResults(Result result, int maxNameLength) {
        for (int i = 0; i < result.getResultSize(); i++) {
            System.out.print(result.getResult(i));
            setTheInterval(maxNameLength - result.getResult(i).length(), " ");
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
  
    public static void showExecutionResult(String result) {
        System.out.println("실행 결과");
        System.out.println(result);
    }

    public static void showExecutionResultAll(Names names, List<String> results) {
        System.out.println("실행 결과");
        for (int i = 0; i < names.getNamesSize(); i++) {
            System.out.println(names.getName(i) + " : " + results.get(i));
        }


    }
}
