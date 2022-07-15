package person.otj.dao;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import person.otj.pojo.Student;
@Repository
@Mapper
public interface StudentMapper extends BaseMapper<Student>{}