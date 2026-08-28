package za.ac.cput.project3assignment.service;

import za.ac.cput.project3assignment.domain.User;

import java.util.List;

/* Safiya Abdulkadir Elmi
240500598
User service class
21/08/2026
 */

public interface IUserService {
    User create(User user);
    User read(String userId);
    List<User> getAll();
    User update(User user);
    void delete(String userId);
}
