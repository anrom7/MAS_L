package ua.agentlab;

import jade.content.AgentAction;   

public class Sell implements AgentAction {   
    /**
	 * 
	 */
	private static final long serialVersionUID = -5212569781113987412L;
	private Book item;   
   
    public Book getItem() {   
        return item;   
    }   
   
    public void setItem(Book item) {   
        this.item = item;   
    }   
}   