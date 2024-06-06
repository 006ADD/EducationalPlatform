package com.example.demo.Repository;

import com.example.demo.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
     List<Course> findByTitleWithPrefix(String prefix);
     // {
//        return courseMap.values()
//                .stream()
//                .filter(course -> course.getTitle().startsWith(prefix))
//                .collect(Collectors.toList());
//    }
}
