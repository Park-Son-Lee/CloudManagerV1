package org.cloud.manager.login.dao.impl;

import org.cloud.manager.login.dao.LoginDao;
import org.cloud.manager.login.vo.LoginAccessVo;
import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("userLoginDao")
public class UserLoginDaoImpl extends EgovAbstractDAO implements LoginDao{

    @Override
    public LoginAccessVo loginAdmin(LoginAccessVo LoginAccessVo) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

}
