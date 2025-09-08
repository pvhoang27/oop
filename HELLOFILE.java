import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HELLOFILE {
    public static void main(String[] args) {
        try {
            // Tạo đối tượng File trỏ tới Hello.txt
            File file = new File("Hello.txt");
            
            // Dùng Scanner để đọc nội dung từ file
            Scanner scanner = new Scanner(file);
            
            // Đọc từng dòng và in ra màn hình
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            
            // Đóng file sau khi đọc xong
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file Hello.txt!");
        }
    }
}
