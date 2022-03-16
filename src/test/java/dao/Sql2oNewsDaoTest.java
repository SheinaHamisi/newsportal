package dao;

import models.*;
import org.junit.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Sql2oNewsDaoTest {
    private static Sql2oDepartmentDao deptDao = new Sql2oDepartmentDao();
    private static Sql2oNewsDao newsDao = new Sql2oNewsDao();
    private static Sql2oEmployeeDao userDao = new Sql2oEmployeeDao();

    @Test
    public void news_saveNewsToDatabase() {
        News news1 = new News("News1", "My description 1");
        newsDao.add(news1);
        News news2 = new News("News2", "My Description 2");
        newsDao.add(news2);
        assertEquals(news1, newsDao.allDepartmentsNews().contains(news1));
    }
}
