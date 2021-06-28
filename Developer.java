/**
 * The developer class is about the declaring the variable and assigning them.
 * The accessor method is made to access the variable outside the class.
 * In some cases there is use of mutator method to change the value outside the class.
 * This class display all the details of the developer.
 * @author (Binod Shrestha)
 * @ID: 18028893
 */
public class Developer
{   
    private String platform;
    private String interViewerName;  
    private String developerName;
    private double workingHrs;  
    
    public Developer(String platform,String interViewerName,double workingHrs)
    {   
        this.platform=platform;             
        this.interViewerName=interViewerName; 
        this.developerName="";
        this.workingHrs=workingHrs;
    }
    /*
     * This method is for returning when developer Name is called
     * It returns alpahbet and numbers
     * It can give access to other classes when called
     */
    public String getDeveloperName()
    {
        return developerName;   
    }
    /*
     * This method is for returning when interViewer Name is called
     * It returns alphabet and numbers
     * It can give access to other classes when called
     */
    public String getInterViewerName()
    {
        return interViewerName;   
    }
    /*
     * This method is for returning when platform of the developer is called
     * It returns alphabet and numbers
     * It can give access to other classes when called
     */
    public String getPlatform()
    {
        return platform;   
    }
    /*
     * This method is for returning when working hours of the developer is called
     * It returns fractional value
     * It can give access to other classes when called
     */
    public double getWorkingHrs()
    {
        return workingHrs;   
    }
    /*
     * This method is changing name of the developer when this method is called to another class
     * It can change numbers and alphabets
     * It can change the value when called from another class
     * It has parameter as string value
     */
    public void setDeveloperName(String developerName)
    {
        this.developerName=developerName;   
    }
    /*
     * This method is displaying all the values of the variables
     * The platform, interviewer name and working hours is displayed
     * if the developer name does not have empty string it will print developer name
     */
    public void display()
    {
        System.out.printf("The platform is %s \n",platform);
        System.out.printf("The interviewer name is %s \n",interViewerName); 
        System.out.printf("Working hours of the developer is %.2f \n",workingHrs);
        
        if(!developerName.equals(""))
        {
            System.out.printf("The name of the developer is %s \n",developerName);
        }
    }
    
}
