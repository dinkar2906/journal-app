package net.journaling.journalingapp.controller;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import net.journaling.journalingapp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
@RestController
@RequestMapping("/journal")
public class JournalEntryController {

    private Map<Long,JournalEntry>  journalEntries = new HashMap<>();

    @GetMapping
//    direct jayega journal pe get
    public List<JournalEntry> getAll(){
        return new ArrayList<>(journalEntries.values());
    }

    @PostMapping
//    journal pe post
//    journalEntries.put(myEntry.getId(),myEntry); ye kya hau

    public boolean createEntry(@RequestBody JournalEntry myEntry) {
        journalEntries.put(myEntry.getId(),myEntry);
        return true;
    }
    @GetMapping("/id/{myId}")
//    path variable and request parameter
    public JournalEntry getJournalEntryById(@PathVariable Long myId){
        return journalEntries.get(myId);
    }
    @DeleteMapping("/id/{myId}")
    public JournalEntry deleteJournalEntryById(@PathVariable Long myId){
        return journalEntries.remove(myId);
    }

    @PutMapping("/id/{id}")
    public JournalEntry updateJournalEntryById(@PathVariable Long id,
                                               @RequestBody JournalEntry myEntry) {
        return journalEntries.put(id, myEntry);
    }
}
