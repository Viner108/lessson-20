package com.dmdev.lesson22;

import java.io.*;
import java.nio.file.Path;

public class OutputRunner {
    public static void main(String[] args) throws IOException {
        File file= Path.of("resources","output.text").toFile();
        try (BufferedOutputStream outputStream =new BufferedOutputStream(new FileOutputStream(file,true))) {
            String value="Hello, Word!";
            outputStream.write(value.getBytes());
            outputStream.write(System.lineSeparator().getBytes());
        }
    }
}
