package Lesson1.Homework;

import Lesson1.HomeworkCheat.Date;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


    public class TestDate{
        @Test
        public void testGoodDate()
        {
            assertEquals("2021-02-28",new Date(2021,2,28).toString());

        }
    }

