public class SparseTableLab {
    public static void main(String[] args) {
        SpareTable registerTable = new SpareTable(8000,300);
        registerTable.addRegistration(405,35);
        registerTable.addRegistration(405,30);
        registerTable.addRegistration(405,60);
        //System.out.println(registerTable.students[405].classId);
        registerTable.listAllClasses(405);
    }
}
