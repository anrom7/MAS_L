package lab3.labourre;


import jade.util.leap.*;

/**
* Protege name: http://mccarthy.dia.fi.upm.es/Labour_Regulatory_Ontology#Work_Condition
* @author OntologyBeanGenerator v4.1
* @version 2015/06/11, 22:22:55
*/
public interface Work_Condition extends jade.content.Concept {

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Labour_Regulatory_Ontology#relocation_required
   */
   public void addRelocation_required(boolean elem);
   public boolean removeRelocation_required(boolean elem);
   public void clearAllRelocation_required();
   public Iterator getAllRelocation_required();
   public List getRelocation_required();
   public void setRelocation_required(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Labour_Regulatory_Ontology#hours_week
   */
   public void addHours_week(int elem);
   public boolean removeHours_week(int elem);
   public void clearAllHours_week();
   public Iterator getAllHours_week();
   public List getHours_week();
   public void setHours_week(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Labour_Regulatory_Ontology#execution_time
   */
   public void addExecution_time(Time_DurationDescription elem);
   public boolean removeExecution_time(Time_DurationDescription elem);
   public void clearAllExecution_time();
   public Iterator getAllExecution_time();
   public List getExecution_time();
   public void setExecution_time(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Labour_Regulatory_Ontology#work_time
   */
   public void addWork_time(Work_Time elem);
   public boolean removeWork_time(Work_Time elem);
   public void clearAllWork_time();
   public Iterator getAllWork_time();
   public List getWork_time();
   public void setWork_time(List l);

}
