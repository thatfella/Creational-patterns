package builder;

public class BuilderDemo {
    public static void main(String[] args) {
        BookBuilder builder = new BookBuilderImpl();
        BookInfo info = builder.setName("Book").setAuthor("author").setYear(2000).build();
        System.out.println(info.toString());
    }
}
