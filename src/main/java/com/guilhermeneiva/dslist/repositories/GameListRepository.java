package com.guilhermeneiva.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilhermeneiva.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
