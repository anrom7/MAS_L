package lab3.labourre.impl;


import jade.util.leap.ArrayList;
import jade.util.leap.Iterator;
import jade.util.leap.List;
import lab3.labourre.Time_DurationDescription;
import lab3.labourre.Work_Condition;
import lab3.labourre.Work_Time;

/**
* Protege name: http://mccarthy.dia.fi.upm.es/Labour_Regulatory_Ontology#Work_Condition
* @author OntologyBeanGenerator v4.1
* @version 2015/06/11, 22:22:55
*/
public class DefaultWork_Condition implements Work_Condition {

  private static final long serialVersionUID = 5987543401077072536L;

  private String _internalInstanceName = null;

  public DefaultWork_Condition() {
    this._internalInstanceName = "";
  }

  public DefaultWork_Condition(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Labour_Regulatory_Ontology#relocation_required
   */
   private List relocation_required = new ArrayList();
   public void addRelocation_required(boolean elem) { 
     relocation_required.add(elem);
   }
   public boolean removeRelocation_required(boolean elem) {
     boolean result = relocation_required.remove(elem);
     return result;
   }
   public void clearAllRelocation_required() {
     relocation_required.clear();
   }
   public Iterator getAllRelocation_required() {return relocation_required.iterator(); }
   public List getRelocation_required() {return relocation_required; }
   public void setRelocation_required(List l) {relocation_required = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Labour_Regulatory_Ontology#hours_week
   */
   private List hours_week = new ArrayList();
   public void addHours_week(int elem) { 
     hours_week.add(elem);
   }
   public boolean removeHours_week(int elem) {
     boolean result = hours_week.remove(elem);
     return result;
   }
   public void clearAllHours_week() {
     hours_week.clear();
   }
   public Iterator getAllHours_week() {return hours_week.iterator(); }
   public List getHours_week() {return hours_week; }
   public void setHours_week(List l) {hours_week = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Labour_Regulatory_Ontology#execution_time
   */
   private List execution_time = new ArrayList();
   public void addExecution_time(Time_DurationDescription elem) { 
     execution_time.add(elem);
   }
   public boolean removeExecution_time(Time_DurationDescription elem) {
     boolean result = execution_time.remove(elem);
     return result;
   }
   public void clearAllExecution_time() {
     execution_time.clear();
   }
   public Iterator getAllExecution_time() {return execution_time.iterator(); }
   public List getExecution_time() {return execution_time; }
   public void setExecution_time(List l) {execution_time = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Labour_Regulatory_Ontology#work_time
   */
   private List work_time = new ArrayList();
   public void addWork_time(Work_Time elem) { 
     work_time.add(elem);
   }
   public boolean removeWork_time(Work_Time elem) {
     boolean result = work_time.remove(elem);
     return result;
   }
   public void clearAllWork_time() {
     work_time.clear();
   }
   public Iterator getAllWork_time() {return work_time.iterator(); }
   public List getWork_time() {return work_time; }
   public void setWork_time(List l) {work_time = l; }

}
