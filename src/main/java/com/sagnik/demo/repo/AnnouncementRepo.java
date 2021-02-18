package com.sagnik.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sagnik.demo.model.Announcement;

@Repository
public interface AnnouncementRepo extends JpaRepository<Announcement,String>{


	

}
