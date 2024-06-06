package com.example.demo.Service;



import com.example.demo.DTO.CourseRequestToCreate;
import com.example.demo.DTO.CourseRequestToUpdate;
import com.example.demo.Exception.CourseNotFoundException;
import com.example.demo.Model.Course;
import com.example.demo.Repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CourseService {
    private final CourseRepository courseRepository;

    public List<Course> findAll(){
        return courseRepository.findAll();
    }

    public Course findById(long id){
        return courseRepository.findById(id).orElse(null);
    }

    public Course updateCourse(Long id, Course course) {
        Optional<Course> existingCourseOpt = courseRepository.findById(id);
        if (existingCourseOpt.isPresent()) {
            Course existingCourse = existingCourseOpt.get();
            existingCourse.setAuthor(course.getAuthor());
            existingCourse.setTitle(course.getTitle());
            return courseRepository.save(existingCourse);
        } else {
            throw new CourseNotFoundException("Course with ID " + id + " not found");
        }
    }

    public List<Course> findByTitleWithPrefix(String titlePrefix){
        return courseRepository.findByTitleWithPrefix(titlePrefix);
    }

    public Course createCourse(Course request){
        return courseRepository.save(request);
    }

    public void deleteCourse(Long id) {
        if (courseRepository.existsById(id)) {
            courseRepository.deleteById(id);
        } else {
            throw new CourseNotFoundException("Course with ID " + id + " not found");
        }
    }
}