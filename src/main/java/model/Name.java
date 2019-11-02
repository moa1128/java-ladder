package model;

import java.util.ArrayList;
import java.util.List;

public class Name {
    private static final int MAX_NAME_LENGTH = 5;
    private static List<String> names = new ArrayList<>();

    public void insertNames(List<String> names) {
        this.names = names;
    }

    public boolean checkNameLength() {
        if (names.stream().anyMatch(x -> x.length() > MAX_NAME_LENGTH)) {
            System.out.println("이름은 최대 5글자만 가능합니다.");
            return true;
        }
        return false;
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

    public List<String> getNames() {
        return names;
    }
}
