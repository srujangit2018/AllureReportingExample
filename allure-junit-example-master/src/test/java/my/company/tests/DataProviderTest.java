package my.company.tests;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * eroshenkoam
 * 01.05.17
 */
@DisplayName("Data provider test")
@RunWith(DataProviderRunner.class)
public class DataProviderTest {

    @DataProvider
    public static Object[][] dataProviderAdd() {
        return new Object[][]{
                {0, 0, 0},
                {1, 1, 1},
        };
    }

    @Test
    @UseDataProvider("dataProviderAdd")
    public void testAdd(int first, int second, long result) {
        assertEquals(first + second, result);
    }
}
