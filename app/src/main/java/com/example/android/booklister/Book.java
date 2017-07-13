package com.example.android.booklister;

/**
 * Created by garywhite61 on 13/07/2017.
 */

public class Book {

    // Book Title
    private String mTitle;
    // Book Description
    private String mSubtitle;
    // Book Author
    private String mAuthors;
    // Book Url
    private String mUrl;

    /**
     * Create a new Book object from five inputs
     *
     * @param title    is the title of the book
     * @param authors   is the author of the book
     * @param url  is the URL of the book
     * @param subtitle is the image URL of the book
     */

    public Book(String title, String subtitle, String authors, String url) {
        mTitle = title;
        mSubtitle = subtitle;
        mAuthors = authors;
        mUrl = url;
    }

    // Get the title of the book
    public String getTitle() { return mTitle; }
    // Get the author of the book
    public String getAuthors() {
        return mAuthors;
    }
    // Get the description of the book
    public String getSubtitle() {
        return mSubtitle;
    }
    // Get the url of the book
    public String getUrl() {
        return mUrl;
    }
}
