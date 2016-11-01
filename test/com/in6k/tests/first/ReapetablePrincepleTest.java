package com.in6k.tests.first;

import org.testng.annotations.Test;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ReapetablePrincepleTest {
    @Test
    public void createFile() throws Exception {
        Path path = Paths.get("/home/employee/testfile.txt");
        File file = path.toFile();

        boolean created = file.createNewFile();
        assertThat("File must not exists before.", created, is(true));

        boolean deleted = file.delete();
        assertThat("File must not exists before.", deleted, is(true));

    }


}
