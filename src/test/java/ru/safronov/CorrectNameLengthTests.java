package ru.safronov;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CorrectNameLengthTests {
  private Account account;

  @Parameter
  public String testName;

  @Parameters
  public static Object[][] getCredentials() {
    return new Object[][]{{"Bob"}, {"BobMarley"}, {"Qwertyuiopasdfghjkl"}};
  }

  @Before
  public void setName(){
    account = new Account(testName);
  }

  @Test
  public void correctNameThenSuccess() {
    boolean result = account.isCorrectLength(account.getName());
    Assert.assertTrue(result);
  }
}
