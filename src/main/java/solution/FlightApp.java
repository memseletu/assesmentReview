package solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class FlightApp {
    public static void printEachFlightCrewJob(ArrayList<FlightCrewJob> flightCrewJobs){
        for (FlightCrewJob job :flightCrewJobs) {
            System.out.println(job);

        }
    }


    public static void printAmtForEachThingThatIsPayable(Payable[] payablePeople){
        for(int x = 0; x<payablePeople.length; x++){
            payablePeople[x].printPaymentAmt();
        }

    }

    public static void sortAndPrintCrewMembersByJobTitle(ArrayList<FlightCrewJob> flightCrewJobs){
        //sort the list
        Collections.sort(flightCrewJobs,new SortByJobCompareTo());
        //loop through the list
        for (FlightCrewJob job :flightCrewJobs) {
            System.out.println(job);

        }

    }

    public static void printAllJobsExceptThisCrewMemberJob(ArrayList<FlightCrewJob> flightCrewJobs, CrewMember crewMember){
        Iterator<FlightCrewJob> flightCrewJobIterator = flightCrewJobs.iterator();
        while(flightCrewJobIterator.hasNext() ){
          FlightCrewJob result = flightCrewJobIterator.next();
          if(result!= crewMember.getJob()){
              System.out.println(result);

          }
        }

    }
}
