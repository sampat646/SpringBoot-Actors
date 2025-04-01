package com.jsp.springboot.actordb.Iservice;

import com.jsp.springboot.actordb.entity.Actor;

import java.util.List;

public interface IActorService {
	public Actor addActor(Actor a);

	public List<Actor> findAllAcotrs();

	public Actor findById(int actorId);

	public Actor deleteById(int actorId);

	public Actor updateById(int actorId, Actor updateActor);
}
