package com.coherent.unnamed.logic.repository;

import com.coherent.unnamed.logic.entity.Attendence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

public interface AttendenceRepository extends JpaRepository<Attendence,Integer> {

    @Query(value = "select * from attendence e where year(e.created_at) = :year and month(e.created_at) = :month and e.user_id_fk='1'", nativeQuery = true)
    List<Attendence> findByCreatedatYearAndMonthIn(@Param("year") int year, @Param("month") int month);

    @Query(value = "select * from attendence r where date(r.created_at)= :date and r.user_id_fk= :user_id", nativeQuery = true)
    List<Attendence> findByCreatedatDateAndUserId(Date date, int user_id);

}
