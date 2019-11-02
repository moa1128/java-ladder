package model;

import java.util.ArrayList;

public class Lines {
    private ArrayList<Line> lines = new ArrayList<>();

    public void addLine(int height, int countOfPerson) {
        for (int i = 0; i < height; i++) {
            lines.add(new Line(countOfPerson));
        }
    }

    public Line getLine(int index) {
        return lines.get(index);
    }
}
