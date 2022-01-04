package entities;

public class Student extends User {

    // Instance variables
    // basic data
    private String regNo;

    //    secondary data
    private String admission, reasonAdmission, previousIllness, medicalHistory, privateHospital;
    //    tertiary data
    private String vision, hearing, bloodSugar, hbLevel, bloodGroup, urineChemistry, onTreatment, anyObservation, studentFit;

    private FamilyDoctor familyDoctor;

    //    Constructors
    public Student(String id, String regNo, String surname, String firstName, String lastName, String phone, String email, String gender,
            String maritalStatus, String nationality, String religion, NextOfKin nextOfKin, String privateHospital,
            String admission, String reasonAdmission, String previousIllness, String medicalHistory, String vision,
            String hearing, String bloodSugar, String hbLevel, String bloodGroup, String urineChemistry, String onTreatment,
            String anyObservation, String studentFit, FamilyDoctor familyDoctor) {
        super(id, surname, firstName, lastName, phone, email, gender, maritalStatus, nationality, religion, nextOfKin);

        this.admission = admission;
        this.reasonAdmission = reasonAdmission;
        this.previousIllness = previousIllness;
        this.medicalHistory = medicalHistory;
        this.vision = vision;
        this.hearing = hearing;
        this.bloodSugar = bloodSugar;
        this.hbLevel = hbLevel;
        this.bloodGroup = bloodGroup;
        this.urineChemistry = urineChemistry;
        this.onTreatment = onTreatment;
        this.anyObservation = anyObservation;
        this.studentFit = studentFit;
        this.privateHospital = privateHospital;
        this.familyDoctor = familyDoctor;
        this.regNo = regNo;
    }

    // Accessors
    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getPreviousIllness() {
        return previousIllness;
    }

    public void setPreviousIllness(String previousIllness) {
        this.previousIllness = previousIllness;
    }

    public String getAdmission() {
        return admission;
    }

    public void setAdmission(String admission) {
        this.admission = admission;
    }

    public String getReasonAdmission() {
        return reasonAdmission;
    }

    public void setReasonAdmission(String reasonAdmission) {
        this.reasonAdmission = reasonAdmission;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public String getVision() {
        return vision;
    }

    public void setVision(String vision) {
        this.vision = vision;
    }

    public String getHearing() {
        return hearing;
    }

    public void setHearing(String hearing) {
        this.hearing = hearing;
    }

    public String getBloodSugar() {
        return bloodSugar;
    }

    public void setBloodSugar(String bloodSugar) {
        this.bloodSugar = bloodSugar;
    }

    public String getHbLevel() {
        return hbLevel;
    }

    public void setHbLevel(String hbLevel) {
        this.hbLevel = hbLevel;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getUrineChemistry() {
        return urineChemistry;
    }

    public void setUrineChemistry(String urineChemistry) {
        this.urineChemistry = urineChemistry;
    }

    public String getOnTreatment() {
        return onTreatment;
    }

    public void setOnTreatment(String onTreatment) {
        this.onTreatment = onTreatment;
    }

    public String getAnyObservation() {
        return anyObservation;
    }

    public void setAnyObservation(String anyObservation) {
        this.anyObservation = anyObservation;
    }

    public String getStudentFit() {
        return studentFit;
    }

    public void setStudentFit(String studentFit) {
        this.studentFit = studentFit;
    }

    public FamilyDoctor getFamilyDoctor() {
        return familyDoctor;
    }

    public void setFamilyDoctor(FamilyDoctor familyDoctor) {
        this.familyDoctor = familyDoctor;
    }

    public String getPrivateHospital() {
        return privateHospital;
    }

    public void setPrivateHospital(String privateHospital) {
        this.privateHospital = privateHospital;
    }
}
