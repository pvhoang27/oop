import java.util.*;

import javax.security.auth.Subject;

// Nộp đúng 1 file này: PaymentController.java
// Giả định các lớp Student, Subject, Decision, Invoice, InvoiceView đã có trong JAR của đề.
// Hàm main do đề cung cấp sẽ gọi:
//   PaymentController pc = new PaymentController();
//   Invoice invoice = pc.getInvoice();
//   InvoiceView.show(invoice);

public class HELLOJAR {
    public Invoice getInvoice() {
        Scanner sc = new Scanner(System.in);

        // 1) Sinh viên
        String studentId = sc.nextLine().trim();     // B20DCCN001
        String studentName = sc.nextLine().trim();   // Nguyễn Văn A
        int n = Integer.parseInt(sc.nextLine().trim()); // số môn

        // 2) Danh sách môn học
        List<Subject> subjects = new ArrayList<>();
        int totalCredits = 0;
        for (int i = 0; i < n; i++) {
            String subId = sc.nextLine().trim();        // INT1155
            String subName = sc.nextLine().trim();      // Tin học cơ sở 2
            int credits = Integer.parseInt(sc.nextLine().trim()); // 2
            subjects.add(new Subject(subId, subName, credits));
            totalCredits += credits;
        }

        // 3) Quyết định & đơn giá
        String decisionCode = sc.nextLine().trim();   // QD123
        String decisionName = sc.nextLine().trim();   // QD123 HP
        double unitPrice = Double.parseDouble(sc.nextLine().trim()); // 550000

        // 4) Tính học phí
        double tuition = totalCredits * unitPrice;

        // 5) Dựng các đối tượng domain (đã có sẵn trong JAR)
        Student student = new Student(studentId, studentName);
        Decision decision = new Decision(decisionCode, decisionName, unitPrice);

        // 6) Tạo hóa đơn để main in ra
        return new Invoice(student, subjects, decision, tuition);
    }
}
