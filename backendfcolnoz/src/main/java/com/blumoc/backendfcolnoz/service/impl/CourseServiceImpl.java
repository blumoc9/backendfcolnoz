package com.blumoc.backendfcolnoz.service.impl;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.blumoc.backendfcolnoz.entity.Course;
import com.blumoc.backendfcolnoz.repository.CourseJpaRepository;
import com.blumoc.backendfcolnoz.service.CourseService;



/**
 * 
 * @author fcolnoz9
 *
 */
@Service("courseServiceImpl")
public class CourseServiceImpl implements CourseService ,Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final Log LOG = LogFactory.getLog(CourseServiceImpl.class);

	@Autowired
	@Qualifier("courseJpaRepository")
	private CourseJpaRepository courseJpaRepository;
	
	public CourseServiceImpl() {

	}

	@Override
	public List<Course> listAllCourses() {
		LOG.info("CALL SERVICE CourseServiceImpl METHOD: listAllCourses()");
		return courseJpaRepository.findAll();
	}

	@Override
	public Course addCourse(Course course) {
		LOG.info("CALL SERVICE CourseServiceImpl METHOD: addCourse()");
		return courseJpaRepository.save(course);
	}

	@Override
	public Long removeCourse(Long id) {
		LOG.info("CALL SERVICE CourseServiceImpl METHOD: removeCourse()");
		courseJpaRepository.deleteById(id);
		return 0L;
	}

	@Override
	public Course updateCourse(Course course) {
		LOG.info("CALL SERVICE CourseServiceImpl METHOD: updateCourse()");
		return courseJpaRepository.save(course);
	}

}
