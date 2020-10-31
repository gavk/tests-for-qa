package ru.gavk.samson.task2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

@TestMethodInfo(priority = Priority.Critical, author = "Test user", lastModified = "20.08.2019")
public class testClass {
    @Test
    public void annotation() {
        if (this.getClass().isAnnotationPresent(TestMethodInfo.class)) {
            TestMethodInfo annotation = this.getClass().getAnnotation(TestMethodInfo.class);
            System.out.printf("Priority: '%s', author: '%s', lastModified: '%s'.\n",
                    annotation.priority(),
                    annotation.author(),
                    annotation.lastModified()
            );

        }
        assertEquals(1, 1);
    }
}
