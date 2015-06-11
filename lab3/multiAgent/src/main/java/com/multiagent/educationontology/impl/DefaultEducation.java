package com.multiagent.educationontology.impl;


import com.multiagent.educationontology.*;

import jade.util.leap.*;

/**
* Protege name: http://mccarthy.dia.fi.upm.es/Education_Ontology#Education
* @author OntologyBeanGenerator v4.1
* @version 2015/06/9, 01:39:59
*/
public class DefaultEducation implements Education {

  private static final long serialVersionUID = 8382767021263464332L;

  private String _internalInstanceName = null;

  public DefaultEducation() {
    this._internalInstanceName = "";
  }

  public DefaultEducation(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Education_Ontology#is_required_by
   */
   private List is_required_by = new ArrayList();
   public void addIs_required_by(CompOnt_Competence elem) { 
     is_required_by.add(elem);
   }
   public boolean removeIs_required_by(CompOnt_Competence elem) {
     boolean result = is_required_by.remove(elem);
     return result;
   }
   public void clearAllIs_required_by() {
     is_required_by.clear();
   }
   public Iterator getAllIs_required_by() {return is_required_by.iterator(); }
   public List getIs_required_by() {return is_required_by; }
   public void setIs_required_by(List l) {is_required_by = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Education_Ontology#Begin_date
   */
   private List begin_date = new ArrayList();
   public void addBegin_date(Time_DateTimeDescription elem) { 
     begin_date.add(elem);
   }
   public boolean removeBegin_date(Time_DateTimeDescription elem) {
     boolean result = begin_date.remove(elem);
     return result;
   }
   public void clearAllBegin_date() {
     begin_date.clear();
   }
   public Iterator getAllBegin_date() {return begin_date.iterator(); }
   public List getBegin_date() {return begin_date; }
   public void setBegin_date(List l) {begin_date = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Education_Ontology#is_education_of
   */
   private List is_education_of = new ArrayList();
   public void addIs_education_of(JobSeeOnt_Candidacy elem) { 
     is_education_of.add(elem);
   }
   public boolean removeIs_education_of(JobSeeOnt_Candidacy elem) {
     boolean result = is_education_of.remove(elem);
     return result;
   }
   public void clearAllIs_education_of() {
     is_education_of.clear();
   }
   public Iterator getAllIs_education_of() {return is_education_of.iterator(); }
   public List getIs_education_of() {return is_education_of; }
   public void setIs_education_of(List l) {is_education_of = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Education_Ontology#duration
   */
   private List duration = new ArrayList();
   public void addDuration(Time_DurationDescription elem) { 
     duration.add(elem);
   }
   public boolean removeDuration(Time_DurationDescription elem) {
     boolean result = duration.remove(elem);
     return result;
   }
   public void clearAllDuration() {
     duration.clear();
   }
   public Iterator getAllDuration() {return duration.iterator(); }
   public List getDuration() {return duration; }
   public void setDuration(List l) {duration = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Education_Ontology#has_education_field
   */
   private List has_education_field = new ArrayList();
   public void addHas_education_field(Education_Field elem) { 
     has_education_field.add(elem);
   }
   public boolean removeHas_education_field(Education_Field elem) {
     boolean result = has_education_field.remove(elem);
     return result;
   }
   public void clearAllHas_education_field() {
     has_education_field.clear();
   }
   public Iterator getAllHas_education_field() {return has_education_field.iterator(); }
   public List getHas_education_field() {return has_education_field; }
   public void setHas_education_field(List l) {has_education_field = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Education_Ontology#has_education_level
   */
   private List has_education_level = new ArrayList();
   public void addHas_education_level(Education_Level elem) { 
     has_education_level.add(elem);
   }
   public boolean removeHas_education_level(Education_Level elem) {
     boolean result = has_education_level.remove(elem);
     return result;
   }
   public void clearAllHas_education_level() {
     has_education_level.clear();
   }
   public Iterator getAllHas_education_level() {return has_education_level.iterator(); }
   public List getHas_education_level() {return has_education_level; }
   public void setHas_education_level(List l) {has_education_level = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Education_Ontology#Title
   */
   private List title = new ArrayList();
   public void addTitle(String elem) { 
     title.add(elem);
   }
   public boolean removeTitle(String elem) {
     boolean result = title.remove(elem);
     return result;
   }
   public void clearAllTitle() {
     title.clear();
   }
   public Iterator getAllTitle() {return title.iterator(); }
   public List getTitle() {return title; }
   public void setTitle(List l) {title = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Education_Ontology#Organization_Name
   */
   private List organization_Name = new ArrayList();
   public void addOrganization_Name(String elem) { 
     organization_Name.add(elem);
   }
   public boolean removeOrganization_Name(String elem) {
     boolean result = organization_Name.remove(elem);
     return result;
   }
   public void clearAllOrganization_Name() {
     organization_Name.clear();
   }
   public Iterator getAllOrganization_Name() {return organization_Name.iterator(); }
   public List getOrganization_Name() {return organization_Name; }
   public void setOrganization_Name(List l) {organization_Name = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Education_Ontology#Organization_Type
   */
   private List organization_Type = new ArrayList();
   public void addOrganization_Type(String elem) { 
     organization_Type.add(elem);
   }
   public boolean removeOrganization_Type(String elem) {
     boolean result = organization_Type.remove(elem);
     return result;
   }
   public void clearAllOrganization_Type() {
     organization_Type.clear();
   }
   public Iterator getAllOrganization_Type() {return organization_Type.iterator(); }
   public List getOrganization_Type() {return organization_Type; }
   public void setOrganization_Type(List l) {organization_Type = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Education_Ontology#is_associated_with_Vacancy
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
   * Protege name: http://mccarthy.dia.fi.upm.es/Education_Ontology#End_date
   */
   private List end_date = new ArrayList();
   public void addEnd_date(Time_DateTimeDescription elem) { 
     end_date.add(elem);
   }
   public boolean removeEnd_date(Time_DateTimeDescription elem) {
     boolean result = end_date.remove(elem);
     return result;
   }
   public void clearAllEnd_date() {
     end_date.clear();
   }
   public Iterator getAllEnd_date() {return end_date.iterator(); }
   public List getEnd_date() {return end_date; }
   public void setEnd_date(List l) {end_date = l; }

}
