 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package employee_management;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Student
 */
/*

*/


public class Employee_Management {
        public static List<User> users=new ArrayList<User>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        User ob1=new User();
        User ob2=new User();
        ob1.setAccess(1);
        ob1.setDept("IT");
        ob1.setName("Narayan");
        ob1.setPhone("12345678");
        ob1.setDesignation("II");
        ob1.setEmpno("1");
        ob1.setPassword("narayan");
        
        ob2.setAccess(2);
        ob2.setDept("EEE");
        ob2.setName("Divyansh");
        ob2.setPhone("9878987654");
        ob2.setDesignation("Founder");
        ob2.setEmpno("2");
        ob2.setPassword("admin");
        
        users.add(ob1);
        users.add(ob2);
       new Landing().setVisible(true);
    }
    
}
