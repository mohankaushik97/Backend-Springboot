package com.homeAutomation.backEnd.scene;

import com.homeAutomation.backEnd.user.Users;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SceneMappingService {

    private final SceneMappingRepository sceneMappingRepository;

    public SceneMappingService(SceneMappingRepository sceneMappingRepository) {
        this.sceneMappingRepository = sceneMappingRepository;
    }

    public List<SceneMapping> getScenes(){
        return sceneMappingRepository.findAll();
    }

    public void addNewScene(Users users) {

    }
}
