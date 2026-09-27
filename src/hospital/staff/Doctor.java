package hospital.staff;

import hospital.model.Patient;

public class Doctor {

    private final String doctorId;
    private final String name;

    public Doctor(String doctorId, String name) {
        this.doctorId = doctorId;
        this.name = name;
    }

    // Doctor CAN read & update full medical data.
    public void updateMedicalRecord(Patient p, String diagnosis, String prescription) {
        p.setDiagnosis(diagnosis);
        p.setPrescription(prescription);
        System.out.println("  [DOCTOR " + name + "] Updated record for " + p.getFullName());
    }

    public void viewMedicalRecord(Patient p) {
        System.out.println("  [DOCTOR " + name + "] Patient: " + p.getFullName()
                + " | Diagnosis: " + p.getDiagnosis()
                + " | Prescription: " + p.getPrescription());
        // NOTE: cannot call p.getOutstandingBill() — protected & different package.
    }
}