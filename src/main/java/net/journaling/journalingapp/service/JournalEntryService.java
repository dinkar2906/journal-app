package net.journaling.journalingapp.service;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryService extends MongoRepository {
    
}

// controler ------> service -------> repository