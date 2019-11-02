package view;

import model.Line;
import model.Lines;

import java.util.List;

public class OutputView {
    public void showResult(int height, int maxNameLength, List<String> names, Lines lines) {
        System.out.println("실행결과\n");
        printNames(maxNameLength, names);
        printAllLine(height, maxNameLength, names.size(), lines);
    }

    private void printNames(int maxNameLength, List<String> names) {
        for (int i = 0; i < names.size(); i++) {
            setTheInterval(maxNameLength - names.get(i).length());
            System.out.print(names.get(i) + " ");
        }
        System.out.println();
    }

    private void printAllLine(int height, int maxNameLength, int countOfPerson, Lines lines) {
        for (int i = 0; i < height; i++) {
            printLine(maxNameLength, countOfPerson, lines.getLine(i));
        }
    }

    private void printLine(int maxNameLength, int countOfPerson, Line line) {
        for (int i = 0; i < countOfPerson; i++) {
            drawHorizontalLine(i, maxNameLength, line);
            drawVerticalLine();
        }
        System.out.println();
    }

    private void drawVerticalLine() {
        System.out.print("|");
    }

    private void drawHorizontalLine(int curIndex, int maxNameLength, Line line) {
        //이것을 삼항 연산자로 했을 때는 오류가 나는 데 if-else문을 사용하지 않고 나타낼 수 있는 법을 모르겠습니다.
        if (line.getLine().get(curIndex)) {
            drawMaxNameLength(maxNameLength);
        } else {
            setTheInterval(maxNameLength);
        }
    }

    private void drawMaxNameLength(int maxNameLength) {
        for (int i = 0; i < maxNameLength; i++) {
            System.out.print("-");
        }
    }

    private void setTheInterval(int interval) {
        for (int i = 0; i < interval; i++) {
            System.out.print(" ");
        }
    }
}
