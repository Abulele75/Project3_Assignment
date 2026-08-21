package za.ac.cput.project3assignment.service;

import org.springframework.stereotype.Service;
import za.ac.cput.project3assignment.domain.User;
import za.ac.cput.project3assignment.repository.UserRepository;

import java.util.List;

/* Safiya Abdulkadir Elmi
240500598
User service class
21/08/2026
 */

@Service
public class UserService implements IUserService{

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User create(User user) {
        if (user == null) {
            throw new NullPointerException("User cannot be null");
        }

        return userRepository.save(user);
    }

    @Override
    public User read(String userId) {
        return userRepository.findById(userId).orElse(null);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User update(User user) {
        if (user == null) {
            throw new NullPointerException("User cannot be null");
        }

        return userRepository.save(user);
    }

    @Override
    public void delete(String userId) {
        userRepository.deleteById(userId);
    }
}
