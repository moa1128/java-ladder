package model;

import java.util.ArrayList;
import java.util.List;

public class Names {
    private final int MAX_NAME_LENGTH = 5;
    private List<String> names = new ArrayList<>();

    public void insertNames(List<String> names) {
        this.names = names;
    }

    public void checkNameLength() {
        if (names.stream().anyMatch(x -> x.length() > MAX_NAME_LENGTH)) {
            throw new IllegalArgumentException("이름이 5글자가 넘어갑니다.");
        }
    }

    public int getMaxNameLength() {
        int maxLength = names.get(0).length();
        for (int i = 1; i < names.size(); i++) {
            maxLength = findMaxLength(maxLength, i);
        }
        return maxLength;
    }

    private int findMaxLength(int maxLength, int index) {
        if (maxLength <= names.get(index).length()) {
            maxLength = names.get(index).length();
        }
        return maxLength;
    }

    public int getNamesSize() {
        return names.size();
    }

    public String getName(int index) {
        return names.get(index);
    }
}
