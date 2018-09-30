package org.wecancodeit.Courses;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

@Repository	
@Resource
public class CourseRepository {

	private Map<Long, Course> courseList = new HashMap<>();
	
	public CourseRepository() {
		Course java = new Course(1L, "Java", "Java Description");
		Course javascript = new Course(2L, "Javascript", "Javascript Description");
		Course spring = new Course(3L, "Spring", "Spring Description");
		
		courseList.put(java.getId(), java);
		courseList.put(javascript.getId(), javascript);
		courseList.put(spring.getId(), spring);
	}
	
	//for testing purposes only
	public CourseRepository(Course...courses) {
		for(Course course : courses) {
		courseList.put(course.getId(), course);
		}
	}

	public Course findOne(long id) {
		// TODO Auto-generated method stub
		return courseList.get(id);
	}

	public Collection<Course> findAll() {
		
		return courseList.values();
	}

}
