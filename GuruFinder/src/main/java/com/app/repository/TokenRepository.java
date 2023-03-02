package com.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.pojos.Token;

public interface TokenRepository extends JpaRepository<Token, Long> {

	  @Query(value = "select t from Token t inner join Login l on t.login.loginId = l.loginId where l.loginId = :id and (t.expired = false or t.revoked = false)")
	  
	  List<Token> findAllValidTokenByLogin(Long id);

	  Optional<Token> findByToken(String token);
	}