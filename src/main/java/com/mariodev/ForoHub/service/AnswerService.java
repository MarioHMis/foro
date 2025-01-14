package com.mariodev.ForoHub.service;

import com.mariodev.ForoHub.model.Answer;
import com.mariodev.ForoHub.repository.AnswerRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AnswerService {
    private final AnswerRepository replyRepository;

    public AnswerService(AnswerRepository replyRepository) {
        this.replyRepository = replyRepository;
    }

    public Answer createReply(Answer reply) {
        return replyRepository.save(reply);
    }

    public Optional<Answer> getReplyById(Long id) {
        return replyRepository.findById(id);
    }
}
