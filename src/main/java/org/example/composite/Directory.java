package org.example.composite;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
public class Directory implements FileSystem {
    private String dirName;
    private List<FileSystem> fileSystemList;

    public Directory(String dirName) {
        this.dirName = dirName;
        this.fileSystemList = new ArrayList<>();
    }

    @Override
    public void ls(String indent) {
        System.out.println(indent + dirName);

        for (FileSystem fileSystem : fileSystemList) {
            fileSystem.ls(indent + "  ");
        }
    }
}
