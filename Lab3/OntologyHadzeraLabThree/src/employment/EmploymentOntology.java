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


package employment;

import education.Country;
import education.JobOffOnt_Organization;
import education.JobOffOnt_Vacancy;
import education.JobSeeOnt_Candidacy;
import education.JobSeeOnt_Job_Seeker;
import education.Location;
import education.Region;
import education.impl.DefaultContinent;
import jade.content.onto.BasicOntology;
import jade.content.onto.Ontology;
import jade.content.onto.OntologyException;
import jade.content.schema.AgentActionSchema;
import jade.content.schema.ConceptSchema;
import jade.content.schema.ObjectSchema;
import jade.content.schema.PredicateSchema;
import jade.content.schema.PrimitiveSchema;

/**
   Javadoc documentation for the file EmploymentOntology
   @author Giovanni Caire - CSELT S.p.A.
   @version $Date: 2002-07-31 17:27:34 +0200 (mer, 31 lug 2002) $ $Revision: 3315 $
*/

public class EmploymentOntology extends Ontology {

  /**
	 * 
	 */
	private static final long serialVersionUID = -3312064632054394317L;

/**
    A symbolic constant, containing the name of this ontology.
   */
  public static final String NAME = "employment-ontology";

  // VOCABULARY
  // Concepts
  public static final String ADDRESS = "ADDRESS";
  public static final String ADDRESS_NAME = "street";
  public static final String ADDRESS_NUMBER = "number";
  public static final String ADDRESS_CITY = "city";
  public static final String ADDRESS_CONTINENT = "continent";
  
  public static final String PERSON = "PERSON";
  public static final String PERSON_NAME = "name";
  public static final String PERSON_AGE = "age";
  public static final String PERSON_ADDRESS = "address";
  
  public static final String COMPANY = "COMPANY";
  public static final String COMPANY_NAME = "name";
  public static final String COMPANY_ADDRESS = "address";
  
  // Actions
  public static final String ENGAGE = "ENGAGE";
  public static final String ENGAGE_PERSON = "person";
  public static final String ENGAGE_COMPANY = "company";
  // Predicates
  public static final String WORKS_FOR = "WORKS-FOR";
  public static final String WORKS_FOR_PERSON = "person";
  public static final String WORKS_FOR_COMPANY = "company";
  public static final String ENGAGEMENT_ERROR = "ENGAGEMENT-ERROR";
  public static final String PERSON_TOO_OLD = "PERSON-TOO-OLD";
  
  public static final String JOBOFFONT_ORGANIZATION="JobOffOnt_Organization";
  public static final String LOCATION_IS_LOCATION_OF_ORGANIZATION="is_location_of_Organization";
  public static final String LOCATION_IS_ASSOCIATED_WITH_VACANCY="is_associated_with_Vacancy";
  public static final String LOCATION="Location";
  public static final String CONTINENT_HAS_COUNTRY_COUNTRY="has_country_Country";
  public static final String CONTINENT="Continent";
  public static final String JOBSEEONT_CANDIDACY="JobSeeOnt_Candidacy";
  public static final String JOBSEEONT_JOB_SEEKER="JobSeeOnt_Job_Seeker";
  public static final String REGION_IS_LOCATED_IN_COUNTRY="is_located_in_Country";
  public static final String REGION="Region";
  public static final String JOBOFFONT_VACANCY="JobOffOnt_Vacancy";
  public static final String COUNTRY_IS_LOCATED_IN_CONTINENT="is_located_in_Continent";
  public static final String COUNTRY_IS_NATION_OF_CANDIDACY="is_nation_of_Candidacy";
  public static final String COUNTRY_HAS_REGION_REGION="has_region_Region";
  public static final String COUNTRY_IS_RESIDENCE_OF_JOB_SEEKER="is_residence_of_Job_Seeker";
  public static final String COUNTRY="Country";
  
  public static final String CONTINENT_NAME = "name";
  
  private static Ontology theInstance = new EmploymentOntology();
	
  /**
     This method grants access to the unique instance of the
     ontology.
     @return An <code>Ontology</code> object, containing the concepts
     of the ontology.
  */
   public static Ontology getInstance() {
		return theInstance;
   }
	
  /**
   * Constructor
   */
  private EmploymentOntology() {
    //__CLDC_UNSUPPORTED__BEGIN
  	super(NAME, BasicOntology.getInstance());


    try {
		add(new ConceptSchema(ADDRESS), Address.class);
		add(new ConceptSchema(PERSON), Person.class);
		add(new ConceptSchema(COMPANY), Company.class);
		
		ConceptSchema countrySchema = new ConceptSchema(COUNTRY);
	    add(countrySchema, Country.class);
	    ConceptSchema jobOffOnt_VacancySchema = new ConceptSchema(JOBOFFONT_VACANCY);
	    add(jobOffOnt_VacancySchema, JobOffOnt_Vacancy.class);
	    ConceptSchema regionSchema = new ConceptSchema(REGION);
	    add(regionSchema, Region.class);
	    ConceptSchema jobSeeOnt_Job_SeekerSchema = new ConceptSchema(JOBSEEONT_JOB_SEEKER);
	    add(jobSeeOnt_Job_SeekerSchema, JobSeeOnt_Job_Seeker.class);
	    ConceptSchema jobSeeOnt_CandidacySchema = new ConceptSchema(JOBSEEONT_CANDIDACY);
	    add(jobSeeOnt_CandidacySchema, JobSeeOnt_Candidacy.class);
	    ConceptSchema locationSchema = new ConceptSchema(LOCATION);
	    add(locationSchema, Location.class);
	    ConceptSchema jobOffOnt_OrganizationSchema = new ConceptSchema(JOBOFFONT_ORGANIZATION);
	    add(jobOffOnt_OrganizationSchema, JobOffOnt_Organization.class);

	    ConceptSchema continentSchema = new ConceptSchema(CONTINENT);
	    add(continentSchema, DefaultContinent.class);
	    continentSchema.add(CONTINENT_NAME, (PrimitiveSchema)getSchema(BasicOntology.STRING));
		
		add(new PredicateSchema(WORKS_FOR), WorksFor.class);
		add(new PredicateSchema(PERSON_TOO_OLD), PersonTooOld.class);
		add(new PredicateSchema(ENGAGEMENT_ERROR), EngagementError.class);
		add(new AgentActionSchema(ENGAGE), Engage.class);
		
    	ConceptSchema cs = (ConceptSchema)getSchema(ADDRESS);
		cs.add(ADDRESS_NAME, (PrimitiveSchema)getSchema(BasicOntology.STRING));
		cs.add(ADDRESS_NUMBER, (PrimitiveSchema)getSchema(BasicOntology.INTEGER), ObjectSchema.OPTIONAL);
		cs.add(ADDRESS_CITY, (PrimitiveSchema)getSchema(BasicOntology.STRING), ObjectSchema.OPTIONAL);
		cs.add(ADDRESS_CONTINENT, continentSchema, ObjectSchema.OPTIONAL);
    	
    	cs = (ConceptSchema)getSchema(PERSON);
    	cs.add(PERSON_NAME, (PrimitiveSchema)getSchema(BasicOntology.STRING));
    	cs.add(PERSON_AGE, (PrimitiveSchema)getSchema(BasicOntology.INTEGER), ObjectSchema.OPTIONAL);
    	cs.add(PERSON_ADDRESS, (ConceptSchema)getSchema(ADDRESS), ObjectSchema.OPTIONAL);
    	
    	cs = (ConceptSchema)getSchema(COMPANY);
    	cs.add(COMPANY_NAME, (PrimitiveSchema)getSchema(BasicOntology.STRING));
    	cs.add(COMPANY_ADDRESS, (ConceptSchema)getSchema(ADDRESS), ObjectSchema.OPTIONAL);
    	
    	PredicateSchema ps = (PredicateSchema)getSchema(WORKS_FOR);
    	ps.add(WORKS_FOR_PERSON, (ConceptSchema)getSchema(PERSON));
    	ps.add(WORKS_FOR_COMPANY, (ConceptSchema)getSchema(COMPANY));
    	
		AgentActionSchema as = (AgentActionSchema)getSchema(ENGAGE);
		as.add(ENGAGE_PERSON, (ConceptSchema)getSchema(PERSON));
		as.add(ENGAGE_COMPANY, (ConceptSchema)getSchema(COMPANY)); 	
		
		countrySchema.add(COUNTRY_IS_RESIDENCE_OF_JOB_SEEKER, jobSeeOnt_Job_SeekerSchema, 0, ObjectSchema.UNLIMITED);
	    countrySchema.add(COUNTRY_HAS_REGION_REGION, regionSchema, 0, ObjectSchema.UNLIMITED);
	    countrySchema.add(COUNTRY_IS_NATION_OF_CANDIDACY, jobSeeOnt_CandidacySchema, 0, ObjectSchema.UNLIMITED);
	    countrySchema.add(COUNTRY_IS_LOCATED_IN_CONTINENT, continentSchema, 0, ObjectSchema.UNLIMITED);
	    regionSchema.add(REGION_IS_LOCATED_IN_COUNTRY, countrySchema, 0, ObjectSchema.UNLIMITED);
	    continentSchema.add(CONTINENT_HAS_COUNTRY_COUNTRY, countrySchema, 0, ObjectSchema.UNLIMITED);
	    locationSchema.add(LOCATION_IS_ASSOCIATED_WITH_VACANCY, jobOffOnt_VacancySchema, 0, ObjectSchema.UNLIMITED);
	    locationSchema.add(LOCATION_IS_LOCATION_OF_ORGANIZATION, jobOffOnt_OrganizationSchema, 0, ObjectSchema.UNLIMITED);

	    // adding name mappings

	    // adding inheritance
	    countrySchema.addSuperSchema(locationSchema);
	    regionSchema.addSuperSchema(locationSchema);
	    continentSchema.addSuperSchema(locationSchema);
    }
    catch(OntologyException oe) {
      oe.printStackTrace();
    }
  } 
}

