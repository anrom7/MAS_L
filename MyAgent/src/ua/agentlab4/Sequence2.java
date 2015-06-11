package ua.agentlab4;

import jade.core.Agent;
import jade.core.behaviours.*;

//��������: ���������� ����������� ���� 300 �� � �����������,  ���������� 
//��� ����������� � �������� ���
//���������� 0.25 ��
//���� ������� �����������
//���������� 0.25 ��
//���� ������� �����������


public class Sequence2 extends Agent 
{
	long t0 ;
	long time() { return System.currentTimeMillis()-t0; }
	
	protected void setup() 
	{
		SequentialBehaviour seq = new SequentialBehaviour();
		seq.addSubBehaviour( new DelayBehaviour( this, 250 ) );
		seq.addSubBehaviour( new OneShotBehaviour(this) 
			{
				public void action() {
					System.out.println( time() + ": " + "... Message1");
				}
			});
		
		seq.addSubBehaviour( new DelayBehaviour( this, 500 )
			{
				protected void handleElapsedTimeout() {
					System.out.println( time() + ": " + "  ...and then Message 2");
					
					myAgent.doDelete();
					System.exit(1);
				}
			});
		addBehaviour( seq );
		
		addBehaviour( new TickerBehaviour( this, 300 )
			{
				protected void onTick() {
					System.out.println( System.currentTimeMillis()-t0 +
						": " + myAgent.getLocalName());
				}
			}) ;
			
		t0 = System.currentTimeMillis();
	}
}