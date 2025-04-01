package com.jsp.springboot.actordb.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.springboot.actordb.Iservice.IActorService;
import com.jsp.springboot.actordb.entity.Actor;
import com.jsp.springboot.actordb.repository.ActorRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ActorServiceImpl implements IActorService {

	@Autowired
	private ActorRepository carRepository;

	public Actor addActor(Actor a) {

		return carRepository.save(a);

	}

	@Override
	public List<Actor> findAllAcotrs() {
		List<Actor> actorList = carRepository.findAll();
		return actorList.isEmpty() ? null : actorList;
	}

	@Override
	public Actor findById(int actorId) {
		Optional<Actor> optional = carRepository.findById(actorId);
			return optional.get();

	}

	@Override
	public Actor deleteById(int actorId) {
	Optional<Actor> optional = carRepository.findById(actorId);
	if (optional.isEmpty()){
		return null;
	}else{
		carRepository.delete(optional.get());
	}

	return optional.get();
	}

	@Override
	public Actor updateById(int actorId, Actor updateActor) {
		Optional<Actor> optional = carRepository.findById(actorId);

		if (optional.isEmpty()) {
			return null;
		} else {
			Actor Exisitingactor = optional.get();
			updateActor.setActorId(Exisitingactor.getActorId());
			return carRepository.save(updateActor);
		}
	}

}
