import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date today = new Date();


        AgriculturalLand agriLand = new AgriculturalLand(
                "AG101", "Divya Akacu", "Green Valley", 5.0, today, "In Use", "Farming Zone"
        );


        ResidentialLand resLand = new ResidentialLand(
                "RS201", "Dushime Uwacu Erica Nava", "Sunrise Estate", 2.0, today, "Vacant", 3
        );


        CommercialLand comLand = new CommercialLand(
                "CM301", "Inyange Ltd.", "Business Bay", 3.5, today, "Under Development", true
        );


        IndustrialLand indLand = new IndustrialLand(
                "IN401", "Tech Industries", "Industrial Park", 10.0, today, "In Use", true
        );

        // Print reports
        agriLand.generateLandReport();
        resLand.generateLandReport();
        comLand.generateLandReport();
        indLand.generateLandReport();
    }
}
