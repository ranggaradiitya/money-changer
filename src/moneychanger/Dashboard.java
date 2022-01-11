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
interface Dashboard {
  public void setWidthColumnForTable();
  public void createReceipt();
  public void history();
  public void isiData(String name, String utilities, String from, String to, String amount1, String amount2);
  public boolean validation();
}
