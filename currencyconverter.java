package project;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class currencyconverter 
{ 
    Scanner keyboard=new Scanner(System.in);
    double values[]= {0.90,1,71.30,1.46,1.33,0.76};
	private double amount;
	private double convamount;
    private String  currfrm;
    private String currto;
    public currencyconverter()
    {
    	amount=0.0;
    	convamount=0.0;
    	currfrm=null;
    	currto=null;
    }
    public void getinfo()
    {
    	currfrm=JOptionPane.showInputDialog("Euro:1 \n Usdollar:2 \n Indianrupee:3 \n Ausdollar:4 \n Canadadollar:5 \n Ukpound:6 \n Input the code of the currency which you want to exchange");
    	currto=JOptionPane.showInputDialog("Euro:1 \n Usdollar:2 \n Indianrupee:3 \n Ausdollar:4 \n Canadadollar:5 \n Ukpound:6 \n Enter the currency type in which you want the money  converted");
    	String amn=JOptionPane.showInputDialog("Enter the amount you want to convert");
    	amount=Integer.parseInt(amn);
    }
    public double convert()
    {
    	int inpcode=Integer.parseInt(currfrm);
    	int outcode=Integer.parseInt(currto);
    	if(inpcode==1 && outcode==2)
    		 return convamount=(values[1]/values[0])*amount;
    	else if(inpcode==1 && outcode==3)
		 return convamount=(values[2]/values[0])*amount;
    	else if(inpcode==1 && outcode==4)
   		 return convamount=(values[3]/values[0])*amount;
    	else if(inpcode==1 && outcode==5)
   		 return convamount=(values[4]/values[0])*amount;
    	else if(inpcode==1 && outcode==6)
   		 return convamount=(values[5]/values[0])*amount;
    	else if(inpcode==2 && outcode==1)
   		 return convamount=(values[0]/values[1])*amount;
    	else if(inpcode==2 && outcode==3)
      		 return convamount=(values[2]/values[1])*amount;
    	else if(inpcode==2 && outcode==4)
      		 return convamount=(values[3]/values[1])*amount;
    	else if(inpcode==2 && outcode==5)
      		 return convamount=(values[4]/values[1])*amount;
    	else if(inpcode==2 && outcode==6)
      		 return convamount=(values[5]/values[1])*amount;
    	else if(inpcode==3 && outcode==1)
      		 return convamount=(values[0]/values[2])*amount;
    	else if(inpcode==3 && outcode==2)
     		 return convamount=(values[1]/values[2])*amount;
    	else if(inpcode==3 && outcode==4)
     		 return convamount=(values[3]/values[2])*amount;
    	else if(inpcode==3 && outcode==5)
     		 return convamount=(values[4]/values[2])*amount;
    	else if(inpcode==3 && outcode==6)
     		 return convamount=(values[5]/values[2])*amount;
    	else if(inpcode==4 && outcode==1)
     		 return convamount=(values[0]/values[3])*amount;
    	else if(inpcode==4 && outcode==2)
    		 return convamount=(values[1]/values[3])*amount;
    	else if(inpcode==4 && outcode==3)
    		 return convamount=(values[2]/values[3])*amount;
    	else if(inpcode==4 && outcode==5)
    		 return convamount=(values[4]/values[3])*amount;
    	else if(inpcode==4 && outcode==6)
    		 return convamount=(values[5]/values[3])*amount;
    	else if(inpcode==5 && outcode==1)
    		 return convamount=(values[0]/values[4])*amount;
    	else if(inpcode==5 && outcode==2)
   		     return convamount=(values[1]/values[4])*amount;
    	else if(inpcode==5 && outcode==3)
   		     return convamount=(values[2]/values[4])*amount;
    	else if(inpcode==5 && outcode==4)
   		     return convamount=(values[3]/values[4])*amount;
    	else if(inpcode==5 && outcode==6)
   		     return convamount=(values[5]/values[4])*amount;
    	else if(inpcode==6 && outcode==1)
   		     return convamount=(values[0]/values[5])*amount;
      	else if(inpcode==6 && outcode==2)
  		     return convamount=(values[1]/values[5])*amount;
      	else if(inpcode==6 && outcode==3)
  		     return convamount=(values[2]/values[5])*amount;
      	else if(inpcode==6 && outcode==4)
  		     return convamount=(values[3]/values[5])*amount;
      	else if(inpcode==6 && outcode==5)
  		     return convamount=(values[4]/values[5])*amount;
    	else
    		return 0.0;
    }
       public void display()
    {
    	JOptionPane.showMessageDialog(null,"Converted amount is \n "+convert());
    	System.exit(0);
    }
}
    
