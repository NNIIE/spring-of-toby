package user.dao;


class UserDaoTest {

    public static void main(String[] args) throws ClassNotFoundException {
        ConnectionMaker DConnectionMaker = new DConnectionMaker();
        UserDao userDaoD = new UserDao(DConnectionMaker);

        ConnectionMaker NConnectionMaker = new NConnectionMaker();
        UserDao userDaoN = new UserDao(NConnectionMaker);
    }

}