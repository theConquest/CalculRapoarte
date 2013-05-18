package ro.marius.rapoarte.util;

import javax.swing.*;

public class TestForNull {
	public static void testForNull(String myH, String p1, String p2){
		
		if(myH.equals("")){
			String s1 = "Introduceti intervalul orar!"; 
            JOptionPane.showMessageDialog(null, s1);
		}
		if(p1.equals("")&&p2.equals("")){
			String s2 = "Introduceti cel putin un raport!";
			JOptionPane.showMessageDialog(null,  s2);
		}
	}

}
