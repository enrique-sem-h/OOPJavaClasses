package Inheritance;

import Inheritance.*;

public class CompanySystem {
public static void main(String[] args) {
	Engineer e1 = new Engineer("Enrique", 123123123, 1212341234, "aa22", 13245.0, "escola1");
	Engineer e2 = new Engineer("Enrique2", 111111111, 1231222123, "aa12", 13245.0, "farmacia1");
	Manager m1 = new Manager("EnriqueManager", 12341234, 1112223334, 20000.0, 4);
	Director d1 = new Director("Enrique again", 1234123, 999999, 30000.0, 3);
	
	System.out.println(e1);
	System.out.println(e2);
	System.out.println(m1);
	System.out.println(d1);
}
}
