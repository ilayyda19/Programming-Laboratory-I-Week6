/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labweek_6;

/**
 *
 * @author ilayda
 */
public class PremiumRide extends Ride{
    
    private double comfortFee;
    private double surgeMultiplier;

    public PremiumRide(String passengerName, String pickup, String destination, 
                       double distanceKm, int durationMin, double pricePerKm, 
                       double comfortFee, double surgeMultiplier) {
        super(passengerName, pickup, destination, distanceKm, durationMin, pricePerKm);
        
        this.comfortFee = comfortFee;

        if (surgeMultiplier < 1.0 || surgeMultiplier > 3.0) {
            System.out.println("Warning: surgeMultiplier must be between 1.0 and 3.0. Set to 1.0.");
            this.surgeMultiplier = 1.0;
        } else {
            this.surgeMultiplier = surgeMultiplier;
        }
    }

    @Override
    public double calculateFare() {
        
        return (super.calculateFare() + comfortFee) * surgeMultiplier;
    }

    @Override
    public String toString() {
        return super.toString() + 
               " | Comfort Fee: " + comfortFee + " TL" + 
               " | Surge: x" + surgeMultiplier + " (Premium)";
    }
    
}
