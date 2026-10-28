package labweek_6;

import java.util.ArrayList;
public class LabWeek_6 {

    
    public static void main(String[] args) {
        
        ArrayList<Ride> rides = new ArrayList<>();

        rides.add(new Ride("Ahmet Yılmaz", "Kadıköy", "Beşiktaş", 12.5, 30, 20.0));
        rides.add(new EconomyRide("Aye Demir", "Kızılay", "Çankaya", 6.0, 15, 18.0, 2.5));
        rides.add(new PremiumRide("Mehmet Öz", "Havalimanı", "Levent", 35.0, 45, 30.0, 150.0, 1.5));
        rides.add(new SharedRide("Selin Kara", "Bornova", "Alsancak", 10.0, 25, 18.0, 2.0, 3));

        System.out.println("================= RIDE DETAILS & FARES =================");
        
        
        for (Ride r : rides) {
            System.out.println(r); 
            System.out.printf("Total Calculated Fare: %.2f TL\n", r.calculateFare());
            System.out.println("--------------------------------------------------------");
        }
        
    }
    
}
