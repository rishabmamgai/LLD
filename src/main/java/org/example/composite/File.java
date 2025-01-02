package org.example.composite;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class File implements FileSystem {
    private String fileName;

    @Override
    public void ls(String indent) {
        System.out.println(indent + fileName);
    }
}
