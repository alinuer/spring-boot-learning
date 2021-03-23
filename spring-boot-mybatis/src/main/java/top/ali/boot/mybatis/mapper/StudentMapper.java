package top.ali.boot.mybatis.mapper;

import top.ali.boot.mybatis.domain.TStudent;

public interface TStudentMapper {
    int deleteByPrimaryKey(Integer studentId);

    int insert(TStudent record);

    int insertSelective(TStudent record);

    TStudent selectByPrimaryKey(Integer studentId);

    int updateByPrimaryKeySelective(TStudent record);

    int updateByPrimaryKey(TStudent record);
}