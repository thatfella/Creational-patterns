package builder;

public class BookInfo {

    public BookInfo(String name, int year, String author) {
        this.name = name;
        this.year = year;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    private String name;
    private int year;
    private String author;

    @Override
    public String toString() {
        return "BookInfo :" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", author='" + author + '\'';
    }
}
