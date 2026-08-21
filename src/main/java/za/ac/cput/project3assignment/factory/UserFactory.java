package za.ac.cput.project3assignment.factory;

import za.ac.cput.project3assignment.domain.User;

/* Safiya Abdulkadir Elmi
240500598
User factory class
21/08/2026
 */

public class UserFactory {
    public static User createUser(
            String userId,
            String firstName,
            String lastName,
            String email,
            String password,
            String role)
    {

        return new User.Builder()
                .setUserId(userId)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setPassword(password)
                .setRole(role)
                .build();
    }
}
