import java.time.LocalDate;

public class Book {
    private String bookName;
    private final Author authorName;
    private int publishYear;

    public Book(String bookName, Author authorName, int publishYear) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.publishYear = publishYear;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthorName() {
        return authorName;
    }

    public int getPublishYear() {
        return this.publishYear;
    }

    public void setPublishYear(int publishYear) {
        int currentYear = LocalDate.now().getYear();
        if (publishYear < 868 || publishYear > currentYear) {
            System.out.println("Неверное значение года публикации - " + publishYear);
            return;
        } // 868 год появилась первая печатная книга =)
        this.publishYear = publishYear;
    }
}
