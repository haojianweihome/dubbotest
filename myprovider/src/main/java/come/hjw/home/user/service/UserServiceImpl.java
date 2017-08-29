package come.hjw.home.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjw.home.core.dao.BaseDaoImpl;
import com.hjw.home.core.page.PageBean;
import com.hjw.home.core.page.PageParam;

import come.hjw.home.user.bean.User;
import come.hjw.home.user.dao.UserDao;
@Service
public class UserServiceImpl  implements UserService{
	@Autowired
	private UserDao userDao;

	public void saveuser(User user)throws RuntimeException 
    {
		userDao.insert(user);
		
	}

	public List<User> getalluser() {
		// TODO Auto-generated method stub
		return null;
	}

	public PageBean getalluser(PageParam pageParam) {
		return userDao.listPage(pageParam, null);
	}

	
	
	
	
	

}
