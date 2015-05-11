package ua.agentlab;

import jade.content.Predicate;   
  
   
public class Costs implements Predicate{   
    /**
	 * 
	 */
	private static final long serialVersionUID = 5263501039333055376L;
	private Book item;   
    private float price;   
       
    public Book getItem() {   
        return item;   
    }   
       
    public void setItem(Book item) {   
        this.item = item;   
    }   
       
    public float getPrice() {   
        return price;   
    }   
       
    public void setPrice(float price) {   
        this.price = price;   
    }   
}   
