package builder;

public class BookBuilderImpl implements BookBuilder {
    private String name;
    private int year;
    private String author;

    public BookBuilder setName (String name) {
        this.name=name;
        return this;
    }

    public BookBuilder setYear (int year) {
        this.year=year;
        return this;
    }

    public BookBuilder setAuthor (String author) {
        this.author = author;
        return  this;
    }

    public  BookInfo build () {
        if (author == null) {
            throw new IllegalArgumentException();
        }
        if (name == null) {
            throw new IllegalArgumentException();
        }
       return new BookInfo(name,year,author);
    }
}
