/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moneychanger;

/**
 *
 * @author RANGGA RADITYA
 */
public class Form {
  private String name, utilities, fromCurrency, toCurrency, amountToConvert, amountConverted;

  public Form(String name, String utilities, String fromCurrency, String toCurrency, String amountToConvert, String amountConverted) {
    this.name = name;
    this.utilities = utilities;
    this.fromCurrency = fromCurrency;
    this.toCurrency = toCurrency;
    this.amountToConvert = amountToConvert;
    this.amountConverted = amountConverted;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUtilities() {
    return utilities;
  }

  public void setUtilities(String utilities) {
    this.utilities = utilities;
  }

  public String getFromCurrency() {
    return fromCurrency;
  }

  public void setFromCurrency(String fromCurrency) {
    this.fromCurrency = fromCurrency;
  }

  public String getToCurrency() {
    return toCurrency;
  }

  public void setToCurrency(String toCurrency) {
    this.toCurrency = toCurrency;
  }

  public String getAmountToConvert() {
    return amountToConvert;
  }

  public void setAmountToConvert(String amountToConvert) {
    this.amountToConvert = amountToConvert;
  }

  public String getAmountConverted() {
    return amountConverted;
  }

  public void setAmountConverted(String amountConverted) {
    this.amountConverted = amountConverted;
  }
}
