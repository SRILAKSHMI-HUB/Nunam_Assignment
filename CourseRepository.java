package com.example.demo;

import com.example.testing_001.model.Course;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

	void deleteById(long id);

	List<Course> findAll1();

	Optional<Course> findById(long id);

	List<Course> findAll();

	void save(Course course);

}
