package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @DisplayName("Test proper")
    @Test
    void groupAssertions() {
        Person person = new Person(1l, "Joe", "Back");
        assertAll("Test Props Set",
                () -> assertEquals(person.getFirstName(), "Joe", "first name failed"),
                () -> assertEquals(person.getLastName(), "Back"));
    }

    @RepeatedTest(5)
    void repeatedTest(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.println(testInfo.getDisplayName() + " : " + repetitionInfo.getCurrentRepetition());

    }
}