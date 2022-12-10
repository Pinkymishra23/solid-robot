import java.util.*;
class main{
	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(36);
		l1.add(56);
		l1.add(72);
		l1.add(38);
		l1.add(1,88);//add 88 at 1st index
		System.out.println("Marks of students = "+l1);
		l1.remove(0);//removes value at the 0th index
		System.out.println("IS no. entered is in the list or not = "+l1.contains(38));//check whether value is in the list or not
		ArrayList<Integer> l2=new ArrayList<>();
		l2.add(34);
		l2.add(38);
		l1.addAll(l2);
		System.out.println(l1);
		System.out.println("First index of 38= "+l1.indexOf(38)); 
		System.out.println("First index of 38= "+l1.lastIndexOf(38)); 
	}
}