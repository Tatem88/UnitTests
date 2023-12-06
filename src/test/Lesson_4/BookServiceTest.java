package test.Lesson_4;

import Lesson_4.BookRepository;
import Lesson_4.BookService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

public class BookServiceTest {
    @Mock
    private BookRepository bookRepository;

    private BookService bookService;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        bookService = new BookService(bookRepository);
    }

    @Test
    public void testGetBookInformation() {
        String bookName = "Unit Tests";
        bookService.getBookInformation(bookName);
        verify(bookRepository).getInformationAboutBooks(bookName);
    }
}