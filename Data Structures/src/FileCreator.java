import java.io.*;
import java.nio.file.*;
import java.util.Random;

public class FileCreator {
    public static void main(String[] args) {
        // Set the directory path for file creation
        String targetDirectory = "D:\\Java\\practice problem";
        int numberOfFiles = 1; // Specify how many files to create

        // Create the directory if it doesn't exist
        Path dirPath = Paths.get(targetDirectory);
        if (!Files.exists(dirPath)) {
            try {
                Files.createDirectories(dirPath);
                System.out.println("Created directory: " + dirPath.toAbsolutePath());
            } catch (IOException e) {
                System.err.println("Failed to create directory: " + e.getMessage());
                return;
            }
        }

        // Generate the random files
        for (int i = 0; i < numberOfFiles; i++) {
            createFile(targetDirectory, i);
        }

        System.out.println("Finished creating " + numberOfFiles + " files in " + targetDirectory);
    }

    private static void createFile(String directory, int fileNumber) {
        String fileName = "file_" + fileNumber + ".txt";
        Path filePath = Paths.get(directory, fileName);
        try (BufferedWriter writer = Files.newBufferedWriter(filePath)) {
            // Generate some example content for the file
            String content = generateRandomContent(100); // 100 characters of random content
            writer.write(content);
            System.out.println("Created file: " + filePath.toAbsolutePath());
        } catch (IOException e) {
            System.err.println("Failed to create file: " + filePath + " - " + e.getMessage());
        }
    }

    private static String generateRandomContent(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder content = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            content.append(characters.charAt(random.nextInt(characters.length())));
        }
        return content.toString();
    }
}
