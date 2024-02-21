package ru.safronov;

import org.junit.Assert;
import org.junit.Test;

public class StartsEndsSpaceTests {

  private Account account;

  @Test
  public void correctNameThenSuccess() {
    account = new Account("B ob");
    Assert.assertTrue(account.isNotStartAndFinishSpace(account.getName()));
  }

  @Test
  public void startsSpaceThenFail() {
    account = new Account(" B ob");
    Assert.assertFalse(account.isNotStartAndFinishSpace(account.getName()));
  }

  @Test
  public void endsSpaceThenFail() {
    account = new Account("B ob ");
    Assert.assertFalse(account.isNotStartAndFinishSpace(account.getName()));
  }
}
