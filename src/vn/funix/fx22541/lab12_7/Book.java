package vn.funix.fx22541.lab12_7;

abstract class Book {
    String title;

    String getTitle() {
        return title;
    }

    abstract void setTitle(String s);
}