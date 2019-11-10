package controller;

import model.Ladder;
import model.Names;

import static view.InputView.inputHeight;
import static view.InputView.inputNames;
import static view.OutputView.showResult;


public class LadderController {

    public void run() {
        gameStart();
    }

    private void gameStart() {
        Names names = new Names();
        names.insertNames(inputNames());
        names.checkNameLength();
        int height = inputHeight();
        Ladder ladder = new Ladder();
        ladder.addLine(height, names.getNamesSize());
        showResult(height, names, ladder);
    }
}
