package com.example.demo.contorller;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.demo.datasource.movieListRepository;
import com.example.demo.model.Movie.*;

@Controller
@RequestMapping("/")

public class movieListController {
 @Autowired
	private movieListRepository movieListRespository;
 @RequestMapping(method=RequestMethod.GET, value="/movies/{actor}")
     public String getMovieListByActor(@PathVariable ("actor") String name,Model model) {
		/*List<movie>movieList= new ArrayList<movie>();
		Movie movie=new Movie();
		movie.setActor("tom");
		movie.setDescription("this is action movie");
		movie.setname("misson possible");
		movie.setherione("thrisha");
		model.addAttribute("movies",movieList);*/
		List<movie>movieList=movieListRespository.findMovieByActor(name);
	
			model.addAttribute("movies",movieList);
      return "movieList";
     }
	@RequestMapping(method=RequestMethod.POST,value="/movies", consumes="application/json")
	public ResponseEntity<Object> addMovie(@RequestBody movie movie){	
	movieListRespository.save(movie);	
	return ResponseEntity.ok().build();
}
}