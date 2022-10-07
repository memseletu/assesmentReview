package solution;

public class CrewMember extends Person implements  ServAble,Payable {
    private FlightCrewJob job;
    private float salary;

    public CrewMember(String name, FlightCrewJob job, float salary) {
        super(name);
        this.job = job;
        this.salary = salary;
    }

    public FlightCrewJob getJob() {
        return job;
    }

    public void setJob(FlightCrewJob job) {
        this.job = job;
    }

    @Override
    public void printPaymentAmt() {
        System.out.println(this.salary);
    }

    @Override
    public void serve(Person person) {
        System.out.println("Now serving: " + person.getName());
    }

}
