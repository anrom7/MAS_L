package ua.edu.lp.cad.mas.lab3.occupation;


import jade.util.leap.*;

/**
* Protege name: http://webode.dia.fi.upm.es/WSML/Occupation_Ontology#Computing_professionals__213
* @author OntologyBeanGenerator v4.1
* @version 2015/06/9, 11:15:08
*/
public interface Computing_professionals__213 extends Physical_mathematical_and_engineering_science_professionals__21 {

   /**
   * Protege name: http://webode.dia.fi.upm.es/WSML/Occupation_Ontology#is_associated_with_ICT_Vacancy
   */
   public void addIs_associated_with_ICT_Vacancy(JobOffOnt_ICT_Vacancy elem);
   public boolean removeIs_associated_with_ICT_Vacancy(JobOffOnt_ICT_Vacancy elem);
   public void clearAllIs_associated_with_ICT_Vacancy();
   public Iterator getAllIs_associated_with_ICT_Vacancy();
   public List getIs_associated_with_ICT_Vacancy();
   public void setIs_associated_with_ICT_Vacancy(List l);

   /**
   * Protege name: http://webode.dia.fi.upm.es/WSML/Occupation_Ontology#is_associated_with_ICT_Objective
   */
   public void addIs_associated_with_ICT_Objective(JobSeeOnt_ICT_Objective elem);
   public boolean removeIs_associated_with_ICT_Objective(JobSeeOnt_ICT_Objective elem);
   public void clearAllIs_associated_with_ICT_Objective();
   public Iterator getAllIs_associated_with_ICT_Objective();
   public List getIs_associated_with_ICT_Objective();
   public void setIs_associated_with_ICT_Objective(List l);

}
