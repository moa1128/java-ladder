package model;

public class Name {
    private final int MAX_NAME_LENGTH = 5;
    private String name;

    public Name(String name) {
        validName(name);
        this.name = name;
    }

    private void validName(String name) {
        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException("이름이 5글자보다 큽니다");
        }
    }

    public int nameLength() {
        return name.length();
    }

    public String getName() {
        return name;
    }
}
