package model;

import java.util.List;

public class Result {
    private List<String> result;

    public Result(List<String> result, int namesCount) {
        validResult(result, namesCount);
        this.result = result;
    }

    private void validResult(List<String> result, int namesCount) {
        if (result.size() != namesCount) {
            throw new IllegalArgumentException("결과를 이름 수 만큼 입력해야합니다.");
        }
    }

    public int getResultSize() {
        return result.size();
    }

    public String getResult(int index) {
        return result.get(index);
    }
}
