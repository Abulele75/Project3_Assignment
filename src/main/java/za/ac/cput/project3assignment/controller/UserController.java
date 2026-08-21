package za.ac.cput.project3assignment.controller;

import org.springframework.web.bind.annotation.*;
import za.ac.cput.project3assignment.domain.User;
import za.ac.cput.project3assignment.service.UserService;

import java.util.List;

/* Safiya Abdulkadir Elmi
240500598
User controller class
21/08/2026
 */

@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins = "http://localhost:5173")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User create(@RequestBody User user) {
        return userService.create(user);
    }

    @GetMapping("/{userId}")
    public User read(@PathVariable String userId) {
        return userService.read(userId);
    }

    @GetMapping
    public List<User> getAll() {
        return userService.getAll();
    }

    @PutMapping
    public User update(@RequestBody User user) {
        return userService.update(user);
    }

    @DeleteMapping("/{userId}")
    public void delete(@PathVariable String userId) {
        userService.delete(userId);
    }
}
