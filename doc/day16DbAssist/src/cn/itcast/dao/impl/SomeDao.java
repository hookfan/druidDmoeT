package cn.itcast.dao.impl;

import java.util.List;

import org.junit.Test;

import cn.itcast.dbassist.DBAssist;
import cn.itcast.dbassist.handler.BeanListHandler;
import cn.itcast.domain.Account;
import cn.itcast.util.DBCPUtil;

public class SomeDao {
	private DBAssist da = new DBAssist(DBCPUtil.getDataSource());
	@Test
	public void add(){
		da.update("insert into account (name,money) values(?,?)", new Object[]{"fff",1000});
	}
	@Test
	public void update(){
		da.update("update account set name=?,money=? where id=?", new Object[]{"ffff",10000,7});
	}
	@Test
	public void del(){
		da.update("delete from account where id=?", new Object[]{7});
	}
	@Test
	public void findOne(){
		List ll = (List) da.query("select * from account", null, new BeanListHandler(Account.class));
		for(Object o:ll)
			System.out.println(o);
	}
}
