public class TrainerApp {

	public static void main(String[] args) {
	Trainer t1= new Trainer();
	t1.id=1234;
	t1.name="siri";
	t1.subject="java";
	System.out.println(" ID=" +t1.id+ " name= "+ t1.name+ " subject = " + t1.subject);
	Trainer t2= new Trainer();
	t2.givendate(123 , "siri", "english");
	System.out.println(" ID=" +t2.id+ " name= "+ t2.name+ " subject = " + t2.subject);
	t2.teach();
	t2.takeattendance();
	Trainer t3= new Trainer(123);
	System.out.println(" ID=" +t3.id+ " name= "+ t3.name+ " subject = " + t3.subject);
	t3.teach();
	t3.takeattendance();
	Trainer t4= new Trainer(123,"prathu");
	System.out.println(" ID=" +t4.id+ " name= "+ t4.name+ " subject = " + t4.subject);
	t4.teach();
	t4.takeattendance();
	Trainer t5= new Trainer(123, "prathu","social");
	System.out.println(" ID=" +t5.id+ " name= "+ t5.name+ " subject = " + t5.subject);
	t5.teach();
	t5.takeattendance();
	}
}




