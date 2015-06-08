package education;


import jade.util.leap.*;

/**
* Protege name: http://mccarthy.dia.fi.upm.es/Geography_Ontology#Country
* @author OntologyBeanGenerator v4.1
* @version 2015/06/8, 23:11:56
*/
public interface Country extends Location {

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Geography_Ontology#is_residence_of_Job_Seeker
   */
   public void addIs_residence_of_Job_Seeker(JobSeeOnt_Job_Seeker elem);
   public boolean removeIs_residence_of_Job_Seeker(JobSeeOnt_Job_Seeker elem);
   public void clearAllIs_residence_of_Job_Seeker();
   public Iterator getAllIs_residence_of_Job_Seeker();
   public List getIs_residence_of_Job_Seeker();
   public void setIs_residence_of_Job_Seeker(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Geography_Ontology#has_region_Region
   */
   public void addHas_region_Region(Region elem);
   public boolean removeHas_region_Region(Region elem);
   public void clearAllHas_region_Region();
   public Iterator getAllHas_region_Region();
   public List getHas_region_Region();
   public void setHas_region_Region(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Geography_Ontology#is_nation_of_Candidacy
   */
   public void addIs_nation_of_Candidacy(JobSeeOnt_Candidacy elem);
   public boolean removeIs_nation_of_Candidacy(JobSeeOnt_Candidacy elem);
   public void clearAllIs_nation_of_Candidacy();
   public Iterator getAllIs_nation_of_Candidacy();
   public List getIs_nation_of_Candidacy();
   public void setIs_nation_of_Candidacy(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Geography_Ontology#is_located_in_Continent
   */
   public void addIs_located_in_Continent(Continent elem);
   public boolean removeIs_located_in_Continent(Continent elem);
   public void clearAllIs_located_in_Continent();
   public Iterator getAllIs_located_in_Continent();
   public List getIs_located_in_Continent();
   public void setIs_located_in_Continent(List l);

}
