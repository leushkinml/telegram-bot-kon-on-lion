package com.michael.telegrambotkononlion.repository;

import com.michael.telegrambotkononlion.entity.NotificationTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface NotificationTaskRepository extends JpaRepository<NotificationTask, Long> {

    List<NotificationTask> findNotificationTasksByNotificationDateTime(LocalDateTime localDateTime);
}
