package jobofferontology.ontology;


import jade.util.leap.*;

/**
* Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#Vacancy
* @author OntologyBeanGenerator v4.1
* @version 2015/06/9, 01:31:16
*/
public interface Vacancy extends jade.content.Concept {

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#requires_competence
   */
   public void addRequires_competence(ComOnt_Competence elem);
   public boolean removeRequires_competence(ComOnt_Competence elem);
   public void clearAllRequires_competence();
   public Iterator getAllRequires_competence();
   public List getRequires_competence();
   public void setRequires_competence(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#Min_age
   */
   public void addMin_age(int elem);
   public boolean removeMin_age(int elem);
   public void clearAllMin_age();
   public Iterator getAllMin_age();
   public List getMin_age();
   public void setMin_age(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#requires_flexibility_to_travel
   */
   public void addRequires_flexibility_to_travel(boolean elem);
   public boolean removeRequires_flexibility_to_travel(boolean elem);
   public void clearAllRequires_flexibility_to_travel();
   public Iterator getAllRequires_flexibility_to_travel();
   public List getRequires_flexibility_to_travel();
   public void setRequires_flexibility_to_travel(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#has_work_condition
   */
   public void addHas_work_condition(LabRegOnt_Work_Condition elem);
   public boolean removeHas_work_condition(LabRegOnt_Work_Condition elem);
   public void clearAllHas_work_condition();
   public Iterator getAllHas_work_condition();
   public List getHas_work_condition();
   public void setHas_work_condition(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#Begin_date
   */
   public void addBegin_date(Time_specification elem);
   public boolean removeBegin_date(Time_specification elem);
   public void clearAllBegin_date();
   public Iterator getAllBegin_date();
   public List getBegin_date();
   public void setBegin_date(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#requires_professional_affiliation
   */
   public void addRequires_professional_affiliation(OccOnt_Occupation elem);
   public boolean removeRequires_professional_affiliation(OccOnt_Occupation elem);
   public void clearAllRequires_professional_affiliation();
   public Iterator getAllRequires_professional_affiliation();
   public List getRequires_professional_affiliation();
   public void setRequires_professional_affiliation(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#has_education
   */
   public void addHas_education(EduOnt_Education elem);
   public boolean removeHas_education(EduOnt_Education elem);
   public void clearAllHas_education();
   public Iterator getAllHas_education();
   public List getHas_education();
   public void setHas_education(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#End_date
   */
   public void addEnd_date(Time_specification elem);
   public boolean removeEnd_date(Time_specification elem);
   public void clearAllEnd_date();
   public Iterator getAllEnd_date();
   public List getEnd_date();
   public void setEnd_date(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#duration
   */
   public void addDuration(Time_DurationDescription elem);
   public boolean removeDuration(Time_DurationDescription elem);
   public void clearAllDuration();
   public Iterator getAllDuration();
   public List getDuration();
   public void setDuration(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#requires_car
   */
   public void addRequires_car(boolean elem);
   public boolean removeRequires_car(boolean elem);
   public void clearAllRequires_car();
   public Iterator getAllRequires_car();
   public List getRequires_car();
   public void setRequires_car(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#Max_age
   */
   public void addMax_age(int elem);
   public boolean removeMax_age(int elem);
   public void clearAllMax_age();
   public Iterator getAllMax_age();
   public List getMax_age();
   public void setMax_age(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#job_name
   */
   public void addJob_name(String elem);
   public boolean removeJob_name(String elem);
   public void clearAllJob_name();
   public Iterator getAllJob_name();
   public List getJob_name();
   public void setJob_name(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#has_compensation
   */
   public void addHas_compensation(CompOnt_Compensation elem);
   public boolean removeHas_compensation(CompOnt_Compensation elem);
   public void clearAllHas_compensation();
   public Iterator getAllHas_compensation();
   public List getHas_compensation();
   public void setHas_compensation(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#job_description
   */
   public void addJob_description(String elem);
   public boolean removeJob_description(String elem);
   public void clearAllJob_description();
   public Iterator getAllJob_description();
   public List getJob_description();
   public void setJob_description(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#Work_Location
   */
   public void addWork_Location(String elem);
   public boolean removeWork_Location(String elem);
   public void clearAllWork_Location();
   public Iterator getAllWork_Location();
   public List getWork_Location();
   public void setWork_Location(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#Identifier
   */
   public void addIdentifier(String elem);
   public boolean removeIdentifier(String elem);
   public void clearAllIdentifier();
   public Iterator getAllIdentifier();
   public List getIdentifier();
   public void setIdentifier(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#has_contract_type
   */
   public void addHas_contract_type(LabRegOnt_Contract_Type elem);
   public boolean removeHas_contract_type(LabRegOnt_Contract_Type elem);
   public void clearAllHas_contract_type();
   public Iterator getAllHas_contract_type();
   public List getHas_contract_type();
   public void setHas_contract_type(List l);

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Job_Offer_Ontology#requires_work_experience
   */
   public void addRequires_work_experience(Requested_Work_Experience elem);
   public boolean removeRequires_work_experience(Requested_Work_Experience elem);
   public void clearAllRequires_work_experience();
   public Iterator getAllRequires_work_experience();
   public List getRequires_work_experience();
   public void setRequires_work_experience(List l);

}
