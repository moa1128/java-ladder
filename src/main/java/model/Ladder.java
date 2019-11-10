package model;

import java.util.ArrayList;

public class Ladder {
    private ArrayList<Line> ladder = new ArrayList<>();

    public void addLine(int height, int countOfPerson) {
        for (int i = 0; i < height; i++) {
            ladder.add(new Line(countOfPerson));
        }
    }

    public Line getLine(int index) {
        return ladder.get(index);
    }
}
