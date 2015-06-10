package ua.edu.lp.cad.mas.lab3.occupation;


import jade.util.leap.*;

/**
* Protege name: http://webode.dia.fi.upm.es/WSML/Occupation_Ontology#Occupation
* @author OntologyBeanGenerator v4.1
* @version 2015/06/9, 11:14:08
*/
public interface Occupation extends jade.content.Concept {

   /**
   * Protege name: http://webode.dia.fi.upm.es/WSML/Occupation_Ontology#Code
   */
   public void addCode(String elem);
   public boolean removeCode(String elem);
   public void clearAllCode();
   public Iterator getAllCode();
   public List getCode();
   public void setCode(List l);

   /**
   * Protege name: http://webode.dia.fi.upm.es/WSML/Occupation_Ontology#is_associated_with_Vacancy_Prof_Aff
   */
   public void addIs_associated_with_Vacancy_Prof_Aff(JobOffOnt_Vacancy elem);
   public boolean removeIs_associated_with_Vacancy_Prof_Aff(JobOffOnt_Vacancy elem);
   public void clearAllIs_associated_with_Vacancy_Prof_Aff();
   public Iterator getAllIs_associated_with_Vacancy_Prof_Aff();
   public List getIs_associated_with_Vacancy_Prof_Aff();
   public void setIs_associated_with_Vacancy_Prof_Aff(List l);

   /**
   * Protege name: http://webode.dia.fi.upm.es/WSML/Occupation_Ontology#Level
   */
   public void addLevel(String elem);
   public boolean removeLevel(String elem);
   public void clearAllLevel();
   public Iterator getAllLevel();
   public List getLevel();
   public void setLevel(List l);

   /**
   * Protege name: http://webode.dia.fi.upm.es/WSML/Occupation_Ontology#is_associated_with_Requested_Work_Experience
   */
   public void addIs_associated_with_Requested_Work_Experience(JobOffOnt_Requested_Work_Experience elem);
   public boolean removeIs_associated_with_Requested_Work_Experience(JobOffOnt_Requested_Work_Experience elem);
   public void clearAllIs_associated_with_Requested_Work_Experience();
   public Iterator getAllIs_associated_with_Requested_Work_Experience();
   public List getIs_associated_with_Requested_Work_Experience();
   public void setIs_associated_with_Requested_Work_Experience(List l);

   /**
   * Protege name: http://webode.dia.fi.upm.es/WSML/Occupation_Ontology#is_associated_with_Vacancy
   */
   public void addIs_associated_with_Vacancy(JobOffOnt_Vacancy elem);
   public boolean removeIs_associated_with_Vacancy(JobOffOnt_Vacancy elem);
   public void clearAllIs_associated_with_Vacancy();
   public Iterator getAllIs_associated_with_Vacancy();
   public List getIs_associated_with_Vacancy();
   public void setIs_associated_with_Vacancy(List l);

   /**
   * Protege name: http://webode.dia.fi.upm.es/WSML/Occupation_Ontology#is_associated_with_Offered_Work_Experience
   */
   public void addIs_associated_with_Offered_Work_Experience(JobSeeOnt_Offered_Work_Experience elem);
   public boolean removeIs_associated_with_Offered_Work_Experience(JobSeeOnt_Offered_Work_Experience elem);
   public void clearAllIs_associated_with_Offered_Work_Experience();
   public Iterator getAllIs_associated_with_Offered_Work_Experience();
   public List getIs_associated_with_Offered_Work_Experience();
   public void setIs_associated_with_Offered_Work_Experience(List l);

   /**
   * Protege name: http://webode.dia.fi.upm.es/WSML/Occupation_Ontology#is_associated_with_Objective
   */
   public void addIs_associated_with_Objective(JobSeeOnt_Objective elem);
   public boolean removeIs_associated_with_Objective(JobSeeOnt_Objective elem);
   public void clearAllIs_associated_with_Objective();
   public Iterator getAllIs_associated_with_Objective();
   public List getIs_associated_with_Objective();
   public void setIs_associated_with_Objective(List l);

   /**
   * Protege name: http://webode.dia.fi.upm.es/WSML/Occupation_Ontology#is_associated_with_Candidacy
   */
   public void addIs_associated_with_Candidacy(JobSeeOnt_Candidacy elem);
   public boolean removeIs_associated_with_Candidacy(JobSeeOnt_Candidacy elem);
   public void clearAllIs_associated_with_Candidacy();
   public Iterator getAllIs_associated_with_Candidacy();
   public List getIs_associated_with_Candidacy();
   public void setIs_associated_with_Candidacy(List l);

   /**
   * Protege name: http://webode.dia.fi.upm.es/WSML/Occupation_Ontology#Name
   */
   public void addName(String elem);
   public boolean removeName(String elem);
   public void clearAllName();
   public Iterator getAllName();
   public List getName();
   public void setName(List l);

   /**
   * Protege name: http://webode.dia.fi.upm.es/WSML/Occupation_Ontology#Description
   */
   public void addDescription(String elem);
   public boolean removeDescription(String elem);
   public void clearAllDescription();
   public Iterator getAllDescription();
   public List getDescription();
   public void setDescription(List l);

}
