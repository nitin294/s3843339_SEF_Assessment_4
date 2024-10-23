package com.eyeclear;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat; // Used to update Date format
import java.util.ArrayList;
import java.util.Date;

public class Prescription {
    private int prescID;
    private String firstName;
    private String lastName;
    private String address;
    private float sphere;
    private float axis;
    private float cylinder;
    private Date examinationDate;
    private String optometrist;
    private String[] remarkTypes= {"Client","Optometrist"};
    private ArrayList <String> postRemarks= new ArrayList<>();

    private String remark; // This is added to make junit test easier
    private String category; // This is added to make junit test easier

    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yy"); // Object to change the date format


    // We will cretare Getters and Setters for all of the variable required.

    // Getter and Setter for prescID
    public int getPrescID(){
        return prescID;
    }
    public void setPrescID(int prescID){
        this.prescID = prescID;
    }

    // Getter and Setter for firstName
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    // Getter and Setter for lastName
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    // Getter and Setter for address
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    // Getter and Setter for sphere
    public float getSphere(){
        return sphere;
    }
    public void setSphere(float sphere){
        this.sphere = sphere;
    }

    // Getter and Setter for axis
    public float getAxis(){
        return axis;
    }
    public void setAxis(float axis){
        this.axis = axis;
    }

    // Getter and Setter for cylinder
    public float getCylinder(){
        return cylinder;
    }
    public void setCylinder(float cylinder){
        this.cylinder = cylinder;
    }

    // Getter and Setter for examinationDate
    public Date getExaminationDate(){
        return examinationDate;
    }
    public void setExaminationDate(Date examinationDate){
        this.examinationDate = examinationDate;
    }

    // Getter and Setter for optometrist
    public String getOptometrist(){
        return optometrist;
    }
    public void setOptometrist(String optometrist){
        this.optometrist = optometrist;
    }

    // Getter and Setter for remark
    public String getRemark(){
        return remark;
    }
    public void setRemark(String remark){
        this.remark = remark;
    }

    // Getter and Setter for remark
    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category = category;
    }



    public boolean addPrescription(){

        // If condition to fulful requirements for Condition 1
        if (firstName.length() < 4 || firstName.length() > 15 || lastName.length() < 4 || lastName.length() > 15) {
            return false;
        }

        // If condition to fulful requirements for Condition 2
        if (address.length() < 20) {
            return false;
        }

        // If conditions to fulful requirements for Condition 3
        if (sphere < -20.00 || sphere > 20.00) {
            return false;
        }

        if (cylinder < -4.00 || cylinder > 4.00) {
            return false;
        }

        if (axis < 0 || axis > 180) {
            return false;
        }

        // If condition to fulful requirements for Condition 5
        if (optometrist.length() < 8 || optometrist.length() > 25) {
            return false;
        }

        // Save the prescription details to the presc.txt file
        try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("presc.txt", true))) {
            writer.write("Prescription ID: " + prescID);
            writer.write("\nFirst Name: " + firstName);
            writer.write("\nLast Name: " + lastName);
            writer.write("\nAddress: " + address);
            writer.write("\nSphere: " + sphere);
            writer.write("\nAxis: " + axis);
            writer.write("\nCylinder: " + cylinder);
            writer.write("\nExamination Date: " + dateFormat.format(examinationDate)); // We call the dateFormat object to have the date displayed as requiured in DD/MM/YY. (Condition 4)
            writer.write("\nOptometrist: " + optometrist + "\n\n");
        }
        catch (IOException e) {
            System.out.println("Error, Could not save Prescription: " + e.getMessage());
            return false;
        }

        return true;
    }



    public boolean addRemark() {
        
        // For loop to check if the category is same as an input in remarkTypes
        boolean isValidCategory = false;
        for (int i =0; i < remarkTypes.length; i++) {
            if (remarkTypes[i].equalsIgnoreCase(category)) {
                isValidCategory = true;
            }
        }
        // If the category is not valid it returns false
        if (!isValidCategory) {
            return false;
        }

        // Checks the number of existing remarks in the ArrayList
        if (postRemarks.size() >= 2) {
            return false; // returns false if more than 2 remarks.
        }

         // If condition to fulful requirements for Condition 1
        if (remark.split(" ").length < 6 || remark.split(" ").length > 20 || !Character.isUpperCase(remark.charAt(0))) {
            return false;
        }

        // If all conditions match, it adds the remark
        postRemarks.add(remark);

        // Save the remark details to the review.txt file
        try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("review.txt", true))) {
            writer.write("Prescription ID: " + prescID);
            writer.write("\nFirst Name: " + firstName);
            writer.write("\nLast Name: " + lastName);
            writer.write("\nCategory: " + category);
            writer.write("\nRemark: "+ remark + "\n\n");
        } catch (IOException e) {
            System.out.println("Error, Could not save Remark: " + e.getMessage());
            return false;
        }

        return true;
    }




}