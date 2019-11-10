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
            maxLength = findMaxLength(maxLength, i);
        }
        return maxLength;
    }

    private int findMaxLength(int maxLength, int index) {
        if (maxLength <= names.get(index).nameLength()) {
            maxLength = names.get(index).nameLength();
        }
        return maxLength;
    }

    public int getNamesSize() {
        return names.size();
    }

    public String getName(int index) {
        return names.get(index).getName();
    }
}
