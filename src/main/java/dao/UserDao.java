package dao;

/**
 * Created by lenovo on 2016/10/05.
 */
public class UserDao {

    public void add() {
        System.out.println("用户添加方法");
    }

    public int delete() {
        System.out.println("用户删除方法");
        return 1;
    }

    public void update() {
        System.out.println("用户更新方法");
    }

    public void get() {
        System.out.println("用户查询方法");
        //int i = 1 / 0;
    }
}
