package com.homeAutomation.backEnd.scene;

import com.homeAutomation.backEnd.user.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SceneMappingRepository extends JpaRepository<SceneMapping,Long>{

}


