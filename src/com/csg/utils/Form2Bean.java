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
			//1 ��ȡ���е�����  ----map
			Map map = request.getParameterMap();
			Class  forName = Class.forName("com.csg.domain.FormBean");
			bean = (FormBean) forName.newInstance();
			//2 ��map�е����� ��װ�� FormBean��
			BeanUtils.populate(bean, map);
		} catch ( Exception e) {
			e.printStackTrace();
		}
		return bean;
	}
	
	/**
	 * ͨ���Զ��巴�� �㶨�� ����������BeanҲ�����ã���չ�Ժ�
	 * @param <T>  ���������Class.forName("com.csg.domain.FormBean")
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
