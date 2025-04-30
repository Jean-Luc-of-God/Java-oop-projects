

import java.util.Date;

public class AgriculturalLand extends Land {

    public AgriculturalLand(String landId, String ownerName, String location, double sizeInAcres, Date registrationDate, String landUseStatus) {
        super(landId, ownerName, location, sizeInAcres, registrationDate, landUseStatus);
    }

    public AgriculturalLand(String ag101, String johnLuc, String greenValley, double sizeInAcres, Date today, String inUse, String farmingZone) {
        super();
    }

    @Override
    public boolean validateOwnership() {
        return ownerName != null && !ownerName.trim().isEmpty();
    }

    @Override
    public boolean checkZoningCompliance() {
        return sizeInAcres >= 1;
    }

    @Override
    public double calculateTax() {
        return sizeInAcres * 5000 * 0.01;
    }

    @Override
    public void generateLandReport() {
        System.out.println("------ Agricultural Land Report ------");
        System.out.println("Land ID: " + landId);
        System.out.println("Owner: " + ownerName);
        System.out.println("Location: " + location);
        System.out.println("Size (acres): " + sizeInAcres);
        System.out.println("Land Use Status: " + landUseStatus);
        System.out.println("Tax: $" + calculateTax());
        System.out.println("Ownership Valid: " + validateOwnership());
        System.out.println("Zoning Compliant: " + checkZoningCompliance());
        System.out.println("--------------------------------------");
    }
}
