package org.wecancodeit.Courses;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;

public class CourseRepositoryTest {

	private long firstCourseId = 1L;
	private Course firstCourse = new Course(firstCourseId, "course name", "course description");
	
	private long secondCourseId= 2L;
	private Course secondCourse = new Course(secondCourseId, "course name", "course description");
	
	@Test
	public void shouldFindACourse() {
		CourseRepository underTest = new CourseRepository(firstCourse);
		Course result = underTest.findOne(firstCourseId);
		assertThat(result, is(firstCourse));
	}
	
	@Test
	public void shouldFindASecondCourse() {
		CourseRepository underTest = new CourseRepository(secondCourse);
		Course result = underTest.findOne(secondCourseId);
		assertThat(result, is(secondCourse));
	}
	
	@Test
	public void shouldFindAllCourses() {
		CourseRepository underTest = new CourseRepository(firstCourse, secondCourse);
		Collection<Course> result = underTest.findAll();
		assertThat(result, containsInAnyOrder(firstCourse, secondCourse));
	}
	
}
