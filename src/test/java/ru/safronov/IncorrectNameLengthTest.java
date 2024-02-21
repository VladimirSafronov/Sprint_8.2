package ru.safronov;

import org.junit.Assert;
import org.junit.Test;

public class IncorrectNameLengthTest {

  private Account account;

  @Test
  public void tooShortNameLengthThenFail() {
    account = new Account("Ba");
    boolean result = account.isCorrectLength(account.getName());
    Assert.assertFalse(result);
  }

  @Test
  public void tooLongNameLengthThenFail() {
    account = new Account("Asdfghjklzxcvbnmqwer");
    boolean result = account.isCorrectLength(account.getName());
    Assert.assertFalse(result);
  }
}
