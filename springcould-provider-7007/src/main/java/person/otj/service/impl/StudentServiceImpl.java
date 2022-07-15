package person.otj.service.impl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import person.otj.dao.StudentMapper;
import person.otj.pojo.Student;
import person.otj.service.StudentService;
import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public List<Student> selectBySname(Student student) {
        QueryWrapper<Student>wrapper=new QueryWrapper<>();
        wrapper.eq("sname",student.getSname());
        return studentMapper.selectList(wrapper);
    }
}