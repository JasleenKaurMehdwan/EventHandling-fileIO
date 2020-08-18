/*
 * Programmer:Jasleen Kaur
 * Date: 31 july,2020
 * Program: File that contain get set methods.
 */
package assignment5;

/**
 *
 * @author jasleen
 */
public class Course {
     
        private String course;
        private double AssignmentGrade, QuizGrade,FinalGrade;
        
        public Course()//default constructor
                {
                 }
        public Course(String course, double AssignmentGrade, double QuizGrade, double FinalGrade)//argument constructor
        {
            this.course=course;
            this.AssignmentGrade=AssignmentGrade;
            this.QuizGrade=QuizGrade;
            this.FinalGrade=FinalGrade;
        }
        
        public String getCourse()
        {
            return course;
        }
        
            public double getAssignment()
            {
                return AssignmentGrade;
            }
            
             public double getQuiz()
            {
                return QuizGrade;
            }
             
               
             public double getFinal()
            {
                return FinalGrade;
            }
             
       public void setCourse(String course) //set method to set the value of course
       {
        this.course = course;
    }

    public void setAssignment(double AssignmentGrade)  //set method to set the value of assignment grades
    {
        this.AssignmentGrade = AssignmentGrade;
    }

    public void setQuiz(double QuizGrade )  //set method to set the value of quiz
    {
        this.QuizGrade = QuizGrade;
    }

    public void setFinal(double FinalGrade)//set method to set the value of final marks
    {
        this.FinalGrade = FinalGrade;
    }
    public double total(double result)
    {
        result=AssignmentGrade+QuizGrade+FinalGrade;
        return result;
    }
             
 }
