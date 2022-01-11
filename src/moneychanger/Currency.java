/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moneychanger;

import javax.swing.JComboBox;

/**
 *
 * @author RANGGA RADITYA
 */
public class Currency {
  JComboBox<String> cmbTo;
  double input = 0, result = 0;

  public Currency(JComboBox<String> cmbTo, double input, double result) {
    this.cmbTo = cmbTo;
    this.input = input;
    this.result = result;
  }

  public double getResult() {
    return result;
  }
  
  public void convert() {
    System.out.println("You can convert money in this application!");
  }
}

class Dollar extends Currency {

  public Dollar(JComboBox<String> cmbTo, double input, double result) {
    super(cmbTo, input, result);
  }
  
  @Override
  public void convert() {
    if (cmbTo.getSelectedItem() == "US Dollar") {
        result = input;
    } else if (cmbTo.getSelectedItem() == "Euro") {
        result = input * 0.85;
    } else if (cmbTo.getSelectedItem() == "British Pound") {
        result = input * 0.72;
    } else if (cmbTo.getSelectedItem() == "Indonesian Rupiah") {
        result = input * 14578.21; 
    } else {
        result = input * 73.38;
    } 
  }
}

class Euro extends Currency {

  public Euro(JComboBox<String> cmbTo, double input, double result) {
    super(cmbTo, input, result);
  }
  
  @Override
  public void convert() {
    if (cmbTo.getSelectedItem() == "US Dollar") {
        result = input * 1.17;
    } else if (cmbTo.getSelectedItem() == "Euro") {
        result = input;
    } else if (cmbTo.getSelectedItem() == "British Pound") {
        result = input * 0.85;
    } else if (cmbTo.getSelectedItem() == "Indonesian Rupiah") {
        result = input * 17145.02;
    } else {
        result = input * 86.30;
    }  
  }
}

class Pound extends Currency {

  public Pound(JComboBox<String> cmbTo, double input, double result) {
    super(cmbTo, input, result);
  }

  @Override
  public void convert() {
    if (cmbTo.getSelectedItem() == "US Dollar") {
        result = input * 1.38;
    } else if (cmbTo.getSelectedItem() == "Euro") {
        result = input * 1.17;
    } else if (cmbTo.getSelectedItem() == "British Pound") {
        result = input;
    } else if (cmbTo.getSelectedItem() == "Indonesian Rupiah") {
        result = input * 20162.61;
    } else {
        result = input * 101.49;
    }   
  }
}

class Rupiah extends Currency {

  public Rupiah(JComboBox<String> cmbTo, double input, double result) {
    super(cmbTo, input, result);
  }

  @Override
  public void convert() {
    if (cmbTo.getSelectedItem() == "US Dollar") {
        result = input * 0.000068;
    } else if (cmbTo.getSelectedItem() == "Euro") {
        result = input * 0.000058;
    } else if (cmbTo.getSelectedItem() == "British Pound") {
        result = input * 0.000049;
    } else if (cmbTo.getSelectedItem() == "Indonesian Rupiah") {
        result = input;
    } else {
        result = input * 0.005034;
    }  
  }
}

class Rupee extends Currency {

  public Rupee(JComboBox<String> cmbTo, double input, double result) {
    super(cmbTo, input, result);
  }

  @Override
  public void convert() {
    if (cmbTo.getSelectedItem() == "US Dollar") {
        result = input * 0.0136;
    }  else if (cmbTo.getSelectedItem() == "Euro") {
        result = input * 0.0115;
    }  else if (cmbTo.getSelectedItem() == "British Pound") {
        result = input * 0.0098;
    }  else if (cmbTo.getSelectedItem() == "Indonesian Rupiah") {
        result = input * 198.64;
    } else {
        result = input;
    }  
  }
}
