package dropdown;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDownTest extends BaseTests {

    @Test
    public void testSelectOption(){
        var dropDownPage = homepage.clickDropdown();
        String option = "Option 1";
        dropDownPage.selectFromDropDown(option);
        var selectedOptions = dropDownPage.getSelectedOption();
        Assert.assertEquals(selectedOptions.size(), 1 , "Incorrect number of selections");
        Assert.assertTrue(selectedOptions.contains(option), "Option not selected");
    }
}
