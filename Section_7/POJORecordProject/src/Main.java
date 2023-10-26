public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            // Using a POJO
//            Student s = new Student("S92300" + i,
//                    switch (i) {
//                        case 0 -> "Mery";
//                        case 1 -> "Carol";
//                        case 2 -> "Tim";
//                        case 3 -> "Harry";
//                        case 4 -> "Lisa";
//                        default -> "Anonymous";
//                    },
//                    "05/11/1985", "Java Masterclass");
            // Using a Record
            LPAStudent s = new LPAStudent("S92300" + i,
                    switch (i) {
                        case 0 -> "Mery";
                        case 1 -> "Carol";
                        case 2 -> "Tim";
                        case 3 -> "Harry";
                        case 4 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "05/11/1985", "Java Masterclass");
            System.out.println(s); // will have the toString method implicitly called if it has
            // been created in the class.
        }
        Student pojoStudent = new Student("S923006", "Ann", "05/11/1985",
                "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("S923007", "Bill",
                "06/11/1989", "Java Masterclass");
        System.out.println(pojoStudent);
        System.out.println(recordStudent);
        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());
        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
        // Records are immutable so don't have ant setters or way to modify the data after it has
        // been assigned
//        recordStudent.setClassList(recordStudent.classList() + ", Java OCP Exam 829");
        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());

    }
}