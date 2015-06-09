package lab3.competenceontology.impl;


import jade.util.leap.ArrayList;
import jade.util.leap.Iterator;
import jade.util.leap.List;
import lab3.competenceontology.Competence;
import lab3.competenceontology.EduOnt_Education;
import lab3.competenceontology.JobOffOnt_Vacancy;
import lab3.competenceontology.JobSeeOnt_Candidacy;

/**
* Protege name: http://mccarthy.dia.fi.upm.es/Competence_Ontology#Competence
* @author OntologyBeanGenerator v4.1
* @version 2015/06/9, 01:26:41
*/
public class DefaultCompetence implements Competence {

  private static final long serialVersionUID = 5077151851681497189L;

  private String _internalInstanceName = null;

  public DefaultCompetence() {
    this._internalInstanceName = "";
  }

  public DefaultCompetence(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Competence_Ontology#is_associated_with_Vacancy
   */
   private List is_associated_with_Vacancy = new ArrayList();
   public void addIs_associated_with_Vacancy(JobOffOnt_Vacancy elem) { 
     is_associated_with_Vacancy.add(elem);
   }
   public boolean removeIs_associated_with_Vacancy(JobOffOnt_Vacancy elem) {
     boolean result = is_associated_with_Vacancy.remove(elem);
     return result;
   }
   public void clearAllIs_associated_with_Vacancy() {
     is_associated_with_Vacancy.clear();
   }
   public Iterator getAllIs_associated_with_Vacancy() {return is_associated_with_Vacancy.iterator(); }
   public List getIs_associated_with_Vacancy() {return is_associated_with_Vacancy; }
   public void setIs_associated_with_Vacancy(List l) {is_associated_with_Vacancy = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Competence_Ontology#is_competence_of_Candidacy
   */
   private List is_competence_of_Candidacy = new ArrayList();
   public void addIs_competence_of_Candidacy(JobSeeOnt_Candidacy elem) { 
     is_competence_of_Candidacy.add(elem);
   }
   public boolean removeIs_competence_of_Candidacy(JobSeeOnt_Candidacy elem) {
     boolean result = is_competence_of_Candidacy.remove(elem);
     return result;
   }
   public void clearAllIs_competence_of_Candidacy() {
     is_competence_of_Candidacy.clear();
   }
   public Iterator getAllIs_competence_of_Candidacy() {return is_competence_of_Candidacy.iterator(); }
   public List getIs_competence_of_Candidacy() {return is_competence_of_Candidacy; }
   public void setIs_competence_of_Candidacy(List l) {is_competence_of_Candidacy = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Competence_Ontology#requires
   */
   private List requires = new ArrayList();
   public void addRequires(EduOnt_Education elem) { 
     requires.add(elem);
   }
   public boolean removeRequires(EduOnt_Education elem) {
     boolean result = requires.remove(elem);
     return result;
   }
   public void clearAllRequires() {
     requires.clear();
   }
   public Iterator getAllRequires() {return requires.iterator(); }
   public List getRequires() {return requires; }
   public void setRequires(List l) {requires = l; }

}
