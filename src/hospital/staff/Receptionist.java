package hospital.staff;

import hospital.model.Patient;

public class Receptionist {

    private final String name;

    public Receptionist(String name) { this.name = name; }

    // Receptionist can ONLY see basic details.
    public void viewBasicDetails(Patient p) {
        System.out.println("  [RECEPTIONIST " + name + "] Name: " + p.getFullName()
                + " | Appointment: " + p.getAppointmentDate());
        // p.getDiagnosis()        → compiles, but role never receives that method's use
        // p.getOutstandingBill()  → COMPILE ERROR (protected, different package)
        // p.getPatientId()        → COMPILE ERROR (package-private, different package)
    }
}