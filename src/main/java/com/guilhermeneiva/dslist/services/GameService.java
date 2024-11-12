package com.guilhermeneiva.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guilhermeneiva.dslist.dto.GameDTO;
import com.guilhermeneiva.dslist.dto.GameMinDTO;
import com.guilhermeneiva.dslist.entities.Game;
import com.guilhermeneiva.dslist.repositories.GameRepository;

import jakarta.transaction.Transactional;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;

	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		GameDTO dto = new GameDTO(result);
		return dto;
	}

	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
}