package oc.projet3.chatop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import oc.projet3.chatop.model.DBUser;

public interface DBUserRepository extends JpaRepository<DBUser, Integer> {
	public DBUser findByEmail(String email);
}