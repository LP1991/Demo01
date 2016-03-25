package org.tarena.test.test;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
import org.tarena.test.entity.Sum;
import org.tarena.test.mapper.DeptMapper;

public class TestMyBatis {
	public static void main(String[] args) {
		SqlSession ss  = null;
		try{
			String conf = "SqlMapConfig.xml";
			Reader reader = null;
			reader = Resources.getResourceAsReader(conf);
			SqlSessionFactoryBuilder sfb = new SqlSessionFactoryBuilder();
			SqlSessionFactory sf = sfb.build(reader);
			ss = sf.openSession();
			Map<String,String> map = new HashMap<String,String>();
			map.put("name", "zhangsan");
			System.out.println(ss);
			ss.selectOne("proHello", map);
//			DeptMapper dm = ss.getMapper(DeptMapper.class);
//			Sum sum = new Sum();
//			sum.setA(4);
//			sum.setB(5);
//			int x =dm.sum(sum);
			String c = map.get("result");
			System.out.println(c);
//			ss.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(ss != null){
				ss.close();
			}
		}
	}
}
