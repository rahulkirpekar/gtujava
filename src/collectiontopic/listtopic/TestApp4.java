package collectiontopic.listtopic;

import java.util.LinkedList;
import java.util.Scanner;

public class TestApp4 {
	public static void main(String[] args) {
		LinkedList<Student> list = new LinkedList<Student>();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		while (choice != 6) {
			System.out.println("Enter below choice : ");
			System.out.println("1) For Insert Student");
			System.out.println("2) For Update Student");
			System.out.println("3) For Delete Student");
			System.out.println("4) For Searching by Rno");
			System.out.println("5) For Display All Students");
			choice = sc.nextInt();
			Student s = null;
			boolean flag = false;
			switch (choice) {
			case 1:
				s = new Student();
				s.scan();
				list.add(s);
				System.out.println("Student record insert successfully in list object.");
				break;
			case 2:
				System.out.println("Enter rno where you want to update student Data : ");
				int updateRno = sc.nextInt();
				int i;
				for (i = 0; i < list.size(); i++) {
					s = list.get(i);
					if (s.getRno() == updateRno) {
						flag = true;
						break;
					}
				}
				if (flag) {
					s.update();
					list.set(i, s);
					System.out.println("Student record suucessfully Updated at give rno");
				} else {
					System.out.println("Given Student rno not found");
				}
				break;
			case 3: System.out.println("Enter Rno which you want to delete : ");
			        int deleteRno = sc.nextInt();
			        for (i = 0; i < list.size(); i++) {
						s = list.get(i);
						if (s.getRno() == deleteRno) 
						{
							flag = true;
							break;
						}
					}
					if (flag) 
					{
						list.remove(i);
						System.out.println("Student record suucessfully removed");
					} else 
					{
						System.out.println("Given Student rno not found");
					}
				break;
			case 4:
					System.out.println("Enter Rno which you want to search : ");
					int searchRno = sc.nextInt();
					Student s3 = null;
					for(i=0;i<list.size();i++) 
					{
						s3 = list.get(i);
						if(s3.getRno()==searchRno) 
						{
							flag= true;
							break;
						}
					}
					if(flag) 
					{
						s3.disp();
					}else 
					{
						System.out.println("Given Rno not found in Student record");
					}
				break;
			case 5:
				for (i = 0; i < list.size(); i++) {
					Student s2 = list.get(i);
					s2.disp();
				}
				break;
			case 6:
				System.out.println("System will be shutdown");
				System.exit(0);
			}

		}

	}
}
