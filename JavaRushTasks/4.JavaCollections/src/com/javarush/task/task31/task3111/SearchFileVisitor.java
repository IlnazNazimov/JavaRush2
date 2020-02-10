package com.javarush.task.task31.task3111;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class SearchFileVisitor extends SimpleFileVisitor<Path> {
    private String partOfName = "";
    private String partOfContent = "";
    private int minSize = 0;
    private int maxSize = Integer.MAX_VALUE;
    private List<Path> foundFiles = new ArrayList<>();

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        byte[] content = Files.readAllBytes(file); // размер файла: content.length
        String s = new String(content);
        if (s.contains(partOfContent) & file.toString().contains(partOfName) & content.length>=minSize & content.length<=maxSize)
            foundFiles.add(file);
        return super.visitFile(file, attrs);
    }

    public void setPartOfName(String PartOfName) {
        this.partOfName = PartOfName;
    }

    public void setPartOfContent(String PartOfContent) {
        this.partOfContent = PartOfContent;
    }

    public void setMinSize(int MinSize) {
        this.minSize = MinSize;
    }

    public void setMaxSize(int MaxSize) {
        this.maxSize = MaxSize;
    }

    public List<Path> getFoundFiles() {
         return this.foundFiles;
    }
}
