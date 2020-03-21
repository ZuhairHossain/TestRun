package N;
public class WRM {
    Patient cir[];
    int start;
    int size;
    int id;

    public WRM()
    {
        cir= new Patient[10];
        start=0;
        id=0;
    }
    public void registerPatient(Patient p)throws QueueOverflowException {
        if(size==cir.length)
        {
            throw new QueueOverflowException();
        }
        id++;
        p.id=id;
        cir[(start+size)%cir.length]=p;
        size++;
    }

    public Object servePatient() throws QueueUnderflowException
    {
        if(size==0)
        {
            throw new QueueUnderflowException();
        }
        Object s= cir[start];
        cir[start]=null;
        start=(start+1)%cir.length;
        size--;
        return s;
    }

    public boolean canDoctorGoHome()
    {
        if(size==0)
        {
            return true;
        }
        return false;
    }
    public void cancelAll()
    {

                size=0;
    }
    public void showAllPatient()
    {
        System.out.println("Show All");
        if(size==0)
        {
            System.out.println("No Patient to Show");
        }
        Patient a[] = new Patient[size];
        for(int i=0; i<size; i++)
        {
            a[i]=cir[(start+i)%cir.length];
        }
        for(int i=0; i<size-1; i++)
        {
            for(int j=0; j<size-i-1; j++)
            {
                if(a[j].name.compareTo(a[j+1].name)>0)
                {
                    Patient tmp= a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;
                }
            }
        }
        for(int i=0; i<a.length; i++)
        {
            System.out.println("ID: " + a[i].id +"\nName: " + a[i].name +"\n");
        }
    }
}
