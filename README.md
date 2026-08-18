# 🎓 Student Management System | نظام إدارة الطلاب

A simple and efficient console-based Student Management System developed in **Java**. The application manages student records and their respective grades using parallel arrays, implementing core programming paradigms, modular functions, and robust arithmetic calculations.

مشروع نظام إدارة بيانات ودرجات الطلاب يعمل عبر موجه الأوامر (Console) ومكتوب بلغة **Java**. يعتمد على المصفوفات المتوازية (Parallel Arrays) لإدارة السجلات وإجراء العمليات الحسابية والتحقق من سعة البيانات.

---

## 🌐 Table of Contents / جدول المحتويات
- [English Documentation](#-english-documentation)
  - [Features](#-features)
  - [Technical Stack](#-technical-stack)
  - [Code Architecture](#-code-architecture)
  - [How to Run](#-how-to-run)
- [التوثيق باللغة العربية](#-التوثيق-باللغة-العربية)
  - [المميزات الرئيسية](#-المميزات-الرئيسية)
  - [التقنيات والمفاهيم المستخدمة](#-التقنيات-والمفاهيم-المستخدمة)
  - [بنية النظام](#-بنية-النظام)
  - [طريقة التشغيل](#-طريقة-التشغيل)

---

# 🇺🇸 English Documentation

## 🚀 Features
- **Dynamic Record Insertion:** Add student names and scores into the first available memory slot within fixed-size arrays.
- **Capacity & Overflow Protection:** Prevents runtime errors by alerting when array memory limits are reached.
- **Automated Record Tracking:** Dynamically counts and manages actively enrolled students.
- **Formatted Data Display:** Clearly lists all registered students alongside their corresponding grades.
- **Statistical Computation:** Computes and displays the overall class grade average while guarding against division-by-zero errors.

## 🛠️ Technical Stack & Concepts
- **Language:** Java (JDK 8+)
- **Data Structures:** Parallel Arrays (`String[]`, `int[]`)
- **Key Concepts:** Procedural Programming, Static Methods, Input Validation, Memory Bounds Checking, Clean Code Practices.

## 📂 Project Structure
```
student-management-system/
├── StudentManagementSystem.java   # Core application logic & main execution
└── README.md                      # Comprehensive bilingual project documentation
```

## 💻 How to Run

### Prerequisites
Make sure you have Java Development Kit (JDK) installed on your machine.

### Execution Steps
1. **Clone the repository:**
   ```bash
   git clone https://github.com/SILVER-C1/student-management-system.git
   cd student-management-system
   ```

2. **Compile the Java program:**
   ```bash
   javac StudentManagementSystem.java
   ```

3. **Run the application:**
   ```bash
   java StudentManagementSystem
   ```

---

# 🇸🇦 التوثيق باللغة العربية

## 📌 نظرة عامة
برنامج مبني بلغة **جافا (Java)** لإدارة بيانات الطلاب وسجلات درجاتهم الأكاديمية عبر سطر الأوامر، حيث يعتمد على مفهوم المصفوفات المتوازية لتخزين الأسماء والدرجات بشكل متناسق ومنظم.

## 🌟 المميزات الرئيسية
- **إضافة طلاب جدد:** إدراج اسم الطالب ودرجته تلقائياً في أول خانة شاغرة داخل المصفوفة.
- **الحماية من امتلاء الذاكرة:** فحص سعة المصفوفة والتنبيه في حال عدم توفر مساحة إضافية لتفادي أخطاء الحدود (`ArrayIndexOutOfBoundsException`).
- **حساب عدد الطلاب تلقائياً:** دالة مخصصة لاحتساب العدد الفعلي للطلاب المسجلين في النظام.
- **عرض تقرير شامل:** طباعة قائمة منسقة تعرض أسماء الطلاب ودرجاتهم بوضوح.
- **حساب المتوسط الحسابي:** احتساب المعدل العام لدرجات الصف بدقة مع معالجة حالة القائمة الفارغة لحماية البرنامج من القسمة على صفر.

## ⚙️ التقنيات والمفاهيم البرمجية
- **لغة البرمجة:** Java
- **هياكل البيانات:** مصفوفات متوازية (Parallel Arrays)
- **المفاهيم المطبقة:** الدوال البرمجية (Methods)، البرمجة الإجرائية، معالجة وتدقيق البيانات (Validation).

## 🚀 طريقة التشغيل

### المتطلبات الأساسية
تأكد من تثبيت حزمة تطوير جافا (JDK) على جهازك.

### خطوات التشغيل
1. **استنساخ المستودع (Clone):**
   ```bash
   git clone https://github.com/SILVER-C1/student-management-system.git
   cd student-management-system
   ```

2. **ترجمة كود الجافا (Compile):**
   ```bash
   javac StudentManagementSystem.java
   ```

3. **تشغيل البرنامج (Run):**
   ```bash
   java StudentManagementSystem
   ```

---

### 👨‍💻 Developer / المطور
- **GitHub:** [@SILVER-C1](https://github.com/SILVER-C1)
