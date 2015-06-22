package com.multiagent.educationontology;


import jade.util.leap.*;

/**
* Protege name: http://mccarthy.dia.fi.upm.es/Education_Ontology#Education
* @author OntologyBeanGenerator v4.1
* @version 2015/06/9, 01:39:59
*/
public interface Education extends jade.content.Concept {

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Education_Ontology#is_required_by
   */
   public void addIs_required_by(CompOnt_Competence elem);
   public boolean removeIs_required_by(CompOnt_Competence elem);
   public void clearAllIs_required_by();
   public Iterator getAllIs_required_by();
   public List getIs_required_by();
   public void setIs_required_by(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Education_Ontology#Begin_date
   */
   public void addBegin_date(Time_DateTimeDescription elem);
   public boolean removeBegin_date(Time_DateTimeDescription elem);
   public void clearAllBegin_date();
   public Iterator getAllBegin_date();
   public List getBegin_date();
   public void setBegin_date(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Education_Ontology#is_education_of
   */
   public void addIs_education_of(JobSeeOnt_Candidacy elem);
   public boolean removeIs_education_of(JobSeeOnt_Candidacy elem);
   public void clearAllIs_education_of();
   public Iterator getAllIs_education_of();
   public List getIs_education_of();
   public void setIs_education_of(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Education_Ontology#duration
   */
   public void addDuration(Time_DurationDescription elem);
   public boolean removeDuration(Time_DurationDescription elem);
   public void clearAllDuration();
   public Iterator getAllDuration();
   public List getDuration();
   public void setDuration(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Education_Ontology#has_education_field
   */
   public void addHas_education_field(Education_Field elem);
   public boolean removeHas_education_field(Education_Field elem);
   public void clearAllHas_education_field();
   public Iterator getAllHas_education_field();
   public List getHas_education_field();
   public void setHas_education_field(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Education_Ontology#has_education_level
   */
   public void addHas_education_level(Education_Level elem);
   public boolean removeHas_education_level(Education_Level elem);
   public void clearAllHas_education_level();
   public Iterator getAllHas_education_level();
   public List getHas_education_level();
   public void setHas_education_level(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Education_Ontology#Title
   */
   public void addTitle(String elem);
   public boolean removeTitle(String elem);
   public void clearAllTitle();
   public Iterator getAllTitle();
   public List getTitle();
   public void setTitle(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Education_Ontology#Organization_Name
   */
   public void addOrganization_Name(String elem);
   public boolean removeOrganization_Name(String elem);
   public void clearAllOrganization_Name();
   public Iterator getAllOrganization_Name();
   public List getOrganization_Name();
   public void setOrganization_Name(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Education_Ontology#Organization_Type
   */
   public void addOrganization_Type(String elem);
   public boolean removeOrganization_Type(String elem);
   public void clearAllOrganization_Type();
   public Iterator getAllOrganization_Type();
   public List getOrganization_Type();
   public void setOrganization_Type(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Education_Ontology#is_associated_with_Vacancy
   */
   public void addIs_associated_with_Vacancy(JobOffOnt_Vacancy elem);
   public boolean removeIs_associated_with_Vacancy(JobOffOnt_Vacancy elem);
   public void clearAllIs_associated_with_Vacancy();
   public Iterator getAllIs_associated_with_Vacancy();
   public List getIs_associated_with_Vacancy();
   public void setIs_associated_with_Vacancy(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Education_Ontology#End_date
   */
   public void addEnd_date(Time_DateTimeDescription elem);
   public boolean removeEnd_date(Time_DateTimeDescription elem);
   public void clearAllEnd_date();
   public Iterator getAllEnd_date();
   public List getEnd_date();
   public void setEnd_date(List l);

}
