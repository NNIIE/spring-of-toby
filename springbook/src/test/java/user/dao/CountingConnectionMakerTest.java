package user.dao;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

class CountingConnectionMakerTest {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CountingDaoFactory.class);
        UserDao userDao = context.getBean("userDao", UserDao.class);

        CountingConnectionMaker ccm = context.getBean("connectionMaker", CountingConnectionMaker.class);
        System.out.println("Connection counter : " + ccm.getCount());
    }

}