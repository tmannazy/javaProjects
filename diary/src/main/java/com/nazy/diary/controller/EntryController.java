package com.nazy.diary.controller;

import com.nazy.diary.models.Entry;
import com.nazy.diary.service.EntryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/entry")
@Slf4j
public class EntryController {
    @Autowired
    EntryService entryService;

    @PostMapping("/addEntry")
    public ResponseEntity<?> addEntry(@RequestBody Entry entry) {
        try {
            var entryEnt = entryService.addEntry(entry);
            return new ResponseEntity<>(entryEnt, HttpStatus.CREATED);
        } catch (IllegalArgumentException err) {
            return new ResponseEntity<>(err.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/getEntry/{entryId}")
    public Entry getEntry(@PathVariable String entryId) {
        return entryService.getEntry(entryId);
    }

    @GetMapping("/getAllEntry")
    public List<Entry> getAllEntries(@RequestParam String search) {
        return entryService.findAllEntries(search);
    }

    @PatchMapping("/editEntry/{entryId}/{newTitle}")
    public ResponseEntity<?> editEntry(@PathVariable String entryId, @PathVariable String newTitle) {
        try {
            entryService.editEntry(entryId, newTitle);
            return new ResponseEntity<>("edited success", HttpStatus.OK);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/deleteEntry")
    public String deleteEntry(@RequestParam String entryTitle) {
        return entryService.deleteEntry(entryTitle);
    }
}
