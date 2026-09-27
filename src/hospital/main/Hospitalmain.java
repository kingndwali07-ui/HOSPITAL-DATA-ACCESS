package hospital.main;

import hospital.model.Patient;
import hospital.staff.Doctor;
import hospital.staff.Receptionist;
import hospital.admin.BillingOfficer;
import hospital.admin.FinancialRecord;
import java.time.LocalDate;

public class Hospitalmain {

    public static void main(String[] args) {

        Patient p = new Patient("P-1001", "Alice Mwangi", LocalDate.of(2025, 6, 15));

        Doctor dr = new Doctor("D-77", "Dr. Otieno");
        Receptionist rec = new Receptionist("Mary");
        BillingOfficer bill = new BillingOfficer("B-01", "Alice Mwangi", LocalDate.of(2025, 6, 15));

        System.out.println("=== Receptionist View (basic only) ===");
        rec.viewBasicDetails(p);

        System.out.println("\n=== Doctor View & Update ===");
        dr.updateMedicalRecord(p, "Malaria", "Artemether-Lumefantrine");
        dr.viewMedicalRecord(p);

        System.out.println("\n=== Admin / Billing View (financial) ===");
        bill.reviewBill();

        FinancialRecord fr = new FinancialRecord("F-55", 250.00, "Consultation fee");
        System.out.println("  [ADMIN] Summary: " + fr.getSummary());
        // fr.printRecord();  // not callable from hospital.main → package-private
    }
}