package model;

import java.util.List;

public class Names {
    private List<Name> names;

    public Names(List<Name> names) {
        this.names = names;
    }

    public int getMaxNameLength() {
        int maxLength = names.get(0).nameLength();
        for (int i = 1; i < names.size(); i++) {
            maxLength = findMaxLength(maxLength, names.get(i).nameLength());
        }
        return maxLength;
    }

    public int findNameIndex(String name) {
        int elementIndex = -1;
        for (int i = 0; i < names.size(); i++) {
            elementIndex = findIndex(i, name);
        }
        checkFailFindName(elementIndex);
        return elementIndex;
    }

    public int findMaxLength(int maxLength, int curLength) {
        if (maxLength <= curLength) {
            maxLength = curLength;
        }
        return maxLength;
    }

    private int findIndex(int index, String name) {
        if (names.get(index).getName().equals(name))
            return index;
        return -1;
    }

    private void checkFailFindName(int elementIndex) {
        if (elementIndex < 0) {
            throw new IllegalArgumentException("찾는 이름이 없습니다.");
        }
    }

    public int getNamesSize() {
        return names.size();
    }

    public String getName(int index) {
        return names.get(index).getName();
    }
}
