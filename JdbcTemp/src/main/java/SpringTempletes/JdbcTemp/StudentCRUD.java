package SpringTempletes.JdbcTemp;

import java.util.List;

public interface StudentCRUD {

	public int insert(StudentBean s);
	public List<StudentBean> getallstudents();

}
