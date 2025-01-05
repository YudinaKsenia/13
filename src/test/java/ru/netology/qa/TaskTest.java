package ru.netology.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

    Meeting meeting = new Meeting(
            555,
            "Выкатка 3й версии приложения",
            "Приложение НетоБанка",
            "Во вторник после обеда"
    );


    String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
    Epic epic = new Epic(55, subtasks);


    @Test

    public void shouldFindMatch() {

        boolean expected = true;
        boolean actual = simpleTask.matches("Позвонить");

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldFindMatch2() {

        boolean expected = true;
        boolean actual = meeting.matches("версии");

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldFindMatch3() {

        boolean expected = true;
        boolean actual = meeting.matches("НетоБанка");

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldFindMatch4() {

        boolean expected = true;
        boolean actual = meeting.matches("после обеда");

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldFindMatch5() {


        boolean expected = true;
        boolean actual = epic.matches("Яйца");

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldFindNoMatch() {

        boolean expected = false;
        boolean actual = simpleTask.matches("Не звонить");

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldFindNoMatch2() {

        boolean expected = false;
        boolean actual = meeting.matches("Обновление");

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldFindNoMatch3() {

        boolean expected = false;
        boolean actual = epic.matches("Бананы");

        Assertions.assertEquals(expected, actual);
    }
}