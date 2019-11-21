package controller;

import model.Ladder;
import model.Name;
import model.Names;
import model.Result;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static view.InputView.*;
import static view.OutputView.*;


public class LadderController {

    public void run() {
        Names names = new Names(inputNames().stream()
                .map(Name::new)
                .collect(Collectors.toList())
        );
        Result result = new Result(inputResult(), names.getNamesSize());
        int height = inputHeight();
        Ladder ladder = new Ladder();
        ladder.addLine(height, names.getNamesSize());
        showLadder(height, names, result, ladder);
        String findName = inputFindName();
        if (findName.equals("all")) {
            List<String> results = new ArrayList<>();
            for (int i = 0; i < names.getNamesSize(); i++) {
                results.add(result.getResult(ladder.rideLadder(i, 0)));
            }
            showExecutionResultAll(names, results);
        } else {
            String findResult = result.getResult(ladder.rideLadder(names.findNameIndex(findName), 0));
            showExecutionResult(findResult);
        }
    }
}
