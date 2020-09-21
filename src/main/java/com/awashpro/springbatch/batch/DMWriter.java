package com.awashpro.springbatch.batch;

import com.awashpro.springbatch.model.User;
import com.awashpro.springbatch.repository.UserRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public class DMWriter implements ItemWriter<User> {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void write(List<? extends User> users) throws Exception {

        System.out.println("Data saved for Users: " + users);
        userRepository.save(users);
    }
}
