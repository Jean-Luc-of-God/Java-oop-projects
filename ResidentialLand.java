

import java.util.Date;
public class ResidentialLand extends Land {
    private int numberOfResidentialUnits;

    public ResidentialLand(String landId, String ownerName, String location, double sizeInAcres, Date registrationDate, String landUseStatus, int numberOfResidentialUnits) {
        super(landId, ownerName, location, sizeInAcres, registrationDate, landUseStatus);
        this.numberOfResidentialUnits = numberOfResidentialUnits;
    }

    @Override
    public boolean validateOwnership() {
        return ownerName != null && !ownerName.trim().isEmpty();
    }

    @Override
    public boolean checkZoningCompliance() {
        return numberOfResidentialUnits <= (2 * sizeInAcres);
    }

    @Override
    public double calculateTax() {
        return sizeInAcres * 8000 * 0.015;
    }

    @Override
    public void generateLandReport() {
        System.out.println("------ Residential Land Report ------");
        System.out.println("Land ID: " + landId);
        System.out.println("Owner: " + ownerName);
        System.out.println("Location: " + location);
        System.out.println("Size (acres): " + sizeInAcres);
        System.out.println("Units: " + numberOfResidentialUnits);
        System.out.println("Land Use Status: " + landUseStatus);
        System.out.println("Tax: $" + calculateTax());
        System.out.println("Ownership Valid: " + validateOwnership());
        System.out.println("Zoning Compliant: " + checkZoningCompliance());
        System.out.println("--------------------------------------");
    }
}
