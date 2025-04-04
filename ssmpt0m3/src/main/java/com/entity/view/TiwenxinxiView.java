package com.entity.view;

import com.entity.TiwenxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 提问信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-12 08:13:45
 */
@TableName("tiwenxinxi")
public class TiwenxinxiView  extends TiwenxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TiwenxinxiView(){
	}
 
 	public TiwenxinxiView(TiwenxinxiEntity tiwenxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, tiwenxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
