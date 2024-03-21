import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        Queue<String> toDoList = new LinkedList<>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("===== TO-DO LIST =====");
            System.out.println("1. Tambah pekerjaan");
            System.out.println("2. Tampilkan pekerjaan yang harus diselesaikan");
            System.out.println("3. Hapus pekerjaan yang sudah diselesaikan");
            System.out.println("4. Tampilkan seluruh isi to-do list");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");

            int choice = input.nextInt();
            input.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Masukkan nama pekerjaan: ");
                    String task = input.nextLine();
                    toDoList.offer(task); // Menambahkan ke rear
                    System.out.println("Pekerjaan berhasil ditambahkan.");
                    break;
                case 2:
                    if (!toDoList.isEmpty()) {
                        System.out.println("Pekerjaan yang harus diselesaikan terlebih dahulu: " + toDoList.peek()); // Menampilkan front
                    } else {
                        System.out.println("Tidak ada pekerjaan yang harus diselesaikan.");
                    }
                    break;
                case 3:
                    if (!toDoList.isEmpty()) {
                        String completedTask = toDoList.poll(); // Menghapus dari front
                        System.out.println("Pekerjaan '" + completedTask + "' telah diselesaikan dan dihapus dari to-do list.");
                    } else {
                        System.out.println("Tidak ada pekerjaan yang harus diselesaikan.");
                    }
                    break;
                case 4:
                    if (!toDoList.isEmpty()) {
                        System.out.println("Isi to-do list:");
                        for (String item : toDoList) {
                            System.out.println("- " + item);
                        }
                    } else {
                        System.out.println("To-do list kosong.");
                    }
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan aplikasi to-do list.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang sesuai.");
            }
        }
    }
}
