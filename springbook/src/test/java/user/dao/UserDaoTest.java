package user.dao;


class UserDaoTest {

    public static void main(String[] args) throws ClassNotFoundException {
        UserDao dao = new DaoFactory().userDao();
    }

}