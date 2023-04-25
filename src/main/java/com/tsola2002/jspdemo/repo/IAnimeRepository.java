package com.tsola2002.jspdemo.repo;

import com.tsola2002.jspdemo.model.Anime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAnimeRepository extends JpaRepository<Anime, Long> {

}
