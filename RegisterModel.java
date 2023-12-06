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

	public void createFile(String firstname, String lastname, String username, String password){


    if (!username.isEmpty() || !password.isEmpty()) {

        String filepath = "database";
        String filename = filepath + File.separator + "users.dat";

        File file = new File(filename);

            try{
                File directory = new File(filepath);
                if(!directory.exists()){
                    directory.mkdirs();
                }


                BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true));
                writer.write(firstname+"\t"+lastname+"\t"+username+"\t"+password);
                writer.newLine();
                writer.close();
                JOptionPane.showMessageDialog(null, empty + " Successfully Registered", "Registration Status", JOptionPane.INFORMATION_MESSAGE);

            } catch (IOException e){
                e.printStackTrace();
            }

    } else {
        JOptionPane.showMessageDialog(null, empty + "Please Fill the following", "Registration Status", JOptionPane.INFORMATION_MESSAGE);
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
