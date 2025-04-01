package com.jsp.springboot.actordb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.springboot.actordb.entity.Actor;

public interface ActorRepository extends JpaRepository<Actor, Integer>{

}
