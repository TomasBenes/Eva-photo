package com.evaphoto.Service;

import com.evaphoto.Model.Feedback;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FeedbackService {
    List<Feedback> getAllFeedbacks();

    void add(Feedback feedback);
}
