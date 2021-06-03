import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class SalarySlip {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        Locale locale = new Locale("en","IN");
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        Date date = new Date();
        DateFormat df = DateFormat.getDateTimeInstance();
        //Taking Input
        System.out.println("Enter Employee ID : ");
        int id = sc.nextInt();
        System.out.println("Enter Employee Name : ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Enter Employee's Basic Salary : ");
        double sal = sc.nextInt();
        //Calculations
        double hra = 0.2*sal;
        double da = 0.1*sal;
        double ta = 0.15*sal;
        double ma = 0.15*sal;
        double pf = 0.1*sal;
        double tds = 0.1*sal;
        double deduction = pf+tds;
        double earning = hra+da+ta+ma;
        double netsal = sal+earning-deduction;
        //Conversion
        String newhra =nf.format(hra);
        String newsal =nf.format(sal);
        String newda =nf.format(da);
        String newta =nf.format(ta);
        String newma =nf.format(ma);
        String newpf =nf.format(pf);
        String newtds =nf.format(tds);
        String newnetsal =nf.format(netsal);
        String dates = df.format(date);
        //Output
        System.out.println("----------Employee Salary Slip----------");
        System.out.println(dates);
        System.out.println("Employee ID : "+id);
        System.out.println("Employee Name : "+name);
        System.out.println("Employee Basic Salary : "+newsal);
        System.out.println("House Rent Allowances : "+newhra);
        System.out.println("Dearness Allowances : "+newda);
        System.out.println("Travelling Allowances : "+newta);
        System.out.println("Medical Allowances : "+newma);
        System.out.println("Provident Fund Deduction : "+newpf);
        System.out.println("Tax Deduction : "+newtds);
        System.out.println("NetSalary in Hand : "+newnetsal);
        sc.close();
    }
}
