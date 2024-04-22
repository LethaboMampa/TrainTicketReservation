package Service;

import Entity.Notification;

import java.util.List;

public interface NotificationService {
    Notification createNotification(Notification notification);
    List<Notification> getNotificationsByUserId(Long userId);
}
