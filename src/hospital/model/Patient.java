package hospital.model;

import java.time.LocalDate;

public class Patient {
    // PRIVATE: Sensitive medical data — only this class can touch it directly.
    // Doctors must go through controlled methods (encapsulation).

    private String patientId;
    private String fullName;
    private LocalDate appointmentDate;
    private String diagnosis;          // sensitive
    private String prescription;       // sensitive
    private double outstandingBill;    // sensitive (financial)

    public Patient(String patientId, String fullName, LocalDate appointmentDate) {
        this.patientId = patientId;
        this.fullName = fullName;
        this.appointmentDate = appointmentDate;
    }

}
