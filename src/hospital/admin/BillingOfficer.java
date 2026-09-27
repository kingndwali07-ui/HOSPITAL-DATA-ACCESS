package hospital.admin;

import hospital.model.Patient;

public class BillingOfficer extends Patient {   // subclass can reach 'protected' members

    public BillingOfficer(String id, String name, java.time.LocalDate d) {
        super(id, name, d);
    }

    public void reviewBill() {
        // Allowed: protected member inherited from Patient (same subclass chain).
        System.out.println("  [ADMIN] Outstanding bill for "
                + getFullName() + ": $" + getOutstandingBill());
    }
}