package hospital.admin;

import hospital.model.Patient;

public class FinancialRecord {

    // PRIVATE: Financial records are the most sensitive data in the system.
    private String recordId;
    private double amount;
    private String description;

    public FinancialRecord(String recordId, double amount, String description) {
        this.recordId = recordId;
        this.amount = amount;
        this.description = description;
    }

    // PACKAGE-PRIVATE: Only classes inside hospital.admin can print a record.
    void printRecord() {
        System.out.println("  [ADMIN] " + recordId + " | " + description + " | $" + amount);
    }

    // PUBLIC: A safe summary that hides the raw ID.
    public String getSummary() {
        return description + " ($" + amount + ")";
    }
}
