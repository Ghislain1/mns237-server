package org.mns237.dao;

import org.junit.jupiter.api.Test;
import org.mns237.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;


public class UserRepositoryTest {

    @Autowired
    private UserRepository userTest;

    @Test
    void testFindAll() {

    }





    @Test
    void testFindByEmail() {
        //given
        String email = "idrice24@yahoo.com";
        Users user = new Users(0, "idrice24@yahoo.com");

        userTest.findByEmail(email);

        //when
        Users expected = userTest.findByEmail(email);

        //then
        email = user.getEmail();
        //assertThat(expected).getEmail();
        System.out.print(expected);

    }
}
