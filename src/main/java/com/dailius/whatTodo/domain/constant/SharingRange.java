package com.dailius.whatTodo.domain.constant;

public enum SharingRange {
    ALL("전체 공개"), FRIEND("친구 공개"), ME("나만 보기");

    private final String range;

    SharingRange(String range) {
        this.range = range;
    }

    public String getRange() {
        return range;
    }
}
