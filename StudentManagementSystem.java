public class StudentManagementSystem {

    // دالة إضافة طالب جديد إلى المصفوفات
    public static void addStudent(String[] students, int[] grades, String name, int grade) {
        // نمر على المصفوفة للبحث عن أول مكان فارغ (أي قيمته null)
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = name;   // إدخال الاسم
                grades[i] = grade;    // إدخال الدرجة في نفس المؤشر
                System.out.println("The student has been added: " + name);
                return; // الخروج من الدالة فور الإضافة
            }
        }
        System.out.println("The student list is full! Cannot add more students.");
    }

    public static void displayStudents(String[] students, int[] grades, int count) {
        if (count == 0) {
            System.out.println("No students have been added to the system yet.");
            return;
        }
        
        System.out.println("\n=== Student list ===");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". Name: " + students[i] + " | Grade: " + grades[i]);
        }
    }
    public static double calculateAverage(int[] grades, int count) {
    // 1. حماية من القسمة على صفر في حال عدم وجود طلاب
    if (count == 0) {
        System.out.println("No students have been added to the system yet. Cannot calculate average.");
        return 0.0;
    }

    // 2. جمع الدرجات
    int sum = 0;
    for (int i = 0; i < count; i++) {
        sum += grades[i]; // تعني: sum = sum + grades[i]
    }

    // 3. حساب المتوسط وإرجاعه
    return (double) sum / count;
}
    public static void main(String[] args) {
        // نحدد سعة المصفوفات من البداية (مثلاً تتسع لـ 10 طلاب)
        String[] students = new String[10];
        int[] grades = new int[10];

        // إدخال الأسماء والدرجات الأولى
        students[0] = "khaled";  grades[0] = 85;
        students[1] = "mohamed"; grades[1] = 90;
        students[2] = "ahmed";   grades[2] = 78;

        // استدعاء دالة الإضافة
        addStudent(students, grades, "Ali", 95);
        addStudent(students, grades, "omar", 76);
        // عرض قائمة الطلاب
        displayStudents(students, grades, 5); // 5 هو عدد الطلاب الفعلي في المصفوفة
        // حساب المتوسط
        double average = calculateAverage(grades, 5);
        System.out.println("Average grade: " + average);
    }
}
