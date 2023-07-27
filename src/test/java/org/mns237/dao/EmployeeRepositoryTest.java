package org.mns237.dao;

import org.junit.jupiter.api.Test;
import org.mns237.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import static org.assertj.core.api.Assertions.*;

import java.util.Optional;

public class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository underTest;

    @Test
    void isShouldSelectIfEmployeeExistsEmail() {
        //given
        String email = "idrice24@yahoo.com";
        Employee employee = new Employee(
            "Idrice24",
        "idrice24@yahoo.com", null, null, null, null);
        underTest.save(employee);

        //when
        
        Optional<Employee> expected = underTest.findEmployeeByEmail(email);

        // then
        assertThat(expected).isPresent();

    }
}