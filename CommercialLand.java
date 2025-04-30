

import java.util.Date;

public class CommercialLand extends Land {
    private boolean inCommercialZone;

    public CommercialLand(String landId, String ownerName, String location, double sizeInAcres, Date registrationDate, String landUseStatus, boolean inCommercialZone) {
        super(landId, ownerName, location, sizeInAcres, registrationDate, landUseStatus);
        this.inCommercialZone = inCommercialZone;
    }

    @Override
    public boolean validateOwnership() {
        return ownerName != null && !ownerName.trim().isEmpty();
    }

    @Override
    public boolean checkZoningCompliance() {
        return inCommercialZone;
    }

    @Override
    public double calculateTax() {
        return sizeInAcres * 10000 * 0.025;
    }

    @Override
    public void generateLandReport() {
        System.out.println("------ Commercial Land Report ------");
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
