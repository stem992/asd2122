package graph;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class GraphTestRunner{

	  // @param args the command line arguments
	  
	  public static void main(String[] args) {
	    Result result = JUnitCore.runClasses(GraphDirectTest.class);
	    for (Failure failure : result.getFailures()) {
	      System.out.println(failure.toString());
	    }
	  
	    if(result.wasSuccessful()){
	    	System.out.println("== ALL TESTS PASSED ==\n");
	        }
	  }
	  
}