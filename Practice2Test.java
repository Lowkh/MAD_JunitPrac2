package sg.edu.np.mad.madpractical2;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest{
    private User user;
    
    @Test
    public void testUser(){
        user = new User("John Doe", "MAD Developer", 1, false);
        assertEquals("John Doe", user.description);
        assertEquals("MAD Developer", user.name);
        assertEquals(1, user.id);
        assertEquals(false, user.followed);
    }

}
