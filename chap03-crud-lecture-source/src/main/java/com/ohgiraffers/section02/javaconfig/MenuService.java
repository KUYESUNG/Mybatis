package com.ohgiraffers.section02.javaconfig;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.section02.javaconfig.Template.getSqlSession;

public class MenuService {

    private MenuMapper menuMapper;
    public List<MenuDTO> selectAllMenu() {

        SqlSession sqlSession = getSqlSession();

        /* sqlSession은 요청 단위로 생성해야 하기 때문에, getMapper로 메소드 스코프로 매번 불러와야 한다. */
        menuMapper = sqlSession.getMapper(MenuMapper.class);

        List<MenuDTO> menuList = menuMapper.selectAllMenu();

        sqlSession.close();

        return menuList;
    }

    public MenuDTO selectMenuByCode(int code) {
        return null;
    }

    public boolean registMenu(MenuDTO menu) {
        return false;
    }

    public boolean modifyMenu(MenuDTO menu) {
        return false;
    }

    public boolean deletMenu(int code) {
        return false;
    }
}
