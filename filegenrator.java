import java.io.*;
import java.util.*;

class writer {
    Scanner sc = new Scanner(System.in);
    static String name;
    static String data;

    void write() throws IOException {

        System.out.println("what would you like to name your file ?");
        name = sc.nextLine();
        System.out.println("Please insert the data: ");
        data = sc.nextLine();
        FileWriter f1 = new FileWriter(name);
        f1.write(data);
        System.out.println();
        System.out.println("Your file has been created successfully ");
        System.out.println();
        f1.close();
    }
}

class reader {
    void readfromfile() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

class Deleter {
    void Delete() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String path = sc.nextLine();
        File f1 = new File(path);
        if (f1.exists()) {
            if (f1.delete()) {
                System.out.println(f1.getName() + " File deleted successfully!");
            } else {
                System.out.println("Failed to delete the file");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
}

class ListFiles {
    void folderfiles() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter directory path: ");
        String path = sc.nextLine();
        File directory = new File(path);

        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();
            System.out.println("List of files in " + path + ":");
            for (File file : files) {
                System.out.println(file.getName());
            }
        } else {
            System.out.println(path + " is not a valid directory.");
        }
    }
}

class filegenrator extends writer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        writer w = new writer();
        Deleter d = new Deleter();
        ListFiles lof = new ListFiles();
        reader r = new reader();
        int choice;
        while (true) {
            try {
                System.out.println("   Hello!! Nigga ");
                System.out.println("1. Create a file");
                System.out.println("2. See data from a file");
                System.out.println("3. Delete a file");
                System.out.println("4. Look up files from any folder");
                System.out.println("5. Exit");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        w.write();
                        break;
                    case 2:
                        System.out.println();
                        r.readfromfile();
                        System.out.println();
                        break;
                    case 3:
                        d.Delete();
                        break;
                    case 4:
                        System.out.println();
                        lof.folderfiles();
                        System.out.println();
                }
                if (choice == 5) {
                    System.out.println("Thanks for visiting");
                    break;
                }
            } catch (Exception e) {
                System.out.println("fucked up bro");
                System.out.println();
            }

        }
    }
}