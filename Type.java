package ticTacToe;

public enum Type {

    X("X"), O("O"), EMPTY("EMPTY");

    private final String type;

    Type(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}
