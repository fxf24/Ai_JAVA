package template;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeDAO {
	void insert(EmployeeVO vo) {
		try {
			FileWriter fo = new FileWriter("employee.txt", true);
			fo.write(vo.toString() + "\n");
			fo.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	ArrayList<EmployeeVO> getAll(){
		ArrayList<EmployeeVO> eDB = new ArrayList<>();
		try {
			FileReader fi = new FileReader("employee.txt");
			Scanner sc = new Scanner(fi);
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				String items[] = line.split("\\|");
				int id = Integer.parseInt(items[0]);
				String name = items[1];
				double salary = Double.parseDouble(items[2]);
				eDB.add(new EmployeeVO(id, name, salary));
			}
			fi.close();
			sc.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return eDB;
	}
}
