package Lesson_4;



public class BookService {
    BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void getBookInformation(String bookName){
        bookRepository.getInformationAboutBooks(bookName);
    }
}