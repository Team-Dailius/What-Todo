package com.dailius.whatTodo.domain.constant;

public enum Color {
    RED("#B82647"), CORAL("#FF7F50"),
    ORANGE("#FF8C00"), YELLOW("#FEE134"),
    PINK("#F53FCC");

    private final String colorHexCode;

    Color(String colorHexCode) {
        this.colorHexCode = colorHexCode;
    }

    public String getColorHexCode() {
        return colorHexCode;
    }
}
