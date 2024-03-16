open class Student {

    var name:String
    var id:Int
    var program:String
    var isUndergrad: Boolean

    constructor(name: String, id:Int, program:String, isUndergrad:Boolean){
        this.name=name
        this.id=id
        this.program=program
        this.isUndergrad=isUndergrad

    }

    override fun toString(): String {
        val studentType=if(isUndergrad)
            "Undergraduate"
            else
                "Postgraduate"

        return "Student Name:${name}\n" + "Student Id:${id}\n" + "Program:${program}\n" + "studentType:${studentType}\n"
    }
}

class Course {
    var title: String
    var grade: Double

    constructor(title: String, grade: Double) {
        this.title = title
        this.grade = grade
    }
}

open class Transcript(val student: Student, val courseList: MutableList<Course>) : Student(student.name, student.id, student.program, student.isUndergrad) {

    open fun addCourse(course: Course): Boolean {
        for (existingCourse in this.courseList) {
            if (course.title == existingCourse.title) {
                println("Failure: ${course.title} already exists in list")
                return false
            }
        }


        this.courseList.add(course)
        println("Success: ${course.title} added in course list")
        return true
    }

    open fun getAverageGrade(): Double {
        var sum: Double = 0.0
        for (courseNumber in this.courseList) {
            sum += courseNumber.grade
        }
        return sum / this.courseList.size
    }

    open fun calculateOutcome(): String {
        return if (getAverageGrade() < 50.0) {
            "STATUS: Cannot proceed"
        } else {
            "STATUS: May proceed to the next semester"
        }
    }

    open fun printTranscript() {
        println(super.toString())

        for (course in this.courseList) {
            println("${course.title}: ${course.grade}/100.0")
        }
    }
}

class UndergradTranscript(student: Student, courseList: MutableList<Course>, var gpa1: Double) : Transcript(student, courseList) {

    fun calculateGPA():Double{

        if (super.courseList.isEmpty()) {
            println("Cannot calculate GPA with an empty course list")
            return 0.0
        }



        val percentage = super.getAverageGrade()

        gpa1 = if (percentage >= 90.0) {
            4.0
        } else if (percentage >= 80.0) {
            3.0
        } else if (percentage >= 70.0) {
            2.0
        } else if (percentage >= 60.0) {
            1.2
        } else {
            0.0
        }

        return gpa1

    }

    override fun calculateOutcome(): String {
        if (calculateGPA() < 2.0) {
            return  "STATUS: Failed"
        } else {
            return "STATUS: Passed"
        }
    }

    override fun printTranscript() {

        super.printTranscript()

        println("GPA: ${this.calculateGPA()}")
        println("Outcome: ${this.calculateOutcome()}")
    }
}

class PostgradTranscript(student: Student, courseList: MutableList<Course>) : Transcript(student, courseList) {

    override fun printTranscript() {
        println(super.student.toString())

        for (course in super.courseList) {
            val result = if (course.grade >= 50.0) "Passed" else "Failed"
            println("${course.title}: $result")
        }
    }
}



fun main() {
    // Create Undergraduate student

    val undergradStudent = Student("John Doe", 123, "Computer Science", true)

    // Create Postgraduate student

    val postgradStudent = Student("Jane Doe", 456, "Data Science", false)

    // Create 6 courses with grades
    val courses = mutableListOf(
        Course("Math", 72.0),
        Course("Programming", 82.0),
        Course("Statistics", 92.0),
        Course("Database", 60.0),
        Course("Machine Learning", 88.0),
        Course("Research Methods", 65.0)
    )

    // Here i am Creating the Undergraduate transcript
    val undergradTranscript = UndergradTranscript(undergradStudent, mutableListOf(), 0.0)

    // Adding 3 courses to the Undergraduate transcript
    println("---- Adding courses to Undergrad Student ----")
    undergradTranscript.addCourse(courses[0])
    undergradTranscript.addCourse(courses[1])
    undergradTranscript.addCourse(courses[2])

    // Attempt to add the same course again to demonstrate prevention
    undergradTranscript.addCourse(courses[1])

    // Creating the Postgraduate transcript now
    val postgradTranscript = PostgradTranscript(postgradStudent, mutableListOf())

    println("---- Adding courses to Postgrad Student ----")
    // Add 3 courses to the Postgraduate transcript
    postgradTranscript.addCourse(courses[3])
    postgradTranscript.addCourse(courses[4])
    postgradTranscript.addCourse(courses[5])

    // Printing out the transcripts
    println("---- Printing Undergrad Student transcript ----")
    println("Undergraduate Transcript:")
    undergradTranscript.printTranscript()


    println("---- Printing Postgrad Student transcript ----")
    println("\nPostgraduate Transcript:")
    postgradTranscript.printTranscript()
}
 