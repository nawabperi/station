package com.example.myBatis.myBatisTest.Repo;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.myBatis.myBatisTest.model.Station;


@Mapper
public interface StationMyBatisRepository {
	@Select("select * from station")
	public List<Station> findAll();

	@Select("SELECT * FROM station WHERE stationId = #{stationId}")
	public Station findById(String stationId);

	@Delete("DELETE FROM station WHERE stationID = #{stationId}")
	public int deleteById(String stationId);

	@Insert("INSERT INTO station(stationId, name, hdEnabled,callSign) VALUES (#{stationId}, #{name}, #{hdEnabled},#{callSign})")
	public int insert(Station station);

	@Update("Update station set name=#{name}, hdEnabled=#{hdEnabled},callSign=#{callSign} where stationId=#{stationId}")
	public int update(Station station);

}
