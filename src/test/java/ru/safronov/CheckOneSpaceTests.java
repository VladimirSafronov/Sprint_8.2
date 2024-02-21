package ru.safronov;

import org.junit.Assert;
import org.junit.Test;

public class CheckOneSpaceTests {

  private Account account;

  @Test
  public void correctNameThenSuccess() {
    account = new Account("Bob Marley");
    boolean result = account.isOneSpace(account.getName());
    Assert.assertTrue(result);
  }

  @Test
  public void noSpaceNameThenFail() {
    account = new Account("BobMarley");
    Assert.assertFalse(account.isOneSpace(account.getName()));
  }

  @Test
  public void moreOneSpaceThenFail() {
    account = new Account("b a c");
    Assert.assertFalse(account.isOneSpace(account.getName()));
  }
}
