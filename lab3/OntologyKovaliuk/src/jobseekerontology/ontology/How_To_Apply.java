package jobseekerontology.ontology;


import jade.util.leap.*;

/**
* Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#How_To_Apply
* @author OntologyBeanGenerator v4.1
* @version 2015/06/9, 01:43:39
*/
public interface How_To_Apply extends jade.content.Concept {

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#description
   */
   public void addDescription(String elem);
   public boolean removeDescription(String elem);
   public void clearAllDescription();
   public Iterator getAllDescription();
   public List getDescription();
   public void setDescription(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#Id
   */
   public void addId(int elem);
   public boolean removeId(int elem);
   public void clearAllId();
   public Iterator getAllId();
   public List getId();
   public void setId(List l);

}
