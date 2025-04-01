package com.jsp.springboot.actordb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.jsp.springboot.actordb.entity.Actor;
import com.jsp.springboot.actordb.serviceimpl.ActorServiceImpl;
import com.jsp.springboot.actordb.utility.ResponseStructure;

import java.util.List;

//@Controller
//@ResponseBody Instead of this both annotations we will use
//@CrossOrigin(origins = "http://localhost:5501/Actors/index.html")
@RestController
@RequestMapping("/actors")
public class ActorController {

	@Autowired
	private ActorServiceImpl actorServiceImpl;

//	@RequestMapping(value = "/addActor", method = RequestMethod.POST)
	@PostMapping
	public ResponseEntity<ResponseStructure<Actor>> addActor(@RequestBody Actor a) {
		Actor actor = actorServiceImpl.addActor(a);

		ResponseStructure<Actor> rs = new ResponseStructure<Actor>();
		rs.setStatuscode(HttpStatus.CREATED.value());
		rs.setMessage("Actor object created");
		rs.setData(actor);

		return new ResponseEntity<ResponseStructure<Actor>>(rs, HttpStatus.CREATED);
	}

//	@RequestMapping(value = "/findAllActors" , method = RequestMethod.GET)
	@GetMapping
	public ResponseEntity<ResponseStructure<List<Actor>>> findAllActors() {
	List<Actor> actors = actorServiceImpl.findAllAcotrs();

	ResponseStructure<List<Actor>> rs = new ResponseStructure<List<Actor>>();
	rs.setStatuscode(HttpStatus.OK.value());
	rs.setMessage("Actors found");
	rs.setData(actors);

	return new ResponseEntity<ResponseStructure<List<Actor>>>(rs, HttpStatus.OK);
}

//	@RequestMapping(value = "/findById" , method = RequestMethod.GET)
@GetMapping("/id")
public ResponseEntity<ResponseStructure<Actor>> findById(@RequestParam int actorId) {
	Actor actor = actorServiceImpl.findById(actorId);

	ResponseStructure<Actor> rs = new ResponseStructure<Actor>();
	rs.setStatuscode(HttpStatus.FOUND.value());
	rs.setMessage("Actor object Found");
	rs.setData(actor);

	return new ResponseEntity<ResponseStructure<Actor>>(rs, HttpStatus.FOUND);
}

//	@RequestMapping(value = "/deleteById" , method = RequestMethod.DELETE)
	@DeleteMapping("/id")
	public ResponseEntity<ResponseStructure<Actor>> deleteById(@RequestParam int actorId) {
		Actor actor = actorServiceImpl.deleteById(actorId);
		ResponseStructure<Actor> rs = new ResponseStructure<Actor>();
		rs.setStatuscode(HttpStatus.FOUND.value());
		rs.setMessage("Actor object Deleted");
		rs.setData(actor);
		
		return new ResponseEntity<ResponseStructure<Actor>>(rs, HttpStatus.FOUND);
	}

//	@RequestMapping(value = "/updateById" , method = RequestMethod.PUT)
	@PutMapping("/id")
	public ResponseEntity<ResponseStructure<Actor>>  updatedById(int actorId, @RequestBody Actor updateActor) {
		Actor actor = actorServiceImpl.updateById(actorId, updateActor);
		ResponseStructure<Actor> rs = new ResponseStructure<Actor>();
		rs.setStatuscode(HttpStatus.ACCEPTED.value());
		rs.setMessage("Actor object Updated");
		rs.setData(actor);

		return new ResponseEntity<ResponseStructure<Actor>>(rs, HttpStatus.ACCEPTED);

	}

}
