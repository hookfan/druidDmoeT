package cn.itcast.dbassist.handler;

import java.sql.ResultSet;
//�������ģʽ
public interface ResultSetHandler {

	Object handler(ResultSet rs);//�ѽ�����е����ݷ�װ��������

}