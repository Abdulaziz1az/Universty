// This class get the information from the students
public class Student
{
    // Declaring the variables
    String studentFirstName = "N/A";
    String studentLastName = "N/A";
    String major = "N/A";
    int age = -1;
    int year = -1; 
    String startId = "N/A";

    // gets and sets 

    // gets the first first name
    public String getStudentFirstName()
    {
        return studentFirstName;
    }

    // gets the last name 
    public String getStudentLastName()
    {
        return studentLastName;
    }

    // gets the major
    public String getMajor()
    {
        return major;
    }

    // gets the student Age
    public int getAge()
    {
        return age;
    }

    // gets the year
    public int getYear()
    {
        return year;
    }

    // gets the star id
    public String getStarId()
    {
        return startId;
    }

    public void setStudentFirstName(String StudentFristName)
    // sets the student first name
    {
        this.studentFirstName = StudentFristName;
    }

    public void setStudentLastName(String StudentLastName)
    {
        // set the student last name
        this.studentLastName = StudentLastName;
    }

    public void setMajor(String Major)
    {
        // sets the major
        this.major = Major;
    }

    public void setAge(int Age)
    {
        // sets the age
        this.age = Age;
    }

    public void setYear(int Year)
    {
        // sets the year
        this.year = Year;
    }

    public void setStarId(String StarId)
    {
        // sets the star id
        this.startId = StarId;
    }

    // Constructors empty and full
    public  Student()
    {

    }

    public  Student(String AStudentFirstName, String AStudentLastName, String AMajor, int AAGE, int AYear, String AStarId )
    {
        studentFirstName = AStudentFirstName;
        studentLastName = AStudentLastName;
        major = AMajor;
        age = AAGE;
        year = AYear;
        startId = AStarId;
    }



}