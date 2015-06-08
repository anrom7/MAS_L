package educationontology.ontology.impl;


import jade.util.leap.ArrayList;
import jade.util.leap.Iterator;
import jade.util.leap.List;
import educationontology.ontology.Continent;

/**
* Protege name: http://mccarthy.dia.fi.upm.es/Geography_Ontology#Continent
* @author OntologyBeanGenerator v4.1
* @version 2015/06/8, 23:11:56
*/
public class DefaultContinent implements Continent {

  private static final long serialVersionUID = -1974204183884102668L;

  private String _name = null;

  public DefaultContinent() {
    this.setName("");
  }

  public DefaultContinent(String name) {
    this.setName(name);
  }

  public String getName() {
		return _name;
	}

	public void setName(String name) {
		this._name = name;
	}
  
	@Override
  public String toString() {
    return getName();
  }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Geography_Ontology#has_country_Country
   */
   private List has_country_Country = new ArrayList();
  
   public void clearAllHas_country_Country() {
     has_country_Country.clear();
   }
   public Iterator getAllHas_country_Country() {return has_country_Country.iterator(); }
   public List getHas_country_Country() {return has_country_Country; }
   public void setHas_country_Country(List l) {has_country_Country = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Geography_Ontology#is_associated_with_Vacancy
   */
   private List is_associated_with_Vacancy = new ArrayList();
   public void clearAllIs_associated_with_Vacancy() {
     is_associated_with_Vacancy.clear();
   }
   public Iterator getAllIs_associated_with_Vacancy() {return is_associated_with_Vacancy.iterator(); }
   public List getIs_associated_with_Vacancy() {return is_associated_with_Vacancy; }
   public void setIs_associated_with_Vacancy(List l) {is_associated_with_Vacancy = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Geography_Ontology#is_location_of_Organization
   */
   private List is_location_of_Organization = new ArrayList();
   public void clearAllIs_location_of_Organization() {
     is_location_of_Organization.clear();
   }
   public Iterator getAllIs_location_of_Organization() {return is_location_of_Organization.iterator(); }
   public List getIs_location_of_Organization() {return is_location_of_Organization; }
   public void setIs_location_of_Organization(List l) {is_location_of_Organization = l; }

}
