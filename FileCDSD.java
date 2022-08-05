package Project_Phase_one;
import java.io.*;
import java.util.*;
public class FileCDSD {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		String path="D:\\Project_phase_one\\";
		while(true) {
			System.out.println("1. Display Files in Ascending Order ");
			System.out.println("2. Add,Delete,Search,Main Menu ");
			System.out.println("3. Exit");
			System.out.println("\n Enter the option :>");
			char t=sc.next().charAt(0);
			switch(t) {
			case '1' :
				File f=new File(path);
				File filenames[]=f.listFiles();
				for(File ff:filenames) {
					System.out.println(ff.getName());
				}
				break;
			case '2' :
				boolean loop=true;
				while(loop) {
				
					System.out.println("1. Add file");
					System.out.println("2. Search file");
					System.out.println("3. Delete file");
					System.out.println("4. Main Menu");
					System.out.println("\nEnter option :>");
					char w=sc.next().charAt(0);
					switch(w) {
					case '1':
						System.out.println("enter the filename");
						String filename=sc.next();
						String finalpath=path+filename;
						File f1=new File(finalpath);
						boolean b=f1.createNewFile();
						if(b!=true) {
							System.out.println("file not created");
						}
						else {
							System.out.println("file created");
						}
						break;
					case '2':
						System.out.println("enter the filename to search");
						String filename1=sc.next();
						File f2=new File(path);
						//display operation
						int flag=0;
						File filenames1[]=f2.listFiles();
						for(File ff:filenames1) {
							if(ff.getName().equals(filename1)) {
								flag=1;
								break;
							}
							else {
								flag=0;
							}
						
						}
						if(flag==1) {
							System.out.println("file is found");
						}
						else {
							System.out.println("file is not found");
						}
						break;
					case '3':
						System.out.println("enter the filename");
						String filename2=sc.next();
						String finalpath2=path+filename2;
						File f3=new File(finalpath2);
						//delete operation
						f3.delete();
						System.out.println("file gets deleted");
						break;
					case '4':
						loop=false;
						break;
						default:System.out.println("Wrong Option\n");
						break;
					}
				}break;
			case '3':
				System.exit(0);
				break;
			default:System.out.println("Wrong option\n");
			break;
		}

}
	}
}
