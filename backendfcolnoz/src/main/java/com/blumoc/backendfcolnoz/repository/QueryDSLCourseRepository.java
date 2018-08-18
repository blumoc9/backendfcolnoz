package com.blumoc.backendfcolnoz.repository;

import org.springframework.stereotype.Repository;

import com.blumoc.backendfcolnoz.entity.QCourse;

@Repository("queryDSLCourseRepository")
public class QueryDSLCourseRepository {
	
	/**
	 * Para usar los query dsl vamos a necesitar las clases Q
	 * para este ejemplo vamos a usar la Clase Course y para que sea clase de tipo Course
	 * debemos agregarle una Q al principio, es decir : QCourse y generara en la carpeta target la clase q course
	 * automatico, en caso contrario, debemos abril la terminal y hacer lo siquie
	 */
	private QCourse qCourse = QCourse.course;
	
	
	public QueryDSLCourseRepository() {
		// TODO Auto-generated constructor stub
	}

}
