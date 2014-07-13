package com.csg.utils;

import java.util.Map;
import javax.servlet.ServletRequest;

import org.apache.commons.beanutils.BeanUtils;

import com.csg.domain.FormBean;

/**
 * Form ---->FormBean
 * @author csg
 *
 */
public class Form2Bean {

	public static FormBean  ToBean(ServletRequest request){
		FormBean bean = null;
		try {
			//1 获取表单中的数据  ----map
			Map map = request.getParameterMap();
			Class  forName = Class.forName("com.csg.domain.FormBean");
			bean = (FormBean) forName.newInstance();
			//2 将map中的数据 封装到 FormBean中
			BeanUtils.populate(bean, map);
		} catch ( Exception e) {
			e.printStackTrace();
		}
		return bean;
	}
	
	/**
	 * 通过自定义反射 搞定， 这样其他的Bean也可以用，扩展性好
	 * @param <T>  
	 * @param request 
	 * @param cla  
	 * @return
	 */
	public static <T> T  toBean(ServletRequest request,Class<T> cla){
		try {
			T bean =  cla.newInstance();
			Map map = request.getParameterMap();
			BeanUtils.populate(bean, map);
			return bean;
		} catch ( Exception e) {
			throw new RuntimeException();
		}
		
	}
	

}
