package controller;

import model.Lines;
import model.Name;
import view.InputView;
import view.OutputView;


public class LadderController {
    private static final InputView inputView = new InputView();
    private static final OutputView outView = new OutputView();
    private Name names = new Name();

    public void run() {
        gameStart();
    }

    private void gameStart() {
        do {
            names.insertNames(inputView.inputNames());
        } while (names.checkNameLength());
        int height = inputView.inputHeight();
        Lines lines = new Lines();
        lines.addLine(height, names.getNamesSize());
        outView.showResult(height, names.getMaxNameLength(), names.getNames(), lines);
    }
}
