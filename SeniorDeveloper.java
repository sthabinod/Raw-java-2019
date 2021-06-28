   
/**
 * This class inherit the Developer class
 * This class is for declaring the variable.
 * The value is initialized and accessor method is used to use the private variable outside the class.
 * The mutator method is used for changing the value of the variable outside the class.
 * Similary, the developer is appointed by passing the value in the parameter of the method
 * As the developer is hired it also checks the termination of the developer.
 * This class prints the developer details as required.
 * @author (Binod Shrestha)
 * @ID: 18028893
 */
public class SeniorDeveloper extends Developer
{
   private int salary;
   private String joiningDate;
   private String staffRoomNumber;
   private int contractPeriod;
   private double advanceSalary;
   private boolean appointed;
   private boolean terminated;
   
   public SeniorDeveloper(String platform,String interViewerName,double workingHrs,int salary,int contractPeriod)
   {
       super(platform,interViewerName,workingHrs);
       this.salary=salary;
       this.contractPeriod=contractPeriod;
       this.joiningDate="";
       this.staffRoomNumber="";
       this.advanceSalary=0.0;
       this.appointed=false;
       this.terminated=false;
    }
   /*
     * This method is for returning when salary of the developer is called
     * It returns whole(0,1,2,3....) value
     * It can give access to other classes when called
     */
   public int getSalary()
    {
       return salary;
    }    
    /*
     * This method is for returning when joining date of the developer is called
     * It returns numbers and alphabets value
     * It can give access to other classes when called
     */
   public String getJoiningDate()
    {
       return joiningDate;
    }
    /*
     * This method is for returning when contract period of the developer is called
     * It returns whole(0,1,2,3....) value
     * It can give access to other classes when called
     */
   public int getContractPeriod()
    {
       return contractPeriod;
    }
    /*
     * This method is for returning when advance salary of the developer is called
     * It returns fractional value value
     * It can give access to other classes when called
     */
   public double getAdvanceSalary()
    {
       return advanceSalary;
    }
    /*
     * This method is for returning when appointed status of the developer is called
     * It returns either true or false 
     * It can give access to other classes when called
     */
   public boolean getAppointed()
    { 
       return appointed; 
    }
    /*
     * This method is for returning when termination of the developer is called
     * It returns true or false value
     * It can give access to other classes when called
     */
   public boolean getTerminated()
    {
       return terminated;
    }
  
    /*
     * This method is for changing the value of salary when set salary is called in another class
     */
   public void setSalary(int salary)
    {
       this.salary = salary;
    }
    /*
     * This method is changing the value of developer's contract period when set contact period is called
     * It can change the value when called from another class
     */
   public void setContractPeroid(int contractPeriod)
    { 
       this.contractPeriod=contractPeriod;
    }
    /*
     * This method accepts parameter as developer name,joining date, advance salary,staff room number
     * There is condition if the developer is appointed then assigns the value to the developer name joining date, advance salary,staff room number
     * and turn appointed status true
     * There is an another condition if the developer is not appointed give note and print developer name and staff room number
     */
   public void hireDeveloper(String developerName,String joiningDate,double advanceSalary,String staffRoomNumber)
    {
        if(appointed == false)
        {
            super.setDeveloperName(developerName);
            this.joiningDate=joiningDate;
            this.advanceSalary=advanceSalary;
            this.staffRoomNumber=staffRoomNumber;
            appointed=true;
            terminated=false;
        }
        else if(appointed == true)
        {
            System.out.println("The developer is already appointed.");
            System.out.printf("The name of the developer is %s \n",super.getDeveloperName());
            System.out.printf("The room number of the developer is %s \n",staffRoomNumber);
        }
     }
     /*
     * This method is for termination status of the developer
     * There is a condition that if the developer is not terminated make developer name as empty,advance salary as 0.0 
     * joining date as empty,appointed is set to false and teminated is true
     * There is a condition that if the developer is terminated give suitable note
     */
   public void teminationContact()
   {
       if(terminated==false)
       {
           super.setDeveloperName("");
           advanceSalary=0.0;
           joiningDate="";
           appointed=false;
           terminated=true;
        }
       else
       {
           System.out.println("The developer information is terminated. ");
       } 
    }
   /*
    * This method is printing the details of platform, interviewername and salary
    */
   public void printDetails()
   {
       System.out.printf("The platform of the deveoper is %s \n",super.getPlatform());
       System.out.printf("The joining interviewer name is %s \n",super.getInterViewerName());
       System.out.printf("The salary of the deveoper is %d \n",salary);  
   }
   /*
    * This method is displaying the values
    * There is a condition that when developer is not appointed it just prints platform, interviewer name,working hours and developer name
    * There is a condition that if the developer is appointed print suitable message and print joining date,salary and developer name
    */
   public void display()
   {
       super.display();
       
       if(appointed==true)
       {
           System.out.println("The Developer is appointed.\nThe details of the developer are:");
           System.out.printf("The joining date of the deveoper is %s \n",joiningDate);
           System.out.printf("The  advance salary of developer is $ %.2f \n",advanceSalary);
       }

   }
}
