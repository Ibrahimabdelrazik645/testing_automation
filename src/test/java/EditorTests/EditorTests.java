package EditorTests;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class EditorTests extends BaseTest {

    @Test
    public void testTextEditor(){
        var editorPage = homePage.clickWYSIWYGEditor();
        String text1 = "Hello ";
        String text2 = "World";
        editorPage.clearTextArea();
        editorPage.setTextArea(text1);
        editorPage.increaseIndentation();
        editorPage.setTextArea(text2);
        assertEquals(editorPage.getTextFromTextArea(),"Hello World");

    }
}
