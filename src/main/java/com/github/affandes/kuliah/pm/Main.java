import java.util.Scanner;
import java.util.Stack;

public class BrowserHistory {
    private Stack<String> history;

    public BrowserHistory() {
        history = new Stack<>();
    }

    // Menambahkan URL ke riwayat (push ke stack)
    public void addUrl(String url) {
        history.push(url);
    }

    // Menampilkan semua riwayat (dari bawah ke atas stack, yaitu dari terlama ke terbaru)
    public void displayHistory() {
        if (history.isEmpty()) {
            System.out.println("Riwayat kosong.");
        } else {
            System.out.println("Riwayat Browser (dari terlama ke terbaru):");
            for (int i = 0; i < history.size(); i++) {
                System.out.println((i + 1) + ". " + history.get(i));
            }
        }
    }

    // Menghapus riwayat terakhir (pop dari stack)
    public void removeLast() {
        if (!history.isEmpty()) {
            String removed = history.pop();
            System.out.println("Riwayat terakhir dihapus: " + removed);
        } else {
            System.out.println("Tidak ada riwayat untuk dihapus.");
        }
    }

    // Mencari URL dalam riwayat
    public boolean searchUrl(String url) {
        return history.contains(url);
    }

    // Melihat URL terakhir tanpa menghapus (peek)
    public void peekLast() {
        if (!history.isEmpty()) {
            System.out.println("URL terakhir: " + history.peek());
        } else {
            System.out.println("Riwayat kosong.");
        }
    }

    public static void main(String[] args) {
        BrowserHistory bh = new BrowserHistory();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu Riwayat Browser:");
            System.out.println("1. Tambah URL");
            System.out.println("2. Tampilkan Riwayat");
            System.out.println("3. Hapus Riwayat Terakhir");
            System.out.println("4. Cari URL");
            System.out.println("5. Lihat URL Terakhir");
            System.out.println("6. Keluar");
            System.out.print("Pilih opsi: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            switch (choice) {
                case 1:
                    System.out.print("Masukkan URL: ");
                    String url = scanner.nextLine();
                    bh.addUrl(url);
                    break;
                case 2:
                    bh.displayHistory();
                    break;
                case 3:
                    bh.removeLast();
                    break;
                case 4:
                    System.out.print("Masukkan URL untuk dicari: ");
                    String search = scanner.nextLine();
                    if (bh.searchUrl(search)) {
                        System.out.println("URL ditemukan dalam riwayat.");
                    } else {
                        System.out.println("URL tidak ditemukan.");
                    }
                    break;
                case 5:
                    bh.peekLast();
                    break;
                case 6:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Opsi tidak valid.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
