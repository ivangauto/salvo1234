package com.codeoftheweb.salvo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;





@RepositoryRestResource
public interface ScoreRepository extends JpaRepository<Score, Long> {
    //    List<Player> findByPlayerJoinDate(String playerJoinDate);
//    GamePlayer findByPlayerId(long id);
    GamePlayer findById(long id);
}