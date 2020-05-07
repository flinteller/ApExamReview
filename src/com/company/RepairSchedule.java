//  U2255656
//  F.E

package com.company;

import java.util.ArrayList;

public class RepairSchedule
{
    /** Each element represents a repair by an individual mechanic
     in a bay. */
    private ArrayList<CarRepair> schedule;

    /** Number of mechanics available in this schedule. */
    private int numberOfMechanics;


/** Constructs a RepairSchedule object.
 *  Precondition: n >= 0
 */
    public RepairSchedule(int n) {
        schedule = new ArrayList<CarRepair>();
        numberOfMechanics = n;
    }


/** Attempts to schedule a repair by a given mechanic in a
  * given bay as described in part (a).
  * Precondition: 0 <= m < numberOfMechanics and b >= 0
  */
    public boolean addRepair(int m, int b) {
        /* to be implemented in part (a) */
        boolean ready = true;
        for(int a = 0; a < schedule.size(); a++){
            if(schedule.get(a).getBayNum() == b || schedule.get(a).getMechanicNum() == m){
                ready = false;
                break;
            }
        }
        if(ready){
            schedule.add(new CarRepair(m, b));
        }

        return ready;
    }


 /** Returns an ArrayList containing the mechanic identifiers of
  * all available mechanics,
  * as described in part (b).
  */
 //  U2255656
 //  F.E
 public ArrayList<Integer> availableMechanics() {
     /* to be implemented in part (b) */
     ArrayList<Integer>list = new ArrayList<Integer>();
     for(int z = 0; z < numberOfMechanics; z++){
         list.add(z);
     }

     for(int a = 0; a < schedule.size(); a++){
         list.remove(schedule.get(a).getMechanicNum());

     }
     return list;
 }


 /** Removes an element from schedule when a repair is complete
  * Only to be used by the driver
  */
    public void carOut(int b) {
        for (int i=schedule.size()-1; i>=0; i--) {
            if (schedule.get(i).getBayNum() == b) {
                schedule.remove(i);
            }
        }
    }
    
}

