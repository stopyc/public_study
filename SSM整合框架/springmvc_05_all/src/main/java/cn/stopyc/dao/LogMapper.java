package cn.stopyc.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface LogMapper {

    @Insert("insert into t_log (`out`,`in`,money) values (#{out},#{in},#{money})")
    void log(@Param("out") String out, @Param("in") String in, @Param("money") double money);
}
