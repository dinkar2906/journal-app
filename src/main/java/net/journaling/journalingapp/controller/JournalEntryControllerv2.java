package net.journaling.journalingapp.controller;

import net.journaling.journalingapp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerv2 {

    @GetMapping
    public List<JournalEntry> getAll(){
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry) {
        return false;
    }
    @GetMapping("/id/{myId}")

    public JournalEntry getJournalEntryById(@PathVariable Long myId){
        return null;
    }
    @DeleteMapping("/id/{myId}")
    public JournalEntry deleteJournalEntryById(@PathVariable Long myId){
        return null;
    }

    @PutMapping("/id/{id}")
    public JournalEntry updateJournalEntryById(@PathVariable Long id,
                                               @RequestBody JournalEntry myEntry) {
        return null;

    }
}
