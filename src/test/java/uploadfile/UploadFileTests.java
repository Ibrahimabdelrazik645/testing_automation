package uploadfile;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class UploadFileTests extends BaseTest {

    @Test
    public void teatUploadFile(){
        var uploadPage = homePage.clickFileUploader();
        uploadPage.uploadFile("D:\\Telegram Files\\girl.gif.mp4");
        assertEquals(uploadPage.getUploadedFile(),"girl.gif.mp4");
    }
}
