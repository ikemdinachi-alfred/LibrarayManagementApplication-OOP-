package libraryApplication.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
Book book;
    @BeforeEach
    public void testThisFirst() {
        book = new Book("id","title","author","100");
    }

    @Test
    public void testisAvailable() {
        book.setAvailable(true);
        assertTrue(book.isAvailable());
    }

    @Test
    void testThatIf_I_set_id_i_can_getId() {
        assertEquals("id",book.getId());
    }

    @Test
    void testThatIf_I_set_title_i_can_getTitle() {
        assertEquals("title",book.getTitle());
    }

    @Test
    void testThatIf_I_set_authori_can_getAuthor() {
        assertEquals("author",book.getAuthor());
    }

    @Test
    void testThatIf_I_set_pages_i_can_getPages() {
        assertEquals("100",book.getPages());
    }
}