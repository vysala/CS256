package ArraysOfObjects;


class Student{
        public int roll_no;
        public String name;

        // Constructor to initialize the object
        Student(int roll_no, String name) {
            this.roll_no = roll_no;
            this.name = name;
        }

        // Method to display student details
        void displayDetails() {
            System.out.println("Roll No: " + roll_no + ", Name: " + name);
        }
        
    }
    

    class StudentArrayofObjects {

        public static void main(String[] args) {
            Student[] studentArray = new Student[3]; // only creates an array capable of holding 3 Student object with max size 3. 
            //Individual objects must be created and assigned to the array elements.
            studentArray[0] = new Student(101, "Alice");
            studentArray[1] = new Student(102, "Bob");
            studentArray[2] = new Student(103, "Sam");

            //Access individual objects in the array using their index and call their methods or 
            //access their attributes.
            
                // Accessing an individual object and calling its method
                studentArray[0].displayDetails();

    // Iterating through the array using a for loop to access and call methods on all objects in the array
    for (int i = 0; i < studentArray.length; i++) {
        studentArray[i].displayDetails();
    }

    // Iterating through the array using an enhanced for loop
   /*  for (Student student : studentArray) {
        student.displayDetails();
    } */
        }
}


    