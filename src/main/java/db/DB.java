package db;

import org.sql2o.*;

public class DB {
    public static Sql2o sql2o = new Sql2o("jdbc:postgresql://localhost:5432/newsportal", "moringa", "0987654321");
}
