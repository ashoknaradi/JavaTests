
public class College {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setsId(22);
		s1.setName("yes");
		s1.setcName("vvit");
		s1.setPassword("yes@");
		System.out.println("getName===" + s1.getName() + "======getcName===" + s1.getcName() + "========getPassword===" + s1.getPassword());
		
		Student s2 = new Student();
		s2.setsId(23);
		s2.setName("yo");
		s2.setcName("yoyo");
		s2.setPassword("yo@");
		System.out.println("getName====" + s2.getName() + "=========getcName====" + s2.getcName() + "=========getPassword====" + s2.getPassword());
	}
}
