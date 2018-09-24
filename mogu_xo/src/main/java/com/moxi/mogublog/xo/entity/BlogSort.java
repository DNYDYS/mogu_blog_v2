package com.moxi.mogublog.xo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.moxi.mougblog.base.entity.SuperEntity;

/**
 * <p>
 * 博客分类表
 * </p>
 *
 * @author xuzhixiang
 * @since 2018年9月24日15:12:45
 */
@TableName("t_blog_sort")
public class BlogSort extends SuperEntity<BlogSort> {

    private static final long serialVersionUID = 1L;


    /**
     * 分类介绍
     */
    private String content;
    
    /**
     * 分类名
     */
    private String sortName;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSortName() {
		return sortName;
	}

	public void setSortName(String sortName) {
		this.sortName = sortName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
}