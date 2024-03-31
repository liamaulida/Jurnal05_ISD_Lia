import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class TodoList {
    private Queue<String> tasks;

    public TodoList() {
        this.tasks = new LinkedList<>();
    }

    public void addTask(String taskName) {
        this.tasks.add(taskName);
        System.out.println("Pekerjaan '" + taskName + "' telah ditambahkan ke dalam to-do list.");
    }

    public void completeTask() {
        if (this.tasks.isEmpty()) {
            System.out.println("To-do list sudah kosong.");
        } else {
            String completedTask = this.tasks.poll();
            System.out.println("Pekerjaan '" + completedTask + "' telah diselesaikan dan dihapus dari to-do list.");
        }
    }

    public void displayTodoList() {
        if (this.tasks.isEmpty()) {
            System.out.println("To-do list kosong.");
        } else {
            System.out.println("To-Do List:");
            for (String task : this.tasks) {
                System.out.println("- " + task);
            }
        }
    }
}

public class Challenge {
    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Pekerjaan");
            System.out.println("2. Selesaikan Pekerjaan");
            System.out.println("3. Tampilkan To-Do List");
            System.out.println("4. Keluar");

            System.out.print("Masukkan pilihan Anda: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan nama pekerjaan yang harus dilakukan: ");
                    scanner.nextLine(); // Consume newline character
                    String taskName = scanner.nextLine();
                    todoList.addTask(taskName);
                    break;
                case 2:
                    todoList.completeTask();
                    break;
                case 3:
                    todoList.displayTodoList();
                    break;
                case 4:
                    System.out.println("Terima kasih! Sampai jumpa lagi.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan masukkan angka 1-4.");
            }
        }
    }
}
