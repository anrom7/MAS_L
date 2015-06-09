package jobofferontology.ontology;


import jade.util.leap.*;

/**
* Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#Elem
* @author OntologyBeanGenerator v4.1
* @version 2015/06/9, 01:31:16
*/
public interface Elem extends jade.content.Concept {

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#has_value
   */
   public void addHas_value(Job_Vacancy elem);
   public boolean removeHas_value(Job_Vacancy elem);
   public void clearAllHas_value();
   public Iterator getAllHas_value();
   public List getHas_value();
   public void setHas_value(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#has_pos
   */
   public void addHas_pos(int elem);
   public boolean removeHas_pos(int elem);
   public void clearAllHas_pos();
   public Iterator getAllHas_pos();
   public List getHas_pos();
   public void setHas_pos(List l);

}
