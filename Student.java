// This class get the information from the students
public class Student
{
    // Declaring the variables
    String studentFirstName = "N/A";
    String studentLastName = "N/A";
    String major = "N/A";
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



}