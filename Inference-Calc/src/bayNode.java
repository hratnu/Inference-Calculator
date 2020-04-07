import java.util.LinkedList;

public class bayNode {
	String randomVar;
//	D domain;
	PD pd;
	LinkedList<bayNode> children;

	public bayNode(String randomVar, PD pd,LinkedList<bayNode> children) {
		super();
		this.randomVar = randomVar;
	//	this.domain = domain;
		this.pd = pd;
		this.children= children;
	}
	
	
	public bayNode(String randomVar) {
		this.randomVar=randomVar;
		pd= new PD();
	}

}
