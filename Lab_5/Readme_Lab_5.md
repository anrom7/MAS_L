1). Створив проект і додав класи.
2). Оновив: клас "BrokerAgent"
Були додана функція checkOffer які випадково повертають TRUE або FALSE,
Якщо TRUE тоді брокер прийме заявку і відправляє її дальше на перевірку.
В іншому випадку, посилає повідомлення Reject, що перериває ланцюг повідомлення.


Зміни в коді:
ACLMessage agree = request.createReply ();
if (checkOffer ())
{
System.out.println ("Agent" + getLocalName () + ": REQUEST received from" + request.getSender (). GetName () + ". Action is" + request.getContent ());
agree.setPerformative (ACLMessage.AGREE);
}
else
{
System.out.println ("Agent" + getLocalName () + ": REQUEST received from" + request.getSender (). GetName () + ". Action is REJECTED. OFFER IS TOO BAD !!");
agree.setPerformative (ACLMessage.REJECT_PROPOSAL);
}