package model.dao;

import java.util.List;

public interface DepartmentDao {
	
  public void insert(DepartmentDao department);
  public void update(DepartmentDao department);
  public void deleteById(Integer id);
  public DepartmentDao findById(Integer id);
  public List<DepartmentDao> findAll();
 
}
