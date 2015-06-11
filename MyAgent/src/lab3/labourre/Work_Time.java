package lab3.labourre;

import java.util.Iterator;
import java.util.List;


/**
* Protege name: http://mccarthy.dia.fi.upm.es/Labour_Regulatory_Ontology#Work_Time
* @author OntologyBeanGenerator v4.1
* @version 2015/06/11, 22:22:55
*/
public interface Work_Time extends jade.content.Concept {

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Labour_Regulatory_Ontology#shifts
   */
   public void addShifts(Time_DateTimeInterval elem);
   public boolean removeShifts(Time_DateTimeInterval elem);
   public void clearAllShifts();
   public Iterator getAllShifts();
   public List getShifts();
   public void setShifts(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Labour_Regulatory_Ontology#bll_code
   */
   public void addBll_code(int elem);
   public boolean removeBll_code(int elem);
   public void clearAllBll_code();
   public Iterator getAllBll_code();
   public List getBll_code();
   public void setBll_code(List l);

}
