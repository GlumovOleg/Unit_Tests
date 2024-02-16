package gb.glumov.homeWork.hw4.book;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class BookServiceTest {

    @Test
    void testGetBookById(){
        BookRepository bookRepository = mock(BookRepository.class);

        BookService bookService = new BookService(bookRepository);

        when(bookRepository.findById("5")).thenReturn(new Book("5"));

        Book book = bookService.findBookById("5");

        assertEquals("5", book.getId());

        verify(bookRepository, times(1)).findById("5");
    }
}