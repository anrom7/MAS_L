package ua.agentlab4;

import jade.core.Agent;
import jade.core.behaviours.SimpleBehaviour;

//Завдання: друкування повідомлення кожні 300 мс з послідовністю, де ми виводимо 
//два повідомлення у вказаний час
//поведінка WakerBehaviour не дуже добра в використанні тому що затримка обчислюється
// від моменту створення поведінки а не від моменту виконання її
//тому і була створена поведінка DelayBehaviour
// DelayBehaviour обчислює час пробудження в методі onStart()
//кожного разу коли поведінка активується ми обчислюємо час що залишився до пробудження
//якщо час відємний викликається handleElapsedTimeout, в іншому випадку блокується на час що залишився

public class DelayBehaviour extends SimpleBehaviour 
{
   private long    timeout, 
                   wakeupTime;
   private boolean finished = false;
   
   public DelayBehaviour(Agent a, long timeout) {
      super(a);
      this.timeout = timeout;
   }
   
   public void onStart() {
      wakeupTime = System.currentTimeMillis() + timeout;
   }
      
   public void action() 
   {
      long dt = wakeupTime - System.currentTimeMillis();
      if (dt <= 0) {
         finished = true;
         handleElapsedTimeout();
      } else 
         block(dt);
         
   } 
   
   protected void handleElapsedTimeout() 
      { } 
            
   public boolean done() { return finished; }
}