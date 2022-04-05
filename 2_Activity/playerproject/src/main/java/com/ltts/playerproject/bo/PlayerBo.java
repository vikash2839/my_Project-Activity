
  package com.ltts.playerproject.bo;
  
 import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Repository;

import com.ltts.playerproject.model.Player;

  
  @Repository 
  public interface PlayerBo extends JpaRepository<Player,Integer> {
  
  }
 