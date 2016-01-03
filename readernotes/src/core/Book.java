package readernotes.src.core;

import readernotes.src.exceptions.EmptyTitleException;
import readernotes.src.exceptions.EmptyAuthorException;

public class Book {
    private static final String DEFAULT = "DEFAULT";
    private String _title;
    private String _author;
    private String _sinopse;
    
    public Book(String title, String author)
    throws
    EmptyTitleException,
    EmptyAuthorException {
        this(title, author, DEFAULT);
    }
    
    public Book(String title, String author, String sinopse)
    throws
    EmptyTitleException,
    EmptyAuthorException {
        init(title, author, null);
    }
    
    public void init(String title, String author, String sinopse)
    throws
    EmptyTitleException,
    EmptyAuthorException {
        setTitle(title);
        setAuthor(author);
        setSinopse(sinopse);
    }
    
    public void setTitle(String title)
    throws
    EmptyTitleException {
        if (verifyIfEmpty(title)) {
            _title = title;
        } else {
            throw new EmptyTitleException();
        }
    }
    
    public void setAuthor(String author)
    throws
    EmptyAuthorException {
        if (verifyIfEmpty(author)) {
            _author = author;
        } else {
            throw new EmptyAuthorException();
        }
    }
    
    public void setSinopse(String sinopse) {
        if (verifyIfEmpty(sinopse)) {
            _sinopse = DEFAULT;
        } else {
            _sinopse = sinopse;
        }
    }
    
    public boolean verifyIfEmpty(String value) {
        return value != null || value != "";
    }
}