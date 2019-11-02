package model;

import java.util.ArrayList;
import java.util.Random;

public class Line {
    private static final int START_INDEX = 0;
    private ArrayList<Boolean> points = new ArrayList<>();

    public Line(int countOfPerson) {
        points.add(false);
        addPoint(countOfPerson);
        for (int i = 0; i < points.size(); i++) {
            removeClash(i);
        }
    }

    private void addPoint(int count) {
        for (int i = 1; i < count; i++) {
            points.add(i, makeLadder());
        }
    }

    private boolean makeLadder() {
        return new Random().nextBoolean();
    }

    private void removeClash(int currentIndex) {
        if ((currentIndex - 1) >= START_INDEX && points.get(currentIndex) && points.get(currentIndex - 1)) {
            points.add(currentIndex, false);
        }
    }

    public ArrayList<Boolean> getLine() {
        return points;
    }
}
