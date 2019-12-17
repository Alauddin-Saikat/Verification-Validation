import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    private static Account account;
    @Test
    @BeforeAll
    static void Init(){
        account = new Account("Koushik" , "123456");
    }

    @Test
    void getName() {
        account.setName("DJ");
        assertTrue(account.getName() != "");
    }

    @Test
    void setName() {
        assertEquals(1,account.setName("ABC"));
        assertEquals(0,account.setName(""));
    }

    @Test
    void getPassword() {
        account.setPassword("12345678");
        assertTrue(account.getPassword().length() > 6);
    }

    @Test
    void setPassword() {
        assertThrows( IllegalArgumentException.class, () -> account.setPassword("123") );
        account.setPassword("1234567");
    }
}