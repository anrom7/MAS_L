package jobofferontology.ontology.impl;


import jade.util.leap.*;
import jobofferontology.ontology.*;

/**
* Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#Vacancy
* @author OntologyBeanGenerator v4.1
* @version 2015/06/9, 01:31:16
*/
public class DefaultVacancy implements Vacancy {

  private static final long serialVersionUID = 1989109886661307945L;

  private String _internalInstanceName = null;

  public DefaultVacancy() {
    this._internalInstanceName = "";
  }

  public DefaultVacancy(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#requires_competence
   */
   private List requires_competence = new ArrayList();
   public void addRequires_competence(ComOnt_Competence elem) { 
     requires_competence.add(elem);
   }
   public boolean removeRequires_competence(ComOnt_Competence elem) {
     boolean result = requires_competence.remove(elem);
     return result;
   }
   public void clearAllRequires_competence() {
     requires_competence.clear();
   }
   public Iterator getAllRequires_competence() {return requires_competence.iterator(); }
   public List getRequires_competence() {return requires_competence; }
   public void setRequires_competence(List l) {requires_competence = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#Min_age
   */
   private List min_age = new ArrayList();
   public void addMin_age(int elem) { 
     min_age.add(elem);
   }
   public boolean removeMin_age(int elem) {
     boolean result = (boolean) min_age.remove(elem);
     return result;
   }
   public void clearAllMin_age() {
     min_age.clear();
   }
   public Iterator getAllMin_age() {return min_age.iterator(); }
   public List getMin_age() {return min_age; }
   public void setMin_age(List l) {min_age = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#requires_flexibility_to_travel
   */
   private List requires_flexibility_to_travel = new ArrayList();
   public void addRequires_flexibility_to_travel(boolean elem) { 
     requires_flexibility_to_travel.add(elem);
   }
   public boolean removeRequires_flexibility_to_travel(boolean elem) {
     boolean result = requires_flexibility_to_travel.remove(elem);
     return result;
   }
   public void clearAllRequires_flexibility_to_travel() {
     requires_flexibility_to_travel.clear();
   }
   public Iterator getAllRequires_flexibility_to_travel() {return requires_flexibility_to_travel.iterator(); }
   public List getRequires_flexibility_to_travel() {return requires_flexibility_to_travel; }
   public void setRequires_flexibility_to_travel(List l) {requires_flexibility_to_travel = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#has_work_condition
   */
   private List has_work_condition = new ArrayList();
   public void addHas_work_condition(LabRegOnt_Work_Condition elem) { 
     has_work_condition.add(elem);
   }
   public boolean removeHas_work_condition(LabRegOnt_Work_Condition elem) {
     boolean result = has_work_condition.remove(elem);
     return result;
   }
   public void clearAllHas_work_condition() {
     has_work_condition.clear();
   }
   public Iterator getAllHas_work_condition() {return has_work_condition.iterator(); }
   public List getHas_work_condition() {return has_work_condition; }
   public void setHas_work_condition(List l) {has_work_condition = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#Begin_date
   */
   private List begin_date = new ArrayList();
   public void addBegin_date(Time_specification elem) { 
     begin_date.add(elem);
   }
   public boolean removeBegin_date(Time_specification elem) {
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
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#requires_professional_affiliation
   */
   private List requires_professional_affiliation = new ArrayList();
   public void addRequires_professional_affiliation(OccOnt_Occupation elem) { 
     requires_professional_affiliation.add(elem);
   }
   public boolean removeRequires_professional_affiliation(OccOnt_Occupation elem) {
     boolean result = requires_professional_affiliation.remove(elem);
     return result;
   }
   public void clearAllRequires_professional_affiliation() {
     requires_professional_affiliation.clear();
   }
   public Iterator getAllRequires_professional_affiliation() {return requires_professional_affiliation.iterator(); }
   public List getRequires_professional_affiliation() {return requires_professional_affiliation; }
   public void setRequires_professional_affiliation(List l) {requires_professional_affiliation = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#has_education
   */
   private List has_education = new ArrayList();
   public void addHas_education(EduOnt_Education elem) { 
     has_education.add(elem);
   }
   public boolean removeHas_education(EduOnt_Education elem) {
     boolean result = has_education.remove(elem);
     return result;
   }
   public void clearAllHas_education() {
     has_education.clear();
   }
   public Iterator getAllHas_education() {return has_education.iterator(); }
   public List getHas_education() {return has_education; }
   public void setHas_education(List l) {has_education = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#End_date
   */
   private List end_date = new ArrayList();
   public void addEnd_date(Time_specification elem) { 
     end_date.add(elem);
   }
   public boolean removeEnd_date(Time_specification elem) {
     boolean result = end_date.remove(elem);
     return result;
   }
   public void clearAllEnd_date() {
     end_date.clear();
   }
   public Iterator getAllEnd_date() {return end_date.iterator(); }
   public List getEnd_date() {return end_date; }
   public void setEnd_date(List l) {end_date = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#duration
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
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#requires_car
   */
   private List requires_car = new ArrayList();
   public void addRequires_car(boolean elem) { 
     requires_car.add(elem);
   }
   public boolean removeRequires_car(boolean elem) {
     boolean result = requires_car.remove(elem);
     return result;
   }
   public void clearAllRequires_car() {
     requires_car.clear();
   }
   public Iterator getAllRequires_car() {return requires_car.iterator(); }
   public List getRequires_car() {return requires_car; }
   public void setRequires_car(List l) {requires_car = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#Max_age
   */
   private List max_age = new ArrayList();
   public void addMax_age(int elem) { 
     max_age.add(elem);
   }
   public boolean removeMax_age(int elem) {
     boolean result = (boolean) max_age.remove(elem);
     return result;
   }
   public void clearAllMax_age() {
     max_age.clear();
   }
   public Iterator getAllMax_age() {return max_age.iterator(); }
   public List getMax_age() {return max_age; }
   public void setMax_age(List l) {max_age = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#job_name
   */
   private List job_name = new ArrayList();
   public void addJob_name(String elem) { 
     job_name.add(elem);
   }
   public boolean removeJob_name(String elem) {
     boolean result = job_name.remove(elem);
     return result;
   }
   public void clearAllJob_name() {
     job_name.clear();
   }
   public Iterator getAllJob_name() {return job_name.iterator(); }
   public List getJob_name() {return job_name; }
   public void setJob_name(List l) {job_name = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#has_compensation
   */
   private List has_compensation = new ArrayList();
   public void addHas_compensation(CompOnt_Compensation elem) { 
     has_compensation.add(elem);
   }
   public boolean removeHas_compensation(CompOnt_Compensation elem) {
     boolean result = has_compensation.remove(elem);
     return result;
   }
   public void clearAllHas_compensation() {
     has_compensation.clear();
   }
   public Iterator getAllHas_compensation() {return has_compensation.iterator(); }
   public List getHas_compensation() {return has_compensation; }
   public void setHas_compensation(List l) {has_compensation = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#job_description
   */
   private List job_description = new ArrayList();
   public void addJob_description(String elem) { 
     job_description.add(elem);
   }
   public boolean removeJob_description(String elem) {
     boolean result = job_description.remove(elem);
     return result;
   }
   public void clearAllJob_description() {
     job_description.clear();
   }
   public Iterator getAllJob_description() {return job_description.iterator(); }
   public List getJob_description() {return job_description; }
   public void setJob_description(List l) {job_description = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#Work_Location
   */
   private List work_Location = new ArrayList();
   public void addWork_Location(String elem) { 
     work_Location.add(elem);
   }
   public boolean removeWork_Location(String elem) {
     boolean result = work_Location.remove(elem);
     return result;
   }
   public void clearAllWork_Location() {
     work_Location.clear();
   }
   public Iterator getAllWork_Location() {return work_Location.iterator(); }
   public List getWork_Location() {return work_Location; }
   public void setWork_Location(List l) {work_Location = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#Identifier
   */
   private List identifier = new ArrayList();
   public void addIdentifier(String elem) { 
     identifier.add(elem);
   }
   public boolean removeIdentifier(String elem) {
     boolean result = identifier.remove(elem);
     return result;
   }
   public void clearAllIdentifier() {
     identifier.clear();
   }
   public Iterator getAllIdentifier() {return identifier.iterator(); }
   public List getIdentifier() {return identifier; }
   public void setIdentifier(List l) {identifier = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#has_contract_type
   */
   private List has_contract_type = new ArrayList();
   public void addHas_contract_type(LabRegOnt_Contract_Type elem) { 
     has_contract_type.add(elem);
   }
   public boolean removeHas_contract_type(LabRegOnt_Contract_Type elem) {
     boolean result = has_contract_type.remove(elem);
     return result;
   }
   public void clearAllHas_contract_type() {
     has_contract_type.clear();
   }
   public Iterator getAllHas_contract_type() {return has_contract_type.iterator(); }
   public List getHas_contract_type() {return has_contract_type; }
   public void setHas_contract_type(List l) {has_contract_type = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#requires_work_experience
   */
   private List requires_work_experience = new ArrayList();
   public void addRequires_work_experience(Requested_Work_Experience elem) { 
     requires_work_experience.add(elem);
   }
   public boolean removeRequires_work_experience(Requested_Work_Experience elem) {
     boolean result = requires_work_experience.remove(elem);
     return result;
   }
   public void clearAllRequires_work_experience() {
     requires_work_experience.clear();
   }
   public Iterator getAllRequires_work_experience() {return requires_work_experience.iterator(); }
   public List getRequires_work_experience() {return requires_work_experience; }
   public void setRequires_work_experience(List l) {requires_work_experience = l; }

}
