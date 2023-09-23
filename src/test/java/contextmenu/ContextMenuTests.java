package contextmenu;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTest {

    @Test
    public void testRightClick(){
        var contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.rightClickMenu();
        String popUpText = contextMenuPage.alert_getText();
        contextMenuPage.alert_clickToAccept();
        assertEquals(popUpText,"You selected a context menu");
    }
}
