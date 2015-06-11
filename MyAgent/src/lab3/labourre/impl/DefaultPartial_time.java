package lab3.labourre.impl;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import lab3.labourre.Partial_time;
import lab3.labourre.Time_DateTimeInterval;

/**
* Protege name: http://mccarthy.dia.fi.upm.es/Labour_Regulatory_Ontology#Partial_time
* @author OntologyBeanGenerator v4.1
* @version 2015/06/11, 22:22:55
*/
public class DefaultPartial_time implements Partial_time {

  private static final long serialVersionUID = 5987543401077072536L;

  private String _internalInstanceName = null;

  public DefaultPartial_time() {
    this._internalInstanceName = "";
  }

  public DefaultPartial_time(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Labour_Regulatory_Ontology#shifts
   */
   private List shifts = new ArrayList();
   public void addShifts(Time_DateTimeInterval elem) { 
     shifts.add(elem);
   }
   public boolean removeShifts(Time_DateTimeInterval elem) {
     boolean result = shifts.remove(elem);
     return result;
   }
   public void clearAllShifts() {
     shifts.clear();
   }
   public Iterator getAllShifts() {return shifts.iterator(); }
   public List getShifts() {return shifts; }
   public void setShifts(List l) {shifts = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Labour_Regulatory_Ontology#bll_code
   */
   private List bll_code = new ArrayList();
   public void addBll_code(int elem) { 
     bll_code.add(elem);
   }
   public boolean removeBll_code(int elem) {
     boolean result = bll_code.remove(elem);
     return result;
   }
   public void clearAllBll_code() {
     bll_code.clear();
   }
   public Iterator getAllBll_code() {return bll_code.iterator(); }
   public List getBll_code() {return bll_code; }
   public void setBll_code(List l) {bll_code = l; }

}
