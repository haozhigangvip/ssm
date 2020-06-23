package com.hzg.ssm.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	
	//����ת�ַ�
	public static String date2String(Date date,String patten){
		SimpleDateFormat sdf=new SimpleDateFormat(patten);
		String ds=sdf.format(date);
		return ds;
	}
	
	//�ַ�ת����
	public static Date string2Date(String dateString,String patten) throws ParseException{
		SimpleDateFormat sdf=new SimpleDateFormat(patten);
		Date dt=sdf.parse(dateString);
		return dt;
	}
}
