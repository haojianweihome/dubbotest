package come.hjw.home.user.service;

import java.util.List;

import com.hjw.home.core.page.PageBean;
import com.hjw.home.core.page.PageParam;

import come.hjw.home.user.bean.User;



public interface UserService {
	public void saveuser(User user) throws RuntimeException;
	
	public List<User> getalluser();
	public PageBean getalluser(PageParam pageParam);

}
