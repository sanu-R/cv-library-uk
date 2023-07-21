package uk.co.library.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;
import uk.co.library.testbase.BaseTest;
import uk.co.library.testdata.TestData;

@Listeners(CustomListeners.class)
public class JobSearchTest extends BaseTest {
    HomePage homePage;
    ResultPage resultPage;
    SoftAssert softAssert = new SoftAssert();

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        resultPage = new ResultPage();

    }

    @Test(dataProvider = "information", dataProviderClass = TestData.class, groups = {"smoke", "regression"})
    public void verifyJobSearchResultUsingDifferentDataSet(String jobTitle, String location, String distance, String salaryMin, String salaryMax, String salaryType, String jobType,
                                                           String result) {
        // enter job title 'jobTitle'
        homePage.enterJobTitle(jobTitle);
        //    enter Location 'location'
        homePage.enterLocation(location);
        //    select distance 'distance'
        homePage.selectDistance(distance);
        //	click on moreSearchOptionsLink
        homePage.clickOnMoreSearchOptionLink();
        //    enter salaryMin 'salaryMin'
        homePage.enterMaxSalary(salaryMin);
        //    enter salaryMax 'salaryMax'
        homePage.enterMaxSalary(salaryMax);
        //	select salaryType 'salaryType'
        homePage.selectSalaryType(salaryType);
        //	select jobType 'jobType'
        homePage.selectJobType(jobType);
        //	click on 'Find Jobs' button
        homePage.clickOnFindJobsButton();
        //	verify the result 'result'
        softAssert.assertEquals(resultPage.verifyTheResults(result), "result", "Expected text not found.");
        softAssert.assertAll();
    }


}
