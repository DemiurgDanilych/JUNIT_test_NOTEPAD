import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;

class MainTest {

    @ParameterizedTest
    @ValueSource(ints = {-1, 2, 5})
    void goingAboveTest(int number) {
        boolean t = Main.goingAbove(number);
        if(number < 0 | number > 3) {
            Assertions.assertTrue(t);
        }else {
            Assertions.assertFalse(t);
        }
    }

    @Test
    void ifTheWordTest (){
        String str = "Word";
        int actual = 999_999;
        int result = Main.ifTheWord(str);
        Assertions.assertEquals(actual,result);
    }

    @Test
    void removeChekListTest(){
        int numberOfDeletePosition = 3;

        List<String> testList = new ArrayList<>();
        testList.add("Задача 1");
        testList.add("Задача 2");
        testList.add("Задача 3");
        testList.add("Задача 4");

        List<String> actualList = new ArrayList<>();
        actualList.add("Задача 1");
        actualList.add("Задача 2");
        actualList.add("Задача 4");

        Main.removeChekList(testList,numberOfDeletePosition);

        Assertions.assertEquals(testList, actualList);
    }

}