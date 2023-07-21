package uk.co.library.testdata;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "information")
    public Object[][] getData(){
        Object[][] data = new Object[][]{
                {"Tester","Newcastle "," 5 ","30000","50000","Per month","Permanent","Permanent Tester jobs in Newcastle " },
                {"Tester","Brighton","7","35000","60000","Per month","Contract","Permanent jobs in London"},
                {"Tester","Leeds","35","20000","50000","Per week","Contract","Permanent jobs in Leeds" },
                {"Tester","Manchester","35","20000","50000","Per week","Contract","Permanent jobs in Manchester"},
                {"Tester"," Birmingham ","35","20000","50000","Per week","Contract","Permanent jobs in  Birmingham "},
                {"Tester"," Glasgow ","35","20000","50000","Per week","Contract","Permanent jobs in  Glasgow"}
        };
        return data;
    }


}
