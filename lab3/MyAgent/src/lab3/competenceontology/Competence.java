package lab3.competenceontology;


import jade.util.leap.*;

/**
* Protege name: http://mccarthy.dia.fi.upm.es/Competence_Ontology#Competence
* @author OntologyBeanGenerator v4.1
* @version 2015/06/9, 01:26:41
*/
public interface Competence extends jade.content.Concept {

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Competence_Ontology#is_associated_with_Vacancy
   */
   public void addIs_associated_with_Vacancy(JobOffOnt_Vacancy elem);
   public boolean removeIs_associated_with_Vacancy(JobOffOnt_Vacancy elem);
   public void clearAllIs_associated_with_Vacancy();
   public Iterator getAllIs_associated_with_Vacancy();
   public List getIs_associated_with_Vacancy();
   public void setIs_associated_with_Vacancy(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Competence_Ontology#is_competence_of_Candidacy
   */
   public void addIs_competence_of_Candidacy(JobSeeOnt_Candidacy elem);
   public boolean removeIs_competence_of_Candidacy(JobSeeOnt_Candidacy elem);
   public void clearAllIs_competence_of_Candidacy();
   public Iterator getAllIs_competence_of_Candidacy();
   public List getIs_competence_of_Candidacy();
   public void setIs_competence_of_Candidacy(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Competence_Ontology#requires
   */
   public void addRequires(EduOnt_Education elem);
   public boolean removeRequires(EduOnt_Education elem);
   public void clearAllRequires();
   public Iterator getAllRequires();
   public List getRequires();
   public void setRequires(List l);

}
