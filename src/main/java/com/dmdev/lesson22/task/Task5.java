package com.dmdev.lesson22.task;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.stream.Stream;

import static java.nio.file.StandardOpenOption.*;

public class Task5 {
    public static void main(String[] args) {
        Path path=Path.of("src","main","java","com","dmdev","lesson22","task","Task4.java");
        Path result=Path.of("resources","Task4.java");
        try (Stream<String> lines=Files.lines(path);
            BufferedWriter bufferedWriter=Files.newBufferedWriter(result, APPEND, CREATE)){
            lines.map(StringBuilder::new)
                    .map(StringBuilder::reverse)
                    .forEach(line -> {
                        try {
                            bufferedWriter.write(line.toString());
                            bufferedWriter.newLine();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
