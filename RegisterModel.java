package book.system.register;

import java.io.*;
import javax.swing.*;

public class RegisterModel{

    private String firstname;
    private String lastname;
	private String username;
	private String password;

	String empty = "";

	public String getFirstname(){
		return firstname;
	}

	public void setFirstname(String firstname){
		this.firstname = firstname;
	}

	public String getLastname(){
		return lastname;
	}

	public void setLastname(String lastname){
		this.lastname = lastname;
	}

	public String getUsername(){
		return username;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getPassword(){
		return password;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public void createUserData(String firstname, String lastname, String username, String password) {
    if (!username.isEmpty() && !password.isEmpty()) {

        String filepath = "database";
        String filename = filepath + File.separator + "users.dat";

        File file = new File(filename);

        try {
            File directory = new File(filepath);
            if (!directory.exists()) {
                directory.mkdirs();
            }

            // Check if the file is empty before writing default admin account
            if (file.length() == 0) {
                BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true));
                writer.write("admin\tadmin\tadmin\tadmin");
                writer.newLine();
                writer.write("teacher\tteacher\tteacher\tteacher");
                writer.newLine();
                writer.close();
             
            }

            // Write the new user data
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true));
            writer.write(firstname + "\t" + lastname + "\t" + username + "\t" + password);
            writer.newLine();
            writer.close();
            JOptionPane.showMessageDialog(null, "Successfully Registered", "Registration Status", JOptionPane.INFORMATION_MESSAGE);

        } catch (IOException e) {
            e.printStackTrace();
        }

    } else {
        JOptionPane.showMessageDialog(null, "Please Fill the following", "Registration Status", JOptionPane.INFORMATION_MESSAGE);
    }
   }

   public void createUserTaskSpace(String firstname, String lastname, String username, String password) {

    if (!username.isEmpty() && !password.isEmpty()) {

        String filepath = "database";
        String filename = filepath + File.separator + username + ".dat";

        File file = new File(filename);
        try {
            File directory = new File(filepath);
            if (!directory.exists()) {
                directory.mkdirs();
            }

        
            // Write the new user data
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true));
            writer.newLine();
            writer.close();
       

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
   }


  public void createFileAdmin(String firstname, String lastname, String username, String password){


    if (!username.isEmpty() || !password.isEmpty()) {

        String filepath = "database";
        String filename = filepath + File.separator + "admin.dat";

        File file = new File(filename);

        if(!file.exists()){
          
          try{         
                BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true));
                writer.write("FirstName\tLastName\tUsername\tPassword");
                writer.newLine();
                writer.write(firstname+"\t\t"+lastname+"\t\t"+username+"\t\t"+password);
                writer.newLine();
                writer.close();

            } catch (IOException e){
                e.printStackTrace();
            }
        } else {
        	try{
            
                BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true));
                writer.write(firstname+"\t\t"+lastname+"\t\t"+username+"\t\t"+password);
                writer.newLine();
                writer.close();

            } catch (IOException e){
                e.printStackTrace();
            }
        }
                    
    }
  }


    public void createFileTeacher(String firstname, String lastname, String username){

    if (!username.isEmpty() || !password.isEmpty()) {

        String filepath = "database";
        String filename = filepath + File.separator + "teacher.dat";

        File file = new File(filename);

        if(!file.exists()){
          
          try{         
                BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true));
                writer.write("FirstName\tLastName\tUsername");
                writer.newLine();
                writer.write(firstname+"\t\t"+lastname+"\t\t"+username);
                writer.newLine();
                writer.close();

            } catch (IOException e){
                e.printStackTrace();
            }
        } else {

        	try{
            
                BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true));
                writer.write(firstname+"\t\t"+lastname+"\t\t"+username);
                writer.newLine();
                writer.close();

            } catch (IOException e){
                e.printStackTrace();
            }
        }
                    
    }
  }

}
