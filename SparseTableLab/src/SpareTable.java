public class SpareTable {
    RegisterNode[] students; // list of students pointers to nodes
    RegisterNode[] classes; // list of class pointers to nodes

    public SpareTable(int amountOfStudents , int amountOfClasses) {
        students = new RegisterNode[amountOfStudents];
        classes = new RegisterNode[amountOfClasses];
    }
    public void addRegistration(int studentID , int classId){
        RegisterNode newRegis = new RegisterNode(studentID,classId,-1,null,null);

        //student dimension --> add new course to the student
        if(students[studentID] == null || // register the first time
                classId<students[studentID].classId){
                // new class will be the first class in the list of this study
            newRegis.nextClass = students[studentID];
            students[studentID] = newRegis;
        }
        else{
            RegisterNode c;
            for(c = students[studentID]; c.nextClass!=null && c.nextClass.classId < classId ;c = c.nextClass);
                newRegis.nextClass = c.nextClass;
                c.nextClass = newRegis;
        }

        // class dimension --> add new student to the class
        if(classes[classId] == null || studentID<classes[classId].studentId){
            newRegis.nextStudent = classes[classId];
            classes[classId] = newRegis;
        }
        else{
            RegisterNode s;
            for( s=classes[classId]; s.nextStudent != null && s.nextStudent.studentId<studentID; s = s.nextStudent);
                newRegis.nextStudent = s.nextStudent;
                s.nextStudent = newRegis;
        }
    }

    public void listAllClasses(int studentId){
        RegisterNode c;
        for(c = students[studentId]; c != null; c = c.nextClass){
            System.out.println(c.classId);
        }
        System.out.println(studentId);
    }
}
