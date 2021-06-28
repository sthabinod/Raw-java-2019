
/**
 * This class inherit the Developer class
 * This class is for declaring the variable.
 * The value is initialized and accessor method is used to use the private variable outside the class.
 * The mutator method is used for changing the value of the variable outside the class. 
 * To change the value of the variable salary there is a condition.
 * Similary, the developer is appointed by passing the value in the parameter of the method
 * As this class prints the developer details as required.
 * @author (Binod Shrestha)
 * @ID: 18028893
 */
public class JuniorDeveloper extends Developer
{
    private int salary;
    private String appointedDate;
    private String evaluationPeriod;
    private String terminationDate;
    private String specialization;
    private String appointedBy;
    private boolean joined;
   
    public JuniorDeveloper(String platform,String interViewerName,double workingHrs,int salary,String appointedBy,String terminationDate)
    {
        super(platform,interViewerName,workingHrs);
        this.salary=salary;
        this.appointedDate="";
        this.evaluationPeriod="";
        this.specialization="";
        this.joined=false;
        this.appointedBy=appointedBy;
        this.terminationDate=terminationDate;    
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
     * This method is for returning when appointed date of the developer is called
     * It returns integer and alphabet value
     * It can give access to other classes when called
     */
    public String getAppointedDate()
    {
        return appointedDate;
    }
    /*
     * This method is for returning when evaluation period of the developer is called
     * It returns integer and alphabets
     * It can give access to other classes when called
     */
    public String getEvaluationPeriod()
    {
        return evaluationPeriod;
    }
    /*
     * This method is for returning when temination date of the developer is called
     * It returns alphabet and numbers
     * It can give access to other classes when called
     */
    public String getTerminationDate()
    {
        return terminationDate;
    }
    /*
     * This method is for returning when specilization of the developer is called
     * It returns numbers and aplhabet
     * It can give access to other classes when called
     */
    public String getSpecialization()
    {
        return specialization;
    }
    /*
     * This method is for returning when appointed by someone of the developer is called
     * It returns alphabet value
     * It can give access to other classes when called
     */
    public String getAppointedBy()
    {
        return appointedBy;
    }
    /*
     * This method is for returning when joined status of the developer is called
     * It returns boolean value either true or false
     * It can give access to other classes when called
     */
    public boolean getJoined()
    {
        return joined;
    }
    /*
     * This method is changing the developer salary
     * If the developer has not joined yet.The salary is assined as new salary
     * Otherwise it gives suitable message
     * 
     */
    public void setSalary(int salary)
    {
        if(joined == false)
        {
            this.salary = salary;
        }
        else
        {
            System.out.println("The developer salary cannot be changed.");
        }
    }
    /*
     * This method checking the joined status of developer
     * If the developer has joined it gives suitable message and print appointed date
     * If the developer has not joined then the developer name is assigned by calling from parent class and initilized 
     * assign value to appointed date, termination date and specialization
     * Joined status is set to true
     */
    public void appointDeveloper(String developerName, String appointedDate,String terminationDate,String specialization)
    {
        if(joined == true)
        {
            System.out.printf("Developer is already appointed and the appointed date is %s \n",appointedDate);
        }
        else
        {
            super.setDeveloperName(developerName);
            this.appointedDate=appointedDate;
            this.terminationDate=terminationDate;
            this.specialization=specialization;
            joined = true;
        }
    }
    /*
     * This method for displaying the method from parent class that is display method and others
     * If the developer is joined then it prints appointed date,developername,evaluation time,termination timee,salary,specilization and appointed by
     * If it is not joined yet it only prints display which is called from parent class
     */
    public void display()
    {
        super.display();
        
        if(joined=true)
        {
        System.out.print("The developer is joined.\n");
        System.out.print("The details of the developer are:\n");
        System.out.printf("The appointed date of the developer is %s \n",appointedDate);
        System.out.printf("The evaluation period is of the developer is %s \n",evaluationPeriod);
        System.out.printf("The termiantion period of the developer is %s \n",terminationDate);
        System.out.printf("The salary of the developer is $ %s \n",salary);
        System.out.printf("The specializaion of the developer is %s \n",specialization);
        System.out.printf("The developer is appointed by %s \n",appointedBy);
        
        }
    }
}