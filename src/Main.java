public class Main {
    public static void main(String[] args) {
        // Тренировака
        System.out.println("Тренировка");
        String nameJohn = "John";
        int ageJohn = 12;

        String nameSarah = "Sarah";
        int ageSarah = 30;

        String[] names = {"John", "Sarah"};
        int[] ages = {13, 30};

        for (int i = 0; i < names.length; i++) {
            System.out.println("Имя - " + names[i] + " Возраст - " + ages[i]);
        }
        Person sarah = new Person("Sarah", 30);
        System.out.println("sarah.name = " + sarah.getName());
        System.out.println("sarah.age = " + sarah.getAge());
        sarah.setAge(31);
        System.out.println("sarah.getAge() = " + sarah.getAge());
        Person john = new Person("John", 13);
        System.out.println(" ");
        // ДЗ
        System.out.println("ДЗ");
        Author authorRowling = new Author("Джоан Роулинг");
        Author authorTolsloi = new Author("Лев Толстой");
        Book book1 = new Book("Гарри Поттер и Философский камень", authorRowling.getAuthorName() , 1997);
        Book book2 = new Book("Война и мир", authorTolsloi.getAuthorName(), 1869);
        System.out.println("Книга 1 - " + book1.getBookName() + ", автор - " + book1.getAuthorName() + ", год публикации - " + book1.getPublishYear());
        System.out.println("Книга 2 - " + book2.getBookName() + ", автор - " + book2.getAuthorName() + ", год публикации - " + book2.getPublishYear());
        book2.setPublishYear(1873);
        System.out.println("Книга 2 - " + book2.getBookName() + ", автор - " + book2.getAuthorName() + ", год публикации - " + book2.getPublishYear());
    }
}