import java.util.LinkedList;

public class bayGraph{







	public void main(String[] args) {
	//MAKING THE NODES	
	bayNode C= new bayNode("C");
	C.pd.list.add(new CPT(new stateVal(0.5,"T"), new String[] {"root"}));
	
	bayNode S= new bayNode("S");
	S.pd.list.add(new CPT(new stateVal( 0.1  ," T"), new String[] {"c"}));
	S.pd.list.add(new CPT(new stateVal( 0.5 ," T"), new String[] {"-c"}));
	
	bayNode R= new bayNode("R");
	R.pd.list.add(new CPT(new stateVal( 0.8 ," T"), new String[] {"c"} ));
	R.pd.list.add(new CPT(new stateVal( 0.2 ," T"), new String[] {"-c"} ));
	
	bayNode W= new bayNode("W");
	W.pd.list.add(new CPT(new stateVal( 0.99  ," T"), new String[] {"s", "r"}));
	W.pd.list.add(new CPT(new stateVal( 0.90  ," T"), new String[] {"s", "-r"}));
	W.pd.list.add(new CPT(new stateVal( 0.90  ," T"), new String[] {"-s", "r"}));
	W.pd.list.add(new CPT(new stateVal( 0.00  ," T"), new String[] {"-s", "-r"}));
	
	/*bayNode R= new bayNode("R");
	D.pd.list.add(new CPT(0.5, new String[] {"c"}));
	
	
	//LINKING THE NODES
	A.children.add(B);
	A.children.add(C);
	B.children.add(D);
	C.children.add(D);
	
	//NEXT INFERENCE TIME
	
	
	//Enumerate(X,evidence,);
	
	
	/** assign children at last **/
	
	
	/*a.pd= new PD( 0.63 , new String[] {"root"} ) ;
	
	bayNode b= new bayNode("B");
	b.pd= new PD(0.4, )
	root.children= new LinkedList<bayNode>
		
		
		*/
		
		
	}
	
	
	
	/*function ENUMERATION-ASK(X , e, bn) returns a distribution over X inputs: X , the query variable
	e, observed values for variables E
	bn, a Bayes net with variables {X} ∪ E ∪ Y = hidden variables 
	Q(X ) ← a distribution over X , initially empty for each value xi of X do
	Q(xi) ← ENUMERATE-ALL(bn.VARS, exi ) where exi is e extended with X = xi
	return NORMALIZE(Q(X))
			
			
			
	function ENUMERATE-ALL(vars, e) returns a real number if EMPTY?(vars) then return 1.0
	Y ← FIRST(vars)
	ifY hasvaluey ine
	 then return P (y | parents(Y )) × ENUMERATE-ALL(REST(vars), e) elsereturn􏰁 P(y|parents(Y)) × ENUMERATE-ALL(REST(vars),ey)
	y
	where ey is e extended with Y = y
	
	*/
	
	
	
	public void enumerate(bayNode X ,LinkedList<String> evidenceVar) {
		
		double xProb= 0.00;
		evidenceVar.add(X.randomVar);
		LinkedList<String> hiddenVar= new LinkedList<String>();
		
		xProb= enumerateAll(hiddenVar , evidenceVar);
		
	}
	
}
