package lab3.labourre;


import jade.util.leap.*;

/**
* Protege name: http://mccarthy.dia.fi.upm.es/Labour_Regulatory_Ontology#Contract_Type
* @author OntologyBeanGenerator v4.1
* @version 2015/06/11, 22:22:56
*/
public interface Contract_Type extends jade.content.Concept {

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Labour_Regulatory_Ontology#Limited_duration
   */
   public void addLimited_duration(boolean elem);
   public boolean removeLimited_duration(boolean elem);
   public void clearAllLimited_duration();
   public Iterator getAllLimited_duration();
   public List getLimited_duration();
   public void setLimited_duration(List l);

}
