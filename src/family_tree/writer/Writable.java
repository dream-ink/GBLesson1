package family_tree.writer;

import java.io.*;

public interface Writable {
    void save(Serializable serializable, String filePath);

    Object read(String filePath);
}