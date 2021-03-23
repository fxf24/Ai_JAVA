package template;

import java.util.ArrayList;

public class ViewProcess {
	void process() {
		Controller c = Controller.getInstance();
		ArrayList<EmployeeVO> eDB = c.getAll();
		for(EmployeeVO e : eDB) {
			System.out.println(e);
		}
	}
}
