package Utility;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;

public class Utility {
	
	public static void main(String[] args) throws FilloException {
		
	Fillo fillo =new Fillo();
	Connection connection=fillo.getConnection("C:/Users/himanshu.dixit/Desktop/TestData.xlsx");
	
		
	}//end of main method
	

}//end of class Utility
