package builder;

public interface BookBuilder {
    BookBuilder setName (String name);
    BookBuilder setYear (int year);
    BookBuilder setAuthor(String author);
    BookInfo build ();
}
