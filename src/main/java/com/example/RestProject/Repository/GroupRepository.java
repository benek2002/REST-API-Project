package com.example.Rest_lab_09.Repository;

import com.example.Rest_lab_09.Groups;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<Groups, Integer> {
}
