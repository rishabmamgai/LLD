package org.example.composite;


public class Main {
    public static void main(String[] args) {
        Directory lld = new Directory("LLD");
        Directory composite = new Directory("composite");

        lld.getFileSystemList().add(composite);
        lld.getFileSystemList().add(new File("Main.java"));

        composite.getFileSystemList().add(new File("FileSystem,java"));
        composite.getFileSystemList().add(new File("Directory.java"));
        composite.getFileSystemList().add(new File("File.java"));

        lld.ls("");
    }
}
