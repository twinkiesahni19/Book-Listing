package com.example.android.booklisting;

/**
 * Created by Twinkle Sahni on 28-Apr-17.
 */

public class Book {
    public String mTitle;
    public String mAuthor;
    public String mDescription;
    public String mPublisher;

    public Book(String Title, String Author, String Description, String Publisher) {
        mTitle = Title;
        mAuthor = Author;
        mDescription = Description;
        mPublisher = Publisher;

    }

    public String getTitle() {
        return mTitle;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public String getDescription() {
        return mDescription;
    }

    public String getPublisher() {
        return mPublisher;
    }
}