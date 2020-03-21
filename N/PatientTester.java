package N;
public class PatientTester
{
    public static void main(String[] args)
    {
        try
        {
            Patient p1= new Patient("Eleven", 16 , "O +ve");
            Patient p2= new Patient("Mike" , 17 , "A +ve");
            Patient p3= new Patient("Will" , 15, "AB -ve");
            Patient p4= new Patient("Dustin" , 17, "B +ve");
            Patient p5= new Patient("Lucas" , 19, "A -ve");
            WRM wrm =new WRM();
            wrm.registerPatient(p1);
            wrm.registerPatient(p2);
            wrm.registerPatient(p3);
            wrm.registerPatient(p4);
            wrm.registerPatient(p5);
            System.out.println(wrm.servePatient());
            System.out.println(wrm.servePatient());
            System.out.println(wrm.servePatient());
            System.out.println(wrm.servePatient());
            wrm.cancelAll();
            wrm.showAllPatient();
            System.out.println(wrm.canDoctorGoHome());
            Patient p6= new Patient("Eleven", 16 , "O +ve");
            Patient p7= new Patient("Mike" , 17 , "A +ve");
            Patient p8= new Patient("Will" , 15, "AB -ve");
            Patient p9= new Patient("Dustin" , 17, "B +ve");
            Patient p10= new Patient("Lucas" , 19, "A -ve");
            Patient p11= new Patient("Max", 19 , "O +ve");
            Patient p12= new Patient("Hopper" , 39 , "A +ve");
            Patient p13= new Patient("Jonathan" , 22, "AB -ve");
            wrm.registerPatient(p6);
            wrm.registerPatient(p7);
            wrm.registerPatient(p8);
            wrm.registerPatient(p9);
            wrm.registerPatient(p10);
            wrm.registerPatient(p11);
            wrm.registerPatient(p12);
            wrm.registerPatient(p13);
            wrm.showAllPatient();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
            