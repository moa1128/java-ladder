package model;

import java.util.ArrayList;

public class Ladder {
    private ArrayList<Line> ladder = new ArrayList<>();
    private int countOfPerson;

    public void addLine(int height, int countOfPerson) {
        this.countOfPerson = countOfPerson;
        for (int i = 0; i < height; i++) {
            ladder.add(new Line(countOfPerson));
        }
    }

    public int rideLadder(int findIndex, int lineIndex) {
        while (lineIndex < ladder.size()) {
            if (getLine(lineIndex).getPoint(findIndex)) {
                return rideLadder(findIndex - 1, lineIndex + 1);
            } else if (findIndex < countOfPerson - 1 && getLine(lineIndex).getPoint(findIndex + 1)) {
                return rideLadder(findIndex + 1, lineIndex + 1);
            } else {
                return rideLadder(findIndex, lineIndex + 1);
            }
        }
        return findIndex;
    }

    public Line getLine(int index) {
        return ladder.get(index);
    }
}
