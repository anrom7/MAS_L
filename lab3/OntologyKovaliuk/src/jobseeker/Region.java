package jobseeker;


import jade.util.leap.*;

/**
* Protege name: http://mccarthy.dia.fi.upm.es/Geography_Ontology#Region
* @author OntologyBeanGenerator v4.1
* @version 2015/06/8, 23:11:56
*/
public interface Region extends Location {

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Geography_Ontology#is_located_in_Country
   */
   public void addIs_located_in_Country(Country elem);
   public boolean removeIs_located_in_Country(Country elem);
   public void clearAllIs_located_in_Country();
   public Iterator getAllIs_located_in_Country();
   public List getIs_located_in_Country();
   public void setIs_located_in_Country(List l);

}
