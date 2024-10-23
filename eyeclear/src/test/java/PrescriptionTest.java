import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

import com.eyeclear.Prescription;

public class PrescriptionTest {
    @Test
    public void addPrescriptionTest1(){
        Prescription prescription = new Prescription();
        prescription.setPrescID(1);
        prescription.setFirstName("Nitin");
        prescription.setLastName("Bisht");
        prescription.setAddress("123 Lonsdale St, Melbourne, VIC, 3000");
        prescription.setSphere(8.00f);
        prescription.setCylinder(-4.00f);
        prescription.setAxis(70);
        prescription.setOptometrist("Dr. Optometrist");
        prescription.setExaminationDate(new Date());
        
        // All of the variable's requirments are met
        // This Test's result should be displayed in the presc.txt file
        assertTrue(prescription.addPrescription());

        prescription.setPrescID(2);
        prescription.setFirstName("Somebody");
        prescription.setLastName("Nobody");
        prescription.setAddress("10 Lonsdale St, Narre Warren, VIC, 3805");
        prescription.setSphere(2.00f);
        prescription.setCylinder(4.00f);
        prescription.setAxis(40);
        prescription.setOptometrist("Dr. EyeSpecialist");
        prescription.setExaminationDate(new Date());
        
        // All of the variable's requirments are met
        // This Test's result should be displayed in the presc.txt file
        assertTrue(prescription.addPrescription());
    }

    @Test
    public void addPrescriptionTest2(){
        Prescription prescription = new Prescription();
        prescription.setPrescID(1);
        prescription.setFirstName("I"); // Firstname is too short
        prescription.setLastName("Lastname");
        prescription.setAddress("123 Lonsdale St, Melbourne, VIC, 3000");
        prescription.setSphere(8.00f);
        prescription.setCylinder(-4.00f);
        prescription.setAxis(70);
        prescription.setOptometrist("Dr. Optometrist");
        prescription.setExaminationDate(new Date());
        
        // The Firstname variable's requirements arent fullfilled, hence why we use assertFalse()
        assertFalse(prescription.addPrescription());

        prescription.setPrescID(2);
        prescription.setFirstName("Abcdefghijklmnopqrstuvwxyz"); // Firstname is too Long
        prescription.setLastName("Nobody");
        prescription.setAddress("10 Lonsdale St, Narre Warren, VIC, 3805");
        prescription.setSphere(2.00f);
        prescription.setCylinder(4.00f);
        prescription.setAxis(40);
        prescription.setOptometrist("Dr. EyeSpecialist");
        prescription.setExaminationDate(new Date());
        
        // The Firstname variable's requirements arent fullfilled, hence why we use assertFalse()
        assertFalse(prescription.addPrescription());
    }


    @Test
    public void addPrescriptionTest3(){
        Prescription prescription = new Prescription();
        prescription.setPrescID(1);
        prescription.setFirstName("James");
        prescription.setLastName("Ln"); // Lastname is too short
        prescription.setAddress("123 Lonsdale St, Melbourne, VIC, 3000");
        prescription.setSphere(8.00f);
        prescription.setCylinder(-4.00f);
        prescription.setAxis(70);
        prescription.setOptometrist("Dr. Optometrist");
        prescription.setExaminationDate(new Date());
        
        // The Lastname variable's requirements arent fullfilled, hence why we use assertFalse()
        assertFalse(prescription.addPrescription());

        prescription.setPrescID(2);
        prescription.setFirstName("Somebody");
        prescription.setLastName("Nobodyloremepsumloremepsum"); // Lastname is too large
        prescription.setAddress("10 Lonsdale St, Narre Warren, VIC, 3805");
        prescription.setSphere(2.00f);
        prescription.setCylinder(4.00f);
        prescription.setAxis(40);
        prescription.setOptometrist("Dr. EyeSpecialist");
        prescription.setExaminationDate(new Date());
        
        // The Lastname variable's requirements arent fullfilled, hence why we use assertFalse()
        assertFalse(prescription.addPrescription());
    }

    @Test
    public void addPrescriptionTest4(){
        Prescription prescription = new Prescription();
        prescription.setPrescID(1);
        prescription.setFirstName("James");
        prescription.setLastName("Smith");
        prescription.setAddress("AB, CD, EF, GH"); // Address is too short
        prescription.setSphere(8.00f);
        prescription.setCylinder(-4.00f);
        prescription.setAxis(70);
        prescription.setOptometrist("Dr. Optometrist");
        prescription.setExaminationDate(new Date());
        
        // The Address variable's requirements arent fullfilled, hence why we use assertFalse()
        assertFalse(prescription.addPrescription());

        prescription.setPrescID(2);
        prescription.setFirstName("Somebody");
        prescription.setLastName("Nobody");
        prescription.setAddress(" 1, 2, 3, 4"); // Address is too short
        prescription.setSphere(2.00f);
        prescription.setCylinder(4.00f);
        prescription.setAxis(40);
        prescription.setOptometrist("Dr. EyeSpecialist");
        prescription.setExaminationDate(new Date());
        
        // The Address variable's requirements arent fullfilled, hence why we use assertFalse()
        assertFalse(prescription.addPrescription());
    }

    @Test
    public void addPrescriptionTest5(){
        Prescription prescription = new Prescription();
        prescription.setPrescID(1);
        prescription.setFirstName("Nitin");
        prescription.setLastName("Bisht");
        prescription.setAddress("123 Lonsdale St, Melbourne, VIC, 3000");
        prescription.setSphere(-21.00f); // Sphere is too short
        prescription.setCylinder(-4.00f);
        prescription.setAxis(70);
        prescription.setOptometrist("Dr. Optometrist");
        prescription.setExaminationDate(new Date());
        
        // The Sphere variable's requirements arent fullfilled, hence why we use assertFalse()
        assertFalse(prescription.addPrescription());

        prescription.setPrescID(2);
        prescription.setFirstName("Somebody");
        prescription.setLastName("Nobody");
        prescription.setAddress("10 Lonsdale St, Narre Warren, VIC, 3805");
        prescription.setSphere(21.00f); // Sphere is too large
        prescription.setCylinder(4.00f);
        prescription.setAxis(40);
        prescription.setOptometrist("Dr. EyeSpecialist");
        prescription.setExaminationDate(new Date());
        
        // The Sphere variable's requirements arent fullfilled, hence why we use assertFalse()
        assertFalse(prescription.addPrescription());
    }

    @Test
    public void addPrescriptionTest6(){
        Prescription prescription = new Prescription();
        prescription.setPrescID(1);
        prescription.setFirstName("Nitin");
        prescription.setLastName("Bisht");
        prescription.setAddress("123 Lonsdale St, Melbourne, VIC, 3000");
        prescription.setSphere(-4.00f);
        prescription.setCylinder(-5.00f); // Cylinder is too short
        prescription.setAxis(70);
        prescription.setOptometrist("Dr. Optometrist");
        prescription.setExaminationDate(new Date());
        
        // The Cylinder variable's requirements arent fullfilled, hence why we use assertFalse()
        assertFalse(prescription.addPrescription());

        prescription.setPrescID(2);
        prescription.setFirstName("Somebody");
        prescription.setLastName("Nobody");
        prescription.setAddress("10 Lonsdale St, Narre Warren, VIC, 3805");
        prescription.setSphere(5.00f);
        prescription.setCylinder(5.00f); // Cylinder is too large
        prescription.setAxis(40);
        prescription.setOptometrist("Dr. EyeSpecialist");
        prescription.setExaminationDate(new Date());
        
        // The Cylinder variable's requirements arent fullfilled, hence why we use assertFalse()
        assertFalse(prescription.addPrescription());
    }

    @Test
    public void addPrescriptionTest7(){
        Prescription prescription = new Prescription();
        prescription.setPrescID(1);
        prescription.setFirstName("Nitin");
        prescription.setLastName("Bisht");
        prescription.setAddress("123 Lonsdale St, Melbourne, VIC, 3000");
        prescription.setSphere(-4.00f);
        prescription.setCylinder(-5.00f);
        prescription.setAxis(-1); // Axis is too short
        prescription.setOptometrist("Dr. Optometrist");
        prescription.setExaminationDate(new Date());
        
        // The Axis variable's requirements arent fullfilled, hence why we use assertFalse()
        assertFalse(prescription.addPrescription());

        prescription.setPrescID(2);
        prescription.setFirstName("Somebody");
        prescription.setLastName("Nobody");
        prescription.setAddress("10 Lonsdale St, Narre Warren, VIC, 3805");
        prescription.setSphere(5.00f);
        prescription.setCylinder(5.00f);
        prescription.setAxis(181); // Axis is too large
        prescription.setOptometrist("Dr. EyeSpecialist");
        prescription.setExaminationDate(new Date());
        
        // The Axis variable's requirements arent fullfilled, hence why we use assertFalse()
        assertFalse(prescription.addPrescription());
    }

    @Test
    public void addPrescriptionTest8(){
        Prescription prescription = new Prescription();
        prescription.setPrescID(1);
        prescription.setFirstName("Nitin");
        prescription.setLastName("Bisht");
        prescription.setAddress("123 Lonsdale St, Melbourne, VIC, 3000");
        prescription.setSphere(-4.00f);
        prescription.setCylinder(-4.00f);
        prescription.setAxis(6);
        prescription.setOptometrist("Dr"); // Optometrist Name is too short
        prescription.setExaminationDate(new Date());
        
        // The Optometrist variable's requirements arent fullfilled, hence why we use assertFalse()
        assertFalse(prescription.addPrescription());

        prescription.setPrescID(2);
        prescription.setFirstName("Somebody");
        prescription.setLastName("Nobody");
        prescription.setAddress("10 Lonsdale St, Narre Warren, VIC, 3805");
        prescription.setSphere(5.00f);
        prescription.setCylinder(4.00f);
        prescription.setAxis(50);
        prescription.setOptometrist("Dr. EyeSpecialistnameisveryverylarge"); // Optometrist Name is too large
        prescription.setExaminationDate(new Date());
        
        // The Optometrist variable's requirements arent fullfilled, hence why we use assertFalse()
        assertFalse(prescription.addPrescription());
    }

    //////////////////////////////////////
    //Junit test for addRemark() method
    //////////////////////////////////////

    @Test
    public void addRemarkTest1() {
        Prescription prescription = new Prescription();

        prescription.setPrescID(1);
        prescription.setFirstName("Nitin");
        prescription.setLastName("Bisht");
        prescription.setRemark("For a Valid Remark we need atleast 6 words.");
        prescription.setCategory("Client");
    
        // All of the variable's requirments are met
        // This Test's result should be displayed in the review.txt file
        assertTrue(prescription.addRemark());

        prescription.setPrescID(2);
        prescription.setFirstName("James");
        prescription.setLastName("Bond");
        prescription.setRemark("For a Valid Remark we need atleast 6 words.");
        prescription.setCategory("Optometrist");

        // All of the variable's requirments are met
        // This Test's result should be displayed in the review.txt file
        assertTrue(prescription.addRemark());
    }

    @Test
    public void addRemarkTest2() {
        Prescription prescription = new Prescription();

        prescription.setPrescID(3);
        prescription.setFirstName("Nitin");
        prescription.setLastName("Bisht");
        prescription.setRemark("for a Valid Remark we need atleast 6 words."); // Remark starting with lowercase value
        prescription.setCategory("Client");
    
        // The remark variable's requirements arent fullfilled, hence why we use assertFalse()
        assertFalse(prescription.addRemark());

        prescription.setPrescID(4);
        prescription.setFirstName("James");
        prescription.setLastName("Bond");
        prescription.setRemark("for a Valid Remark we need atleast 6 words."); // Remark starting with lowercase value
        prescription.setCategory("Optometrist");

        // The remark variable's requirements arent fullfilled, hence why we use assertFalse()
        assertFalse(prescription.addRemark());
    }

    @Test
    public void addRemarkTest3() {
        Prescription prescription = new Prescription();

        prescription.setPrescID(5);
        prescription.setFirstName("Sarah");
        prescription.setLastName("Bob");
        prescription.setRemark("This is a valid remark with enough words");
        prescription.setCategory("client");
        // Altough the input starts with a lower case, it is still recognised
    
        // All of the variable's requirments are met
        // This Test's result should be displayed in the review.txt file
        assertTrue(prescription.addRemark());

        prescription.setPrescID(6);
        prescription.setFirstName("James");
        prescription.setLastName("Bond");
        prescription.setRemark("For a Valid Remark we need atleast 6 words."); // Remark starting with lowercase value
        prescription.setCategory("optometrist");
        // Altough the input starts with a lower case, it is still recognised

        // All of the variable's requirments are met
        // This Test's result should be displayed in the review.txt file
        assertTrue(prescription.addRemark());
    }

    @Test
    public void addRemarkTest4() {
        Prescription prescription = new Prescription();

        prescription.setPrescID(7);
        prescription.setFirstName("Sarah");
        prescription.setLastName("Bob");
        prescription.setRemark("A B C D E F G H I J K L M N O P Q R S T U V W X Y Z");
        prescription.setCategory("Client");
        // This remark will not be valid as it has more than 20 words
    
        // The remark variable's requirements arent fullfilled, hence why we use assertFalse()
        assertFalse(prescription.addRemark());

        prescription.setPrescID(8);
        prescription.setFirstName("James");
        prescription.setLastName("Bond");
        prescription.setRemark("Z Y X W V U T S R Q P O N M L K J I H G F E D C B A");
        // This remark will not be valid as it has more than 20 words
        prescription.setCategory("Optometrist");

        // The remark variable's requirements arent fullfilled, hence why we use assertFalse()
        assertFalse(prescription.addRemark());
    }

    @Test
    public void addRemarkTest5() {
        Prescription prescription = new Prescription();

        prescription.setPrescID(9);
        prescription.setFirstName("Captain");
        prescription.setLastName("America");
        prescription.setRemark("This remark has exactly six words");
        prescription.setCategory("unvalid"); // Invaild Category Name
    
        // The category variable's requirements arent fullfilled, hence why we use assertFalse()
        assertFalse(prescription.addRemark());

        prescription.setPrescID(10);
        prescription.setFirstName("James");
        prescription.setLastName("Bond");
        prescription.setRemark("This remark has exactly six words");
        prescription.setCategory(""); // Invaild Category Name

        // The category variable's requirements arent fullfilled, hence why we use assertFalse()
        assertFalse(prescription.addRemark());
    }
}
