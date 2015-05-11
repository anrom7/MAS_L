1. Створила проект, додала класи.
2. Модифікація: клас "BrokerAgent"
Було додано функцію checkOffer яка в випадковому порядку повертає True або False, 
якщо повернути True - тоді брокер приймає заявку та передає далі на оброблення. 
Інакше відсилає повідомлення Reject, яке перериває ланцюг повідомлень.

Змінений код:
ACLMessage agree = request.createReply();
if (checkOffer())
{
System.out.println("Agent "+getLocalName()+": REQUEST received from "+request.getSender().getName()+". Action is "+request.getContent());
agree.setPerformative(ACLMessage.AGREE);
}
else
{
System.out.println("Agent "+getLocalName()+": REQUEST received from "+request.getSender().getName()+". Action is REJECTED. OFFER IS TOO BAD!!");
agree.setPerformative(ACLMessage.REJECT_PROPOSAL);
}
