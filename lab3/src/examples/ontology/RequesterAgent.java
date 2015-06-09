/*****************************************************************
JADE - Java Agent DEvelopment Framework is a framework to develop
multi-agent systems in compliance with the FIPA specifications.
Copyright (C) 2000 CSELT S.p.A. 

GNU Lesser General Public License

This library is free software; you can redistribute it and/or
modify it under the terms of the GNU Lesser General Public
License as published by the Free Software Foundation, 
version 2.1 of the License. 

This library is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
Lesser General Public License for more details.

You should have received a copy of the GNU Lesser General Public
License along with this library; if not, write to the
Free Software Foundation, Inc., 59 Temple Place - Suite 330,
Boston, MA  02111-1307, USA.
*****************************************************************/

package examples.ontology;

import jade.lang.acl.ACLMessage;
import jade.core.*;
import jade.core.behaviours.*;
import jade.domain.FIPANames;
import jade.proto.SimpleAchieveREInitiator;
import jade.content.lang.Codec;
import jade.content.lang.sl.*;

import jade.domain.*;
import jade.content.*;
import jade.content.abs.*;
import jade.content.onto.*;
import jade.content.onto.basic.*;

import java.util.Vector;
import jade.util.leap.*;

import java.io.*;

import jobofferontology.ontology.ComOnt_Competence;
import jobofferontology.ontology.CompOnt_Compensation;
import jobofferontology.ontology.EduOnt_Education;
import jobofferontology.ontology.How_To_Apply;
import jobofferontology.ontology.JobOfferOntologyOntology;
import jobofferontology.ontology.Job_Vacancy;
import jobofferontology.ontology.LabRegOnt_Contract_Type;
import jobofferontology.ontology.LabRegOnt_Work_Condition;
import jobofferontology.ontology.OccOnt_Occupation;
import jobofferontology.ontology.Organization;
import jobofferontology.ontology.Requested_Work_Experience;
import jobofferontology.ontology.Time_DateTimeDescription;
import jobofferontology.ontology.Time_DurationDescription;
import jobofferontology.ontology.Time_specification;
import jobofferontology.ontology.Vacancy;

/**
	This agent is able to handle the engagement of people by requesting
	an engager agent to do that.
	It first gets from the user 
	<ul>
		<li>The name of the engager agent to send engagement requests to.</li>
		<li>The details of the company where to engage people</li>
	</ul>
	Then it cyclically gets from the user the details of a person
	to engage and handles the engagement of that person in collaboration
	with the initially indicated engager agent.
	
	<b>Note:</b> 
	While entering input data, all fields composed of more than
	one word must be enclosed in "".
	E.g. the name Giovanni Caire must be entered as "Giovanni Caire".
	
	@author Giovanni Caire - CSELT S.p.A
	@version $Date: 2002-07-31 17:27:34 +0200 (mer, 31 lug 2002) $ $Revision: 3315 $
	@see examples.ontology.EngagerAgent
*/
public class RequesterAgent extends Agent {
	
	// AGENT BEHAVIOURS
	/**
		Main behaviour for the Requester Agent.
		First the details of a person to engage are requested 
		to the user.
		Then a check is performed to verify that the indicated person is not
		already working for the indicated company
		Finally, according to the above check, the engagement is requested.
		This behaviour is executed cyclically.
	*/
	class HandleEngagementBehaviour extends SequentialBehaviour {
		// Local variables
		Behaviour queryBehaviour = null;
		Behaviour requestBehaviour = null;
		
		// Constructor
		public HandleEngagementBehaviour(Agent myAgent){
			super(myAgent);
		}
		
		// This is executed at the beginning of the behaviour
		public void onStart(){
			// Get detail of person to be engaged
			try{
				BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
				Job_Vacancy p = new Job_Vacancy() {
					
					@Override
					public void setPublication_date(List l) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void setHow_to_apply(List l) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void setHas_vacancy(List l) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void setEmployment_agent(List l) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void setAnonymous(List l) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public boolean removePublication_date(Time_DateTimeDescription elem) {
						// TODO Auto-generated method stub
						return false;
					}
					
					@Override
					public boolean removeHow_to_apply(How_To_Apply elem) {
						// TODO Auto-generated method stub
						return false;
					}
					
					@Override
					public boolean removeHas_vacancy(Vacancy elem) {
						// TODO Auto-generated method stub
						return false;
					}
					
					@Override
					public boolean removeEmployment_agent(String elem) {
						// TODO Auto-generated method stub
						return false;
					}
					
					@Override
					public boolean removeAnonymous(boolean elem) {
						// TODO Auto-generated method stub
						return false;
					}
					
					@Override
					public List getPublication_date() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public List getHow_to_apply() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public List getHas_vacancy() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public List getEmployment_agent() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public List getAnonymous() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public Iterator getAllPublication_date() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public Iterator getAllHow_to_apply() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public Iterator getAllHas_vacancy() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public Iterator getAllEmployment_agent() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public Iterator getAllAnonymous() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public void clearAllPublication_date() {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void clearAllHow_to_apply() {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void clearAllHas_vacancy() {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void clearAllEmployment_agent() {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void clearAllAnonymous() {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void addPublication_date(Time_DateTimeDescription elem) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void addHow_to_apply(How_To_Apply elem) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void addHas_vacancy(Vacancy elem) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void addEmployment_agent(String elem) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void addAnonymous(boolean elem) {
						// TODO Auto-generated method stub
						
					}
				};
				//Address a = new Address();
				p.addAnonymous(false);
				//p.;
				Vacancy vc = new Vacancy() {
					
					@Override
					public void setWork_Location(List l) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void setRequires_work_experience(List l) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void setRequires_professional_affiliation(List l) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void setRequires_flexibility_to_travel(List l) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void setRequires_competence(List l) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void setRequires_car(List l) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void setMin_age(List l) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void setMax_age(List l) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void setJob_name(List l) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void setJob_description(List l) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void setIdentifier(List l) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void setHas_work_condition(List l) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void setHas_education(List l) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void setHas_contract_type(List l) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void setHas_compensation(List l) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void setEnd_date(List l) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void setDuration(List l) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void setBegin_date(List l) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public boolean removeWork_Location(String elem) {
						// TODO Auto-generated method stub
						return false;
					}
					
					@Override
					public boolean removeRequires_work_experience(Requested_Work_Experience elem) {
						// TODO Auto-generated method stub
						return false;
					}
					
					@Override
					public boolean removeRequires_professional_affiliation(
							OccOnt_Occupation elem) {
						// TODO Auto-generated method stub
						return false;
					}
					
					@Override
					public boolean removeRequires_flexibility_to_travel(boolean elem) {
						// TODO Auto-generated method stub
						return false;
					}
					
					@Override
					public boolean removeRequires_competence(ComOnt_Competence elem) {
						// TODO Auto-generated method stub
						return false;
					}
					
					@Override
					public boolean removeRequires_car(boolean elem) {
						// TODO Auto-generated method stub
						return false;
					}
					
					@Override
					public boolean removeMin_age(int elem) {
						// TODO Auto-generated method stub
						return false;
					}
					
					@Override
					public boolean removeMax_age(int elem) {
						// TODO Auto-generated method stub
						return false;
					}
					
					@Override
					public boolean removeJob_name(String elem) {
						// TODO Auto-generated method stub
						return false;
					}
					
					@Override
					public boolean removeJob_description(String elem) {
						// TODO Auto-generated method stub
						return false;
					}
					
					@Override
					public boolean removeIdentifier(String elem) {
						// TODO Auto-generated method stub
						return false;
					}
					
					@Override
					public boolean removeHas_work_condition(LabRegOnt_Work_Condition elem) {
						// TODO Auto-generated method stub
						return false;
					}
					
					@Override
					public boolean removeHas_education(EduOnt_Education elem) {
						// TODO Auto-generated method stub
						return false;
					}
					
					@Override
					public boolean removeHas_contract_type(LabRegOnt_Contract_Type elem) {
						// TODO Auto-generated method stub
						return false;
					}
					
					@Override
					public boolean removeHas_compensation(CompOnt_Compensation elem) {
						// TODO Auto-generated method stub
						return false;
					}
					
					@Override
					public boolean removeEnd_date(Time_specification elem) {
						// TODO Auto-generated method stub
						return false;
					}
					
					@Override
					public boolean removeDuration(Time_DurationDescription elem) {
						// TODO Auto-generated method stub
						return false;
					}
					
					@Override
					public boolean removeBegin_date(Time_specification elem) {
						// TODO Auto-generated method stub
						return false;
					}
					
					@Override
					public List getWork_Location() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public List getRequires_work_experience() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public List getRequires_professional_affiliation() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public List getRequires_flexibility_to_travel() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public List getRequires_competence() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public List getRequires_car() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public List getMin_age() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public List getMax_age() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public List getJob_name() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public List getJob_description() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public List getIdentifier() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public List getHas_work_condition() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public List getHas_education() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public List getHas_contract_type() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public List getHas_compensation() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public List getEnd_date() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public List getDuration() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public List getBegin_date() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public Iterator getAllWork_Location() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public Iterator getAllRequires_work_experience() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public Iterator getAllRequires_professional_affiliation() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public Iterator getAllRequires_flexibility_to_travel() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public Iterator getAllRequires_competence() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public Iterator getAllRequires_car() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public Iterator getAllMin_age() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public Iterator getAllMax_age() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public Iterator getAllJob_name() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public Iterator getAllJob_description() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public Iterator getAllIdentifier() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public Iterator getAllHas_work_condition() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public Iterator getAllHas_education() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public Iterator getAllHas_contract_type() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public Iterator getAllHas_compensation() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public Iterator getAllEnd_date() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public Iterator getAllDuration() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public Iterator getAllBegin_date() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public void clearAllWork_Location() {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void clearAllRequires_work_experience() {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void clearAllRequires_professional_affiliation() {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void clearAllRequires_flexibility_to_travel() {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void clearAllRequires_competence() {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void clearAllRequires_car() {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void clearAllMin_age() {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void clearAllMax_age() {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void clearAllJob_name() {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void clearAllJob_description() {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void clearAllIdentifier() {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void clearAllHas_work_condition() {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void clearAllHas_education() {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void clearAllHas_contract_type() {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void clearAllHas_compensation() {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void clearAllEnd_date() {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void clearAllDuration() {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void clearAllBegin_date() {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void addWork_Location(String elem) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void addRequires_work_experience(Requested_Work_Experience elem) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void addRequires_professional_affiliation(OccOnt_Occupation elem) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void addRequires_flexibility_to_travel(boolean elem) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void addRequires_competence(ComOnt_Competence elem) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void addRequires_car(boolean elem) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void addMin_age(int elem) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void addMax_age(int elem) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void addJob_name(String elem) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void addJob_description(String elem) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void addIdentifier(String elem) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void addHas_work_condition(LabRegOnt_Work_Condition elem) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void addHas_education(EduOnt_Education elem) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void addHas_contract_type(LabRegOnt_Contract_Type elem) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void addHas_compensation(CompOnt_Compensation elem) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void addEnd_date(Time_specification elem) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void addDuration(Time_DurationDescription elem) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void addBegin_date(Time_specification elem) {
						// TODO Auto-generated method stub
						
					}
				};
				System.out.println("ENTER details of Job Vacancy");
				System.out.print("  Job name --> ");			
				vc.addJob_name(buff.readLine());
				
				
				System.out.println("ENTER details of Job description");
				System.out.print(" Job description --> ");			
				vc.addJob_description(buff.readLine());
				//p.setName();
				System.out.print("  Person age ---> ");		
				vc.addMax_age(new Integer(buff.readLine()));
				
				System.out.println("  Job address");
				System.out.print("    Address -----> ");
				vc.addWork_Location(buff.readLine());
				p.addHas_vacancy(vc);
				/*
				//p.setAge(new Long(buff.readLine()));
				System.out.println("  Person address");
				System.out.print("    Street -----> ");
				a.setStreet(buff.readLine());
				System.out.print("    Number -----> ");
				a.setNumber(new Long(buff.readLine()));
				System.out.print("    City   -----> ");
				a.setCity(buff.readLine());
				p.setAddress(a);
				*/
				// Create an object representing the fact that person p works for company c
				
				
				//WorksFor wf = new WorksFor();
				//wf.setPerson(p);
				//wf.setCompany(((RequesterAgent) myAgent).c);
				/*Organization orgn = new Organization() {
					
					@Override
					public void setTelephone(List l) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void setPostal_Code(List l) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void setNumber_workers(List l) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void setHas_job_vacancy(List l) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void setFull_Name(List l) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void setFax(List l) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void setEmail(List l) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void setContact_person(List l) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void setAddress(List l) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public boolean removeTelephone(String elem) {
						// TODO Auto-generated method stub
						return false;
					}
					
					@Override
					public boolean removePostal_Code(String elem) {
						// TODO Auto-generated method stub
						return false;
					}
					
					@Override
					public boolean removeNumber_workers(int elem) {
						// TODO Auto-generated method stub
						return false;
					}
					
					@Override
					public boolean removeHas_job_vacancy(Job_Vacancy elem) {
						// TODO Auto-generated method stub
						return false;
					}
					
					@Override
					public boolean removeFull_Name(String elem) {
						// TODO Auto-generated method stub
						return false;
					}
					
					@Override
					public boolean removeFax(String elem) {
						// TODO Auto-generated method stub
						return false;
					}
					
					@Override
					public boolean removeEmail(String elem) {
						// TODO Auto-generated method stub
						return false;
					}
					
					@Override
					public boolean removeContact_person(String elem) {
						// TODO Auto-generated method stub
						return false;
					}
					
					@Override
					public boolean removeAddress(String elem) {
						// TODO Auto-generated method stub
						return false;
					}
					
					@Override
					public List getTelephone() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public List getPostal_Code() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public List getNumber_workers() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public List getHas_job_vacancy() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public List getFull_Name() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public List getFax() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public List getEmail() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public List getContact_person() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public Iterator getAllTelephone() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public Iterator getAllPostal_Code() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public Iterator getAllNumber_workers() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public Iterator getAllHas_job_vacancy() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public Iterator getAllFull_Name() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public Iterator getAllFax() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public Iterator getAllEmail() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public Iterator getAllContact_person() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public Iterator getAllAddress() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public List getAddress() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public void clearAllTelephone() {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void clearAllPostal_Code() {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void clearAllNumber_workers() {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void clearAllHas_job_vacancy() {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void clearAllFull_Name() {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void clearAllFax() {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void clearAllEmail() {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void clearAllContact_person() {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void clearAllAddress() {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void addTelephone(String elem) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void addPostal_Code(String elem) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void addNumber_workers(int elem) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void addHas_job_vacancy(Job_Vacancy elem) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void addFull_Name(String elem) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void addFax(String elem) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void addEmail(String elem) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void addContact_person(String elem) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void addAddress(String elem) {
						// TODO Auto-generated method stub
						
					}
				};
				orgn.addHas_job_vacancy(p);*/
				
				
				
				Ontology o = myAgent.getContentManager().lookupOntology(JobOfferOntologyOntology.ONTOLOGY_NAME);		
				// Create an ACL message to query the engager agent if the above fact is true or false
				ACLMessage queryMsg = new ACLMessage(ACLMessage.QUERY_IF);
				queryMsg.addReceiver(((RequesterAgent) myAgent).engager);
				queryMsg.setLanguage(FIPANames.ContentLanguage.FIPA_SL0);
				queryMsg.setOntology(JobOfferOntologyOntology.ONTOLOGY_NAME);
    			// Write the works for predicate in the :content slot of the message
		    
					    	try {
		    		myAgent.getContentManager().fillContent(queryMsg, (AbsContentElement) orgnt);
		    	} catch (Exception e) {
		    		e.printStackTrace();
		    	}
				
			
		    // Create and add a behaviour to query the engager agent whether
				// person p already works for company c following a FIPAQeury protocol
				queryBehaviour = new CheckAlreadyWorkingBehaviour(myAgent, queryMsg);
				addSubBehaviour(queryBehaviour);
			}
			catch (IOException ioe) { 
				System.err.println("I/O error: " + ioe.getMessage()); 
			}
		}
		
		// This is executed at the end of the behaviour
		public int onEnd(){
			// Check whether the user wants to continue
			try{
				BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Would you like to continue?[y/n] ");
				String stop = buff.readLine();
				if (stop.equalsIgnoreCase("y"))
					{
					    reset(); // This makes this behaviour be cyclically executed
					    myAgent.addBehaviour(this);
					}
				else
				    myAgent.doDelete(); // Exit
			}
			catch (IOException ioe) { 
				System.err.println("I/O error: " + ioe.getMessage()); 
			}
			return 0;
		}
		
		// Extends the reset method in order to remove the sub-behaviours that
		// are dynamically added 
		public void reset(){
			if (queryBehaviour != null){
				removeSubBehaviour(queryBehaviour);
				queryBehaviour = null;
			}
			if (requestBehaviour != null){
				removeSubBehaviour(requestBehaviour);
				requestBehaviour = null;
			}
			super.reset();
		}
	}
	
	
	/**
		This behaviour embeds the check that the indicated person is not
		already working for the indicated company.
		This is done following a FIPA-Query interaction protocol
	*/
	class CheckAlreadyWorkingBehaviour extends SimpleAchieveREInitiator {
		// Constructor
		public CheckAlreadyWorkingBehaviour(Agent myAgent, ACLMessage queryMsg){
			super(myAgent, queryMsg);
			queryMsg.setProtocol(FIPANames.InteractionProtocol.FIPA_QUERY);
		}
		
		protected void handleInform(ACLMessage msg) {
			try{
				AbsPredicate cs = (AbsPredicate)myAgent.getContentManager().extractAbsContent(msg);
				Ontology o = myAgent.getContentManager().lookupOntology(JobOfferOntologyOntology.ONTOLOGY_NAME);
				if (cs.getTypeName().equals(JobOfferOntologyOntology.ORGANIZATION_HAS_JOB_VACANCY)) {
					// The indicated person is already working for company c. 
					// Inform the user
					
					//WorksFor wf = (WorksFor)o.toObject((AbsObject)cs);
					/**Person p = (Person) wf.getPerson();
					Company c = (Company) wf.getCompany();
					orgnt.
					System.out.println("Person " + p.getName() + " is already working for " + c.getName());
				*/}
				else if (cs.getTypeName().equals(SLVocabulary.NOT)){
					// The indicated person is NOT already working for company c.
					// Get person and company details and create an object representing the engagement action
				/*	WorksFor wf = (WorksFor)o.toObject(cs.getAbsObject(SLVocabulary.NOT_WHAT));
					Person p = (Person) wf.getPerson();
					Company c = (Company) wf.getCompany();
					Engage e = new Engage();
					e.setPerson(p);
					e.setCompany(c);
					Action a = new Action();
					a.setActor(((RequesterAgent) myAgent).engager);
					a.setAction(e);
			*/
					// Create an ACL message to request the above action
					ACLMessage requestMsg = new ACLMessage(ACLMessage.REQUEST);
					requestMsg.addReceiver(((RequesterAgent) myAgent).engager);
					requestMsg.setLanguage(FIPANames.ContentLanguage.FIPA_SL0);
					requestMsg.setOntology(JobOfferOntologyOntology.ONTOLOGY_NAME);
    			// Write the action in the :content slot of the message
		    		
		    	/*	try {
		    			myAgent.getContentManager().fillContent(requestMsg, a);
					} catch (Exception pe) {
					}*/
					// Create and add a behaviour to request the engager agent to engage
					// person p in company c following a FIPARequest protocol
					((HandleEngagementBehaviour) parent).requestBehaviour = new RequestEngagementBehaviour(myAgent, requestMsg);
					((SequentialBehaviour) parent).addSubBehaviour(((HandleEngagementBehaviour) parent).requestBehaviour);
				}
				else{
					// Unexpected response received from the engager agent.
					// Inform the user
					System.out.println("Unexpected response from engager agent");
				}
				
			} // End of try
			catch (Codec.CodecException fe) {
				System.err.println("FIPAException in fill/extract Msgcontent:" + fe.getMessage());
			}
			catch (OntologyException fe) {
				System.err.println("OntologyException in getRoleName:" + fe.getMessage());
			}
		}
		
	}
			
			
	/**
		This behaviour embeds the request to engage the indicated person 
		in the indicated company.
		This is done following a FIPA-Request interaction protocol
	*/
	class RequestEngagementBehaviour extends SimpleAchieveREInitiator {
		// Constructor
		public RequestEngagementBehaviour(Agent myAgent, ACLMessage requestMsg){
			super(myAgent, requestMsg);
			requestMsg.setProtocol(FIPANames.InteractionProtocol.FIPA_REQUEST);
		}

		protected void handleAgree(ACLMessage msg) {
			System.out.println("Engagement agreed. Waiting for completion notification...");
		}
		protected void handleInform(ACLMessage msg) {
			System.out.println("Engagement successfully completed");	
		}
		protected void handleNotUnderstood(ACLMessage msg) {
			System.out.println("Engagement request not understood by engager agent");			
		}
		protected void handleFailure(ACLMessage msg) {
			System.out.println("Engagement failed");
			// Get the failure reason and communicate it to the user
			try{
				AbsPredicate absPred =(AbsPredicate)myAgent.getContentManager().extractContent(msg);
				
				System.out.println("The reason is: " + absPred.getTypeName());
			}
			catch (Codec.CodecException fe){
				System.err.println("FIPAException reading failure reason: " + fe.getMessage());
			}
			catch (OntologyException oe){
				System.err.println("OntologyException reading failure reason: " + oe.getMessage());
			}
		}
		protected void handleRefuse(ACLMessage msg) {
			System.out.println("Engagement refused");
			// Get the refusal reason and communicate it to the user
			try{
				AbsContentElementList list =(AbsContentElementList)myAgent.getContentManager().extractAbsContent(msg);
				AbsPredicate absPred = (AbsPredicate)list.get(1);
				System.out.println("The reason is: " + absPred.getTypeName());
			}
			catch (Codec.CodecException fe){
				System.err.println("FIPAException reading refusal reason: " + fe.getMessage());
			}
			catch (OntologyException oe){
				System.err.println("OntologyException reading refusal reason: " + oe.getMessage());
			}
		}
	}		
		

	// AGENT LOCAL VARIABLES
	AID engager; // AID of the agent the engagement requests will have to be sent to
	Organization orgnt;   // The  company where people will be engaged
	
	
	// AGENT SETUP
	protected void setup() {
		
		// Register the codec for the SL0 language
		getContentManager().registerLanguage(new SLCodec(), FIPANames.ContentLanguage.FIPA_SL0);	
		
		// Register the ontology used by this application
		getContentManager().registerOntology(JobOfferOntologyOntology.getInstance());
	
		// Get from the user the name of the agent the engagement requests
		// will have to be sent to
		try {
			BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("ENTER the local name of the Engager agent --> ");
			String name = buff.readLine();
			engager = new AID(name, AID.ISLOCALNAME);
		
			// Get from the user the details of the company where people will 
			// be engaged
			orgnt = new Organization() {
				
				@Override
				public void setTelephone(List l) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void setPostal_Code(List l) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void setNumber_workers(List l) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void setHas_job_vacancy(List l) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void setFull_Name(List l) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void setFax(List l) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void setEmail(List l) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void setContact_person(List l) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void setAddress(List l) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public boolean removeTelephone(String elem) {
					// TODO Auto-generated method stub
					return false;
				}
				
				@Override
				public boolean removePostal_Code(String elem) {
					// TODO Auto-generated method stub
					return false;
				}
				
				@Override
				public boolean removeNumber_workers(int elem) {
					// TODO Auto-generated method stub
					return false;
				}
				
				@Override
				public boolean removeHas_job_vacancy(Job_Vacancy elem) {
					// TODO Auto-generated method stub
					return false;
				}
				
				@Override
				public boolean removeFull_Name(String elem) {
					// TODO Auto-generated method stub
					return false;
				}
				
				@Override
				public boolean removeFax(String elem) {
					// TODO Auto-generated method stub
					return false;
				}
				
				@Override
				public boolean removeEmail(String elem) {
					// TODO Auto-generated method stub
					return false;
				}
				
				@Override
				public boolean removeContact_person(String elem) {
					// TODO Auto-generated method stub
					return false;
				}
				
				@Override
				public boolean removeAddress(String elem) {
					// TODO Auto-generated method stub
					return false;
				}
				
				@Override
				public List getTelephone() {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public List getPostal_Code() {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public List getNumber_workers() {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public List getHas_job_vacancy() {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public List getFull_Name() {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public List getFax() {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public List getEmail() {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public List getContact_person() {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public Iterator getAllTelephone() {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public Iterator getAllPostal_Code() {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public Iterator getAllNumber_workers() {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public Iterator getAllHas_job_vacancy() {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public Iterator getAllFull_Name() {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public Iterator getAllFax() {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public Iterator getAllEmail() {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public Iterator getAllContact_person() {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public Iterator getAllAddress() {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public List getAddress() {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public void clearAllTelephone() {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void clearAllPostal_Code() {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void clearAllNumber_workers() {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void clearAllHas_job_vacancy() {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void clearAllFull_Name() {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void clearAllFax() {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void clearAllEmail() {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void clearAllContact_person() {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void clearAllAddress() {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void addTelephone(String elem) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void addPostal_Code(String elem) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void addNumber_workers(int elem) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void addHas_job_vacancy(Job_Vacancy elem) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void addFull_Name(String elem) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void addFax(String elem) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void addEmail(String elem) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void addContact_person(String elem) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void addAddress(String elem) {
					// TODO Auto-generated method stub
					
				}
			};
			
			/*c  = new Company();
			Address a = new Address();
			*/System.out.println("ENTER details of the company where people will be engaged");
			System.out.print("  Company name --> ");	
			orgnt.addFull_Name(buff.readLine());
			/*c.setName(buff.readLine());*/
			System.out.println("  Company address");
			System.out.print("    Address ------> ");
			orgnt.addAddress(buff.readLine());
			System.out.print("    Number ------> ");
			//a.setNumber(new Long(buff.readLine()));
			orgnt.addNumber_workers(new Integer(buff.readLine()));
			System.out.print("    Email  ------> ");
			orgnt.addEmail(buff.readLine());
			//a.setCity(buff.readLine());
			//c.setAddress(a);*/
		}
		catch (IOException ioe) { 
			System.err.println("I/O error: " + ioe.getMessage()); 
		}
		
		// Create and add the main behaviour of this agent
  	addBehaviour(new HandleEngagementBehaviour(this));
	}
}
