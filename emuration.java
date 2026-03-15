enum hospital {
    DOCTOR, NURSE, PATIENT, RECEPTIONIST
}

public class emuration {
    public static void main(String[] args) {
        hospital role = hospital.DOCTOR;
        switch (role) {
            case DOCTOR:
                System.out.println("The role is DOCTOR.");
                break;
            case NURSE:
                System.out.println("The role is NURSE.");
                break;
            case PATIENT:
                System.out.println("The role is PATIENT.");
                break;
            case RECEPTIONIST:
                System.out.println("The role is RECEPTIONIST.");
                break;
        }

    }
}
