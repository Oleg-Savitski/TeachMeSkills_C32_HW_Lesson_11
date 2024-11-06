package com.teachmeskills.lesson_11.document;

/** Этот класс используется для создания объекта, который хранит номер документа.
 */

public class DocumentNumber {
    private final String number;

    public DocumentNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }
}
