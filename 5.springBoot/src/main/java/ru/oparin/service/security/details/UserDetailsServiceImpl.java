package ru.oparin.service.security.details;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.oparin.service.models.User;
import ru.oparin.service.repositories.UsersRepository;

import java.util.Optional;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        Optional<User> userCandidate = usersRepository.findOneByLogin(login);

        return new
                UserDetailsImpl(usersRepository.findOneByLogin(login)
                .orElseThrow(IllegalArgumentException::new));
    }
}
