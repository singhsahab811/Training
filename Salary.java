import java.util.Scanner;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;   
public class Salary {
	 


	
	    private String Name;
	    private String Company;
	    private double Basic;
	    private double HRA;
	    private double DA;
	    private double TA;
	    private double PF;
	    private double GS;
	    private double MA;
	    private double Tax;
	    Salary()
	    {
	    }
	    Salary(String name,String company,double basic)
	    {
	        Name = name;
	        Company= company;
	        Basic=basic;
	        Calculate();    
	        Tax=Tax_Calc();
	    }
	    
	    public void  Calculate()
	    {
	    	HRA=0.3*Basic;
	    	DA=0.1*Basic;
	    	TA=0.2*Basic;
	    	MA=0.15*Basic;
	    	PF=0.1*Basic;
	    	GS=HRA+DA+TA+MA-PF+Basic;
	    	
	    }
	    public double Tax_Calc()
	    {
	        if(GS > 900000)
	        {
	            return (0.3*GS);
	        }
	        else if(GS>700000 &&GS<900000)
	        {
	            return (0.2*GS);
	        }
	        else if(GS>500000 &&GS<700000)
	        {
	            return (0.1*GS);
	        }
	        else
	        {
	            return 0;
	        }
	    }
	        public String getName()
	        {
	            return Name;
	        }
	        public void setName(String name)
	        {
	            Name = name;
	        }
	        public String getCompany()
	        {
	            return Company;
	        }
	        public double getTax_Basic()
	        {
	            return Tax;
	        }
	       
	        public double getBasic()
	        {
	            return Basic;
	        }
	        public void setBasic(double basic)
	        {
	            Basic=basic;
	        }
	  
			public double getHRA() {
				return HRA;
			}
			public double getDA() {
				return DA;
			}
			public double getTA() {
				return TA;
			}
			public double getPF() {
				return PF;
			}
			public double getGS() {
				return GS;
			}
			public double getMA() {
				return MA;
			}
			
		
	        public void printReport()
	    {
	        System.out.println("-----------------------------------------------------");
	        System.out.println("                    SALARY SLIP                      ");
	        System.out.println("-----------------------------------------------------");
	        System.out.println("Name : "+getName());
	        System.out.println("Company : "+getCompany());
	        System.out.println("Basic : "+getBasic());      
	        System.out.println("HRA : "+(getHRA()));
	        System.out.println("DA : "+(getDA()));
	        System.out.println("TA : "+(getTA()));
	        System.out.println("MA : "+(getMA()));
	        System.out.println("PF : "+(getPF()));
	        System.out.println("Gross Salary : "+(getGS()));
	        System.out.println("TAX : "+getTax_Basic());
	        System.out.println("Net Salary : "+(getGS()-getTax_Basic()));
	        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
	        LocalDateTime now = LocalDateTime.now();  
	        System.out.println("-----------------------------------------------------");  
	        System.out.println("           Generated On : "+dtf.format(now));
	        System.out.println("-----------------------------------------------------");
	    }
	    public static String convertTitleCase(String input)
	    {
	        StringBuilder output = new StringBuilder(input.length());
	        boolean nextTitleCase = true;
	        for (char c : input.toCharArray()) 
	        {
	            if (Character.isSpaceChar(c)) 
	            {
	                nextTitleCase = true;
	            } 
	            else if (nextTitleCase && Character.isLowerCase(c)) 
	            {
	                c = Character.toTitleCase(c);
	                nextTitleCase = false;
	            }
	            else if(Character.isUpperCase(c))
	            {
	                c=Character.toLowerCase(c);
	            }
	            output.append(c);
	        }
	        return output.toString();
	    }
	    public static void main(String[] args) 
	    {
	        Scanner scanner = new Scanner(System.in);
	            System.out.println("Enter Name : ");
	            String name = scanner.nextLine();
	            scanner.nextLine();
	            System.out.println("Enter Company Name : ");
	            String company = scanner.next();
	            scanner.nextLine();
	            System.out.println("Enter Basic Salary :");
	            double basic = scanner.nextDouble();
	            name = convertTitleCase(name);
	            company = convertTitleCase(company);
	            Salary ob=new Salary(name,company,basic);
	            ob.printReport();
	      
	        scanner.close();
	        
	    }

	



}