package za.ac.cput.project3assignment.domain;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "notification")
public class Notification {

    @Id
    private String notificationID;

    private String message;
    private Date date;
    private Date reviewDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    protected Notification() {
    }

    protected Notification(Builder builder) {
        this.notificationID = builder.notificationID;
        this.message = builder.message;
        this.date = builder.date;
        this.reviewDate = builder.reviewDate;
        this.user = builder.user;
    }

    public String getNotificationID() {
        return notificationID;
    }

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }

    public Date getReviewDate() {
        return reviewDate;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "notificationID='" + notificationID + '\'' +
                ", message='" + message + '\'' +
                ", date=" + date +
                ", reviewDate=" + reviewDate +
                ", user=" + user +
                '}';
    }

    public static class Builder {

        private String notificationID;
        private String message;
        private Date date;
        private Date reviewDate;
        private User user;

        public Builder setNotificationID(String notificationID) {
            this.notificationID = notificationID;
            return this;
        }

        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }

        public Builder setDate(Date date) {
            this.date = date;
            return this;
        }

        public Builder setReviewDate(Date reviewDate) {
            this.reviewDate = reviewDate;
            return this;
        }

        public Builder setUser(User user) {
            this.user = user;
            return this;
        }

        public Notification build() {
            return new Notification(this);
        }
    }
}