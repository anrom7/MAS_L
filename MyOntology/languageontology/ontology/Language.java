package languageontology.ontology;


import jade.util.leap.*;

/**
* Protege name: http://mccarthy.dia.fi.upm.es/Language_Ontology#Language
* @author OntologyBeanGenerator v4.1
* @version 2015/06/11, 22:55:16
*/
public interface Language extends jade.content.Concept {

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Language_Ontology#is_mother_tongue_of_Candidacy
   */
   public void addIs_mother_tongue_of_Candidacy(JobSeeOnt_Candidacy elem);
   public boolean removeIs_mother_tongue_of_Candidacy(JobSeeOnt_Candidacy elem);
   public void clearAllIs_mother_tongue_of_Candidacy();
   public Iterator getAllIs_mother_tongue_of_Candidacy();
   public List getIs_mother_tongue_of_Candidacy();
   public void setIs_mother_tongue_of_Candidacy(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Language_Ontology#is_spoken_by_Candidacy
   */
   public void addIs_spoken_by_Candidacy(JobSeeOnt_Candidacy elem);
   public boolean removeIs_spoken_by_Candidacy(JobSeeOnt_Candidacy elem);
   public void clearAllIs_spoken_by_Candidacy();
   public Iterator getAllIs_spoken_by_Candidacy();
   public List getIs_spoken_by_Candidacy();
   public void setIs_spoken_by_Candidacy(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Language_Ontology#Code
   */
   public void addCode(String elem);
   public boolean removeCode(String elem);
   public void clearAllCode();
   public Iterator getAllCode();
   public List getCode();
   public void setCode(List l);

}
