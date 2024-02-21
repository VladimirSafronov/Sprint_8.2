package ru.safronov;

public class Account {

  private final String name;

  public Account(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public boolean checkNameToEmboss() {
    return isCorrectLength(name) && isOneSpace(name) && isNotStartAndFinishSpace(name);
  }

  /**
   * Метод проверяет, что в строке не меньше 3 и не больше 19 символов
   */
  public boolean isCorrectLength(String str) {
    return str.length() >= Constants.MIN_LENGTH_NAME && str.length() <= Constants.MAX_LENGTH_NAME;
  }

  /**
   * Метод проверяет, что в строке есть только один пробел
   */
  public boolean isOneSpace(String str) {
    int count = 0;
    for (Character c : str.toCharArray()) {
      if (c == ' ') {
        count++;
      }
    }
    return count == Constants.COUNT_OF_SPACES;
  }

  /**
   * Метод проверяет, что пробел стоит не в начале и не в конце строки
   */
  public boolean isNotStartAndFinishSpace(String str) {
    return !str.startsWith(" ") && !str.endsWith(" ");
  }
}
