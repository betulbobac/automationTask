package app.model;

import app.interfaces.IResult;

import java.util.ArrayList;

public class BookResponse implements IResult {
    private ArrayList<Book> result;

    public ArrayList<Book> getResult() {
        return result;
    }

    public void setResult(ArrayList<Book> result) {
        this.result = result;
    }

    public BookResponse(ArrayList<Book> result) {
        this.result = result;
    }
}
