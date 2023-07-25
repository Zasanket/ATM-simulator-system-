
package bank.mangement.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



public class SignupTwo extends JFrame implements ActionListener {
    JButton next;
    JRadioButton nosc,yessc,noac,yesac;
    JComboBox religionbox,categorybox,incomebox,qualificationbox,occupationbox;
    JTextField panTextField , adharTextField;
    String formno;
    SignupTwo(String formno){
        this.formno= formno;
        setLayout(null);
        
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
         JLabel  additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,20));
        additionalDetails.setBounds(290,40,400,30);
        add(additionalDetails);
        
        JLabel religion = new JLabel("Religion:");
         religion.setFont(new Font("Raleway",Font.BOLD,20));
        religion.setBounds(100,100,400,30);
        add(religion);
        
        String valReligion[] ={"Hindu","Muslim","Sikh","Christian","Other"};
        religionbox = new JComboBox(valReligion);
        religionbox.setBounds(300,100,400,30);
        religionbox.setBackground(Color.WHITE);
        add(religionbox);
        
        
        JLabel category = new JLabel("Category:");
         category.setFont(new Font("Raleway",Font.BOLD,20));
        category.setBounds(100,150,400,30);
        add(category);
        
        String valcategory[] ={"General","OBC","EWS","SC","Other"};
       categorybox = new JComboBox(valcategory);
        categorybox.setBounds(300,150,400,30);
        categorybox.setBackground(Color.WHITE);
        add(categorybox);
          
        JLabel income = new JLabel("Income:");
         income.setFont(new Font("Raleway",Font.BOLD,20));
        income.setBounds(100,200,400,30);
        add(income);
        
        String valincome[] ={"0",">50000",">100000",">500000",">1000000"};
        incomebox = new JComboBox(valincome);
        incomebox.setBounds(300,200,400,30);
        incomebox.setBackground(Color.WHITE);
        add(incomebox);
            
        JLabel educational = new JLabel("Educational");
         educational.setFont(new Font("Raleway",Font.BOLD,20));
        educational.setBounds(100,250,400,30);
        add(educational);
              
        
        
        JLabel  qualification= new JLabel("Qualification:");
        qualification.setFont(new Font("Raleway",Font.BOLD,20));
        qualification.setBounds(100,280,400,30);
        add(qualification);
        
        String valqualification[] ={"Graduate","Post Graduate","12th pass","no qualification","Other"};
        qualificationbox = new JComboBox(valqualification);
       qualificationbox.setBounds(300,265,400,30);
        qualificationbox.setBackground(Color.WHITE);
        add(qualificationbox);
        
        JLabel Occupation = new JLabel("Occupation:");
         Occupation.setFont(new Font("Raleway",Font.BOLD,20));
        Occupation.setBounds(100,330,400,30);
        add(Occupation);
        
        String valOccupation[] ={"Self-employee","Business","student","Employeer","Other"};
        occupationbox = new JComboBox(valOccupation);
        occupationbox.setBounds(300,330,400,30);
        occupationbox.setBackground(Color.WHITE);
        add(occupationbox);
                  
        JLabel pan = new JLabel("PAN Number:");
         pan.setFont(new Font("Raleway",Font.BOLD,20));
        pan.setBounds(100,380,400,30);
        add(pan);
        
         panTextField = new JTextField();
         panTextField.setFont(new Font("Raleway", Font.BOLD,14));
         panTextField.setBounds(300,380,400,30);
         add(panTextField);
                    
        JLabel adhar = new JLabel("Aadhar:");
         adhar.setFont(new Font("Raleway",Font.BOLD,20));
        adhar.setBounds(100,430,400,30);
        add(adhar);
        
        adharTextField = new JTextField();
         adharTextField.setFont(new Font("Raleway", Font.BOLD,14));
         adharTextField.setBounds(300,430,400,30);
         add(adharTextField);
        
        
        JLabel sCitizen = new JLabel("Senior Citizen:");
         sCitizen.setFont(new Font("Raleway",Font.BOLD,20));
        sCitizen.setBounds(100,480,400,30);
        add(sCitizen);
        
            yessc = new JRadioButton("Yes");
         yessc.setBounds(320,480,80,30);
         yessc.setBackground(Color.WHITE);
         add(yessc);
         
         
          nosc = new JRadioButton("NO ");
           nosc.setBounds(450,480,100,30);
       nosc.setBackground(Color.white);
         add(nosc );
         
          
         ButtonGroup seniorGroup = new ButtonGroup();
         seniorGroup.add(yessc);
         seniorGroup.add(nosc);
        
        
        JLabel eAccount = new JLabel("Existing Account:"); 
         eAccount.setFont(new Font("Raleway",Font.BOLD,20));
        eAccount.setBounds(100,530,400,30);
        add(eAccount);
        
           yesac = new JRadioButton("Yes");
         yesac.setBounds(320,530,80,30);
         yesac.setBackground(Color.WHITE);
         add(yesac);
         
         
          noac = new JRadioButton("NO ");
           noac.setBounds(450,530,100,30);
       noac.setBackground(Color.white);
         add(noac );
         
          
         ButtonGroup AccountGroup = new ButtonGroup();
         AccountGroup.add(yesac);
         AccountGroup.add(noac);
       
        
        
        
        
    
        next= new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,600,80,30);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,850);
        setLocation(250,5);
        setVisible(true);
   
}
    public void actionPerformed(ActionEvent ae){
        String religion = (String) religionbox.getSelectedItem();
         String category = (String) categorybox.getSelectedItem();
        String income = (String) incomebox.getSelectedItem();
        String qualification = (String) qualificationbox.getSelectedItem();
        String occupation = (String) occupationbox.getSelectedItem();
        
         String sCitizen = null;
         if(yessc.isSelected()){
             sCitizen ="YES";
         }else if (nosc.isSelected()){
             sCitizen="NO";
         }
          String eAccount = null;
         if(yesac.isSelected()){
             eAccount ="YES";
         }else if (noac.isSelected()){
             eAccount="NO";
         }
         String pan = panTextField.getText();
          String adhar = adharTextField.getText();

        try{
            Conn c= new Conn();
            String query = "insert into signupTwo values ('"+formno+"','"+religion+"','"+category+"','"+income+"','"+qualification+"','"+occupation+"','"+pan+"','"+adhar+"','"+sCitizen+"','"+eAccount+"')";
                  c.s.executeUpdate(query);  
                  
                  setVisible(false);
                  new SignupThree(formno).setVisible(true);
//                  
                    }catch(Exception e){
            System.out.println(e);
        }
    }
public static void main(String []args){
    new SignupTwo("");
}
}
