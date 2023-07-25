
package bank.mangement.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;


public class SignupOne extends JFrame implements ActionListener {
     long random;
     JTextField  nameTextField,fnameTextField,emailTextField,addressTextField,cityTextField,StateTextField,pincodeTextField;
     JButton next;
     JDateChooser  dateChooser;
     JRadioButton male, female, married, unmarried, other;
     
     
     SignupOne(){
         
         setLayout(null);
         
         Random ran = new Random();
          random = Math.abs((ran.nextLong() %9000) +1000L);
         
         JLabel formno = new JLabel("APPLICATION FORM NO. " + random );
         formno.setFont(new Font("Raleway",Font.BOLD,38));
         formno.setBounds(140,15,600,40);
         add(formno);
         
         JLabel personDetails = new JLabel("Page 1 : Personal Details");
         personDetails.setFont(new Font("Raleway" , Font.BOLD,22));
         personDetails.setBounds(290,75,400,30);
         add(personDetails);
         
         
         
         JLabel name = new JLabel("Name:");
         name.setFont(new Font("Raleway", Font.BOLD,22));
         name.setBounds(100,130,200,30);
         add(name);
         
           nameTextField = new JTextField();
         nameTextField.setFont(new Font("Raleway", Font.BOLD,14));
         nameTextField.setBounds(300,130,400,30);
         add(nameTextField);
         
         JLabel fname = new JLabel("Father's Name:");
         fname.setFont(new Font("Raleway",Font.BOLD,22));
         fname.setBounds(100,180,200,30);
         add(fname);
         
          fnameTextField = new JTextField();
         fnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
         fnameTextField.setBounds(300,180,400,30);
         add(fnameTextField);
         
         JLabel dob = new JLabel("Date of Birth:");
         dob.setFont(new Font("Raleway", Font.BOLD,22));
         dob.setBounds(100,230,200,30);
         add(dob);
         
         
             dateChooser= new JDateChooser();
         dateChooser.setForeground(new Color(105,105,105));
         dateChooser.setBounds(300,230,400,30);
         add(dateChooser);
         
         
         JLabel gender = new JLabel("Gender:");
         gender.setFont(new Font("Raleway", Font.BOLD,22));
         gender.setBounds(100,280,200,30);
         add(gender);
         
          male = new JRadioButton("Male");
         male.setBounds(320,280,60,30);
         male.setBackground(Color.WHITE);
         add(male);
         
         
         female = new JRadioButton("Female");
         female.setBounds(450,280,100,30);
         female.setBackground(Color.white);
         add(female);
         
         ButtonGroup gendergroup = new ButtonGroup();
         gendergroup.add(male);
         gendergroup.add(female);
         
         JLabel email = new JLabel("Email id:");
         email.setFont(new Font("Raleway", Font.BOLD,22));
         email.setBounds(100,330,200,30);
         add(email);
         
          emailTextField = new JTextField();
         emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
         emailTextField.setBounds(300,330,400,30);
         add(emailTextField);
         
         JLabel marital =new JLabel("Martial Status:");
         marital.setFont(new Font("RaleWay",Font.BOLD,22));
         marital.setBounds(100,380,200,30);
         add(marital);
         
             married = new JRadioButton("Married");
         married.setBounds(320,380,80,30);
         married.setBackground(Color.WHITE);
         add(married);
         
         
          unmarried = new JRadioButton("Unmarried ");
         unmarried .setBounds(450,380,100,30);
         unmarried .setBackground(Color.white);
         add(unmarried );
         
          other = new JRadioButton("Other");
         other.setBounds(590,380,60,30);
         other.setBackground(Color.white);
         add(other);
         ButtonGroup martialgroup = new ButtonGroup();
         martialgroup.add(married);
         martialgroup.add(unmarried);
         martialgroup.add(other);
         
         JLabel address = new JLabel("Address:");
         address.setFont(new Font("Raleway",Font.BOLD,22));
         address.setBounds(100,430,200,30);
         add(address);
         
          addressTextField = new JTextField();
         addressTextField.setFont(new Font("Raleway", Font.BOLD,14));
         addressTextField.setBounds(300,430,400,30);
         add(addressTextField);
         
         JLabel city = new JLabel("City:");
         city.setFont(new Font("Raleway",Font.BOLD,22));
         city.setBounds(100,480,200,30);
         add(city);
         
           cityTextField = new JTextField();
         cityTextField.setFont(new Font("Raleway", Font.BOLD,14));
         cityTextField.setBounds(300,480,400,30);
         add(cityTextField);
         
         JLabel state = new JLabel("State:");
         state.setFont(new Font("Raleway",Font.BOLD,22));
         state.setBounds(100,530,200,30);
         add(state);
         
            StateTextField = new JTextField();
         StateTextField.setFont(new Font("Raleway", Font.BOLD,14));
         StateTextField.setBounds(300,530,400,30);
         add(StateTextField);
         
         
         
         JLabel pincode= new JLabel("Pin Code:");
         pincode.setFont(new Font("Raleway",Font.BOLD,22));
         pincode.setBounds(100,580,200,30);
         add(pincode);
         
           pincodeTextField = new JTextField();
         pincodeTextField.setFont(new Font("Raleway", Font.BOLD,14));
        pincodeTextField.setBounds(300,580,400,30);
         add(pincodeTextField);
         
        
         next = new JButton("Next");
         next.setBackground(Color.BLACK);
         next.setForeground(Color.WHITE);
         next.setBounds(620,610,80,25);
         next.setFont(new Font("Raleway",Font.BOLD,14));
         next.addActionListener(this);
         add(next);
         
         
          
         
 getContentPane().setBackground(Color.WHITE);
 
 setSize(850,850);
 setLocation(250,5);
 setVisible(true);
}
     public void actionPerformed(ActionEvent ae){
         String formno="" + random;
         String name =nameTextField.getText();
         String fname = fnameTextField.getText();
         String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
         String gender = null;
         if(male.isSelected()){
             gender ="Male";
         }else if (female.isSelected()){
             gender="Female";
         }
         String email = emailTextField.getText();
         String marital = null;
         if(married.isSelected()){
             marital ="Married ";  
         }else if(unmarried.isSelected()){
             marital="UnMarried";
         }else if(other.isSelected()){
        marital="Other";
         }
         
         String address = addressTextField.getText();
         String city = cityTextField.getText();
         String state = StateTextField.getText();
         String pincode = pincodeTextField.getText();
         
         try{
             if(name.equals("")){
                 JOptionPane.showMessageDialog(null, "Name is Required ");
             }else if(fname.equals("")){
                 JOptionPane.showMessageDialog(null, "FName is Required ");
             }else if(dob.equals("")){
                 JOptionPane.showMessageDialog(null, "Date of Birth  is Required ");
             
             }else if(email.equals("")){
                 JOptionPane.showMessageDialog(null, "Email is Required ");
             }else if(address.equals("")){
                 JOptionPane.showMessageDialog(null, " Address is Required ");
//             
             }else{
                 Conn c= new Conn();
                 String query ="insert into signup values ('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pincode+"')";
                 c.s.executeUpdate(query); 
                 
                 setVisible(false);
                 new SignupTwo(formno).setVisible(true);
             }
              
         }catch (Exception e){
             System.out.println(e);
         }
         
     }
    
     public static void main(String []args){
         new SignupOne();
         
     }
}
