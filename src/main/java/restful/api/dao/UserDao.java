package restful.api.dao;

import restful.api.beans.User;

public interface UserDao {

    public User createUser(User user);

    public User getUser(String userId);

    public User updateUser(User user);

    public void deleteUser(User user);
}
