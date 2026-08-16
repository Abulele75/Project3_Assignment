/*
Imaan Achmat
230458971
*/
package za.ac.cput.project3assignment.factory;

import za.ac.cput.project3assignment.domain.Notification;
import za.ac.cput.project3assignment.domain.User;
import java.util.Date;

public class NotificationFactory {

    public static Notification createNotification(String notificationID, String message, Date date, Date reviewDate, User user) {

        return new Notification.Builder()
                .setNotificationID(notificationID)
                .setMessage(message)
                .setDate(date)
                .setReviewDate(reviewDate)
                .setUser(user)
                .build();
    }
}
