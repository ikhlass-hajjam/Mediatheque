package mediatheque;

public class CDPrinter implements ItemVisitor {
    
    public CDPrinter() {
	}

	public void visit(Book item) {
		
      
		
	}

    public void visit(CD item) {
		System.out.println(item.toString());
		
	}


}