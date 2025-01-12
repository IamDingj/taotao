package com.dj.taotao.content.service;

import java.util.List;

import com.dj.taotao.pojo.EasyUITreeNode;
import com.dj.taotao.pojo.TaotaoResult;

/** 
 * @ClassName: ContentCategoryService 
 * @Description: 内容分类管理接口
 * @author Steven 
 * @date 2019年3月7日  
 */
public interface ContentCategoryService {
	
	/** 
	 * @Title: getContentCategoryList 
	 * @Description: 获取内容分类列表
	 * @param parentId
	 * @return List<EasyUITreeNode>  返回类型  
	 */
	List<EasyUITreeNode> getContentCategoryList(long parentId);
	
	/** 
	 * @Title: addContentCategory 
	 * @Description: 新增内容分类
	 * @param parentId
	 * @param name
	 * @return TaotaoResult  返回类型  
	 */
	TaotaoResult addContentCategory(long parentId,String name);

}
