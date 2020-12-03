package com.evaphoto.Service;

import com.evaphoto.Model.Feedback;
import com.evaphoto.Repository.FeedbackRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackServiceImpl implements FeedbackService{

    private final FeedbackRepo feedbackRepo;

    @Autowired
    public FeedbackServiceImpl(FeedbackRepo feedbackRepo) {
        this.feedbackRepo = feedbackRepo;
    }

    @Override
    public List<Feedback> getAllFeedbacks() {
        return this.feedbackRepo.findAll();
    }

    @Override
    public void add(Feedback feedback) {
        this.feedbackRepo.save(feedback);
    }
}
