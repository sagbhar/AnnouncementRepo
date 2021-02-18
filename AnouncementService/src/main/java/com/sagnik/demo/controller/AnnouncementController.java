package com.sagnik.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sagnik.demo.model.Announcement;
import com.sagnik.demo.repo.AnnouncementRepo;


@RestController
@RequestMapping("/api")
public class AnnouncementController {

	@Autowired
	AnnouncementRepo repo;
	
	@PostMapping(value="/saveAnnouncementDetails")
	public ResponseEntity<Announcement> saveAnnouncementDetails(@RequestBody Announcement announce) {
		repo.save(announce);
		return new ResponseEntity<Announcement>(HttpStatus.CREATED);
	}
	
	@GetMapping(value="/getAnnouncementDetails")
	public List<Announcement> getAnnouncementDetails() {
		return repo.findAll();
	}
}
