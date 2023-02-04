package com.gianca1994.aowebbackend.resources.quest;

import com.gianca1994.aowebbackend.exception.Conflict;
import com.gianca1994.aowebbackend.resources.jwt.AuthController;
import com.gianca1994.aowebbackend.resources.user.User;
import com.gianca1994.aowebbackend.resources.user.UserRepository;
import com.gianca1994.aowebbackend.resources.user.dto.request.UserRegisterDTO;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class QuestServiceTest {

    @Autowired
    private UserRepository userRepository;


    @Autowired
    private QuestRepository questRepository;


    @Autowired
    private AuthController authController;

    private User userTest;

    @BeforeEach
    void setUp() throws Conflict {
        questRepository.deleteAll();

        if (userRepository.findAll().size() >= 1) {
            userTest = userRepository.findAll().get(0);
        } else {
            UserRegisterDTO userDTO = new UserRegisterDTO();
            userDTO.setUsername("testusername");
            userDTO.setPassword("test");
            userDTO.setEmail("test@test.com");
            userDTO.setClassName("test");

            authController.saveUser(userDTO);
            userTest = userRepository.findByUsername("testusername");
        }

        questRepository.save(
                new Quest(
                        "testquest",
                        "testquestdescription",
                        "testnpc",
                        1,
                        1,
                        1,
                        1,
                        (short) 1
                )
        );
    }

}