package com.blumoc.backendfcolnoz.repository;

import org.springframework.stereotype.Repository;

import com.blumoc.backendfcolnoz.entity.QCourse;

@Repository("queryDSLCourseRepository")
public class QueryDSLCourseRepository {
	
	/**
	 * Para usar los query dsl vamos a necesitar las  Q-Clases
	 * para este ejemplo vamos a usar la Clase Course y para que sea clase de tipo QCourse
	 * debemos agregarle una Q al principio, es decir : QCourse y  la misma
	 * se generara en la carpeta target de manera automatica, pero paso previo debemos tener las
	 * dependencias que se indican en la siguiente pagina
	 * 
	 * <a>http://www.querydsl.com/static/querydsl/4.1.3/reference/html_single/</a>
	 * automatico, en caso contrario, debemos abril la terminal y hacer lo siquie
	 */
	private QCourse qCourse = QCourse.course;
	
	
	public QueryDSLCourseRepository() {
		// TODO Auto-generated constructor stub
	}

}
