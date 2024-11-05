package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 就业知识
 *
 * @author 
 * @email
 */
@TableName("jiuyezhishi")
public class JiuyezhishiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiuyezhishiEntity() {

	}

	public JiuyezhishiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 就业知识名称
     */
    @ColumnInfo(comment="就业知识名称",type="varchar(200)")
    @TableField(value = "jiuyezhishi_name")

    private String jiuyezhishiName;


    /**
     * 就业知识编号
     */
    @ColumnInfo(comment="就业知识编号",type="varchar(200)")
    @TableField(value = "jiuyezhishi_uuid_number")

    private String jiuyezhishiUuidNumber;


    /**
     * 就业知识照片
     */
    @ColumnInfo(comment="就业知识照片",type="varchar(200)")
    @TableField(value = "jiuyezhishi_photo")

    private String jiuyezhishiPhoto;


    /**
     * 附件
     */
    @ColumnInfo(comment="附件",type="varchar(200)")
    @TableField(value = "jiuyezhishi_file")

    private String jiuyezhishiFile;


    /**
     * 就业知识视频
     */
    @ColumnInfo(comment="就业知识视频",type="varchar(200)")
    @TableField(value = "jiuyezhishi_video")

    private String jiuyezhishiVideo;


    /**
     * 赞
     */
    @ColumnInfo(comment="赞",type="int(11)")
    @TableField(value = "zan_number")

    private Integer zanNumber;


    /**
     * 踩
     */
    @ColumnInfo(comment="踩",type="int(11)")
    @TableField(value = "cai_number")

    private Integer caiNumber;


    /**
     * 就业知识类型
     */
    @ColumnInfo(comment="就业知识类型",type="int(11)")
    @TableField(value = "jiuyezhishi_types")

    private Integer jiuyezhishiTypes;


    /**
     * 就业知识热度
     */
    @ColumnInfo(comment="就业知识热度",type="int(11)")
    @TableField(value = "jiuyezhishi_clicknum")

    private Integer jiuyezhishiClicknum;


    /**
     * 就业知识介绍
     */
    @ColumnInfo(comment="就业知识介绍",type="longtext")
    @TableField(value = "jiuyezhishi_content")

    private String jiuyezhishiContent;


    /**
     * 是否上架
     */
    @ColumnInfo(comment="是否上架",type="int(11)")
    @TableField(value = "shangxia_types")

    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    @ColumnInfo(comment="逻辑删除",type="int(11)")
    @TableField(value = "jiuyezhishi_delete")

    private Integer jiuyezhishiDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="录入时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 设置：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：就业知识名称
	 */
    public String getJiuyezhishiName() {
        return jiuyezhishiName;
    }
    /**
	 * 设置：就业知识名称
	 */

    public void setJiuyezhishiName(String jiuyezhishiName) {
        this.jiuyezhishiName = jiuyezhishiName;
    }
    /**
	 * 获取：就业知识编号
	 */
    public String getJiuyezhishiUuidNumber() {
        return jiuyezhishiUuidNumber;
    }
    /**
	 * 设置：就业知识编号
	 */

    public void setJiuyezhishiUuidNumber(String jiuyezhishiUuidNumber) {
        this.jiuyezhishiUuidNumber = jiuyezhishiUuidNumber;
    }
    /**
	 * 获取：就业知识照片
	 */
    public String getJiuyezhishiPhoto() {
        return jiuyezhishiPhoto;
    }
    /**
	 * 设置：就业知识照片
	 */

    public void setJiuyezhishiPhoto(String jiuyezhishiPhoto) {
        this.jiuyezhishiPhoto = jiuyezhishiPhoto;
    }
    /**
	 * 获取：附件
	 */
    public String getJiuyezhishiFile() {
        return jiuyezhishiFile;
    }
    /**
	 * 设置：附件
	 */

    public void setJiuyezhishiFile(String jiuyezhishiFile) {
        this.jiuyezhishiFile = jiuyezhishiFile;
    }
    /**
	 * 获取：就业知识视频
	 */
    public String getJiuyezhishiVideo() {
        return jiuyezhishiVideo;
    }
    /**
	 * 设置：就业知识视频
	 */

    public void setJiuyezhishiVideo(String jiuyezhishiVideo) {
        this.jiuyezhishiVideo = jiuyezhishiVideo;
    }
    /**
	 * 获取：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }
    /**
	 * 设置：赞
	 */

    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 获取：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }
    /**
	 * 设置：踩
	 */

    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 获取：就业知识类型
	 */
    public Integer getJiuyezhishiTypes() {
        return jiuyezhishiTypes;
    }
    /**
	 * 设置：就业知识类型
	 */

    public void setJiuyezhishiTypes(Integer jiuyezhishiTypes) {
        this.jiuyezhishiTypes = jiuyezhishiTypes;
    }
    /**
	 * 获取：就业知识热度
	 */
    public Integer getJiuyezhishiClicknum() {
        return jiuyezhishiClicknum;
    }
    /**
	 * 设置：就业知识热度
	 */

    public void setJiuyezhishiClicknum(Integer jiuyezhishiClicknum) {
        this.jiuyezhishiClicknum = jiuyezhishiClicknum;
    }
    /**
	 * 获取：就业知识介绍
	 */
    public String getJiuyezhishiContent() {
        return jiuyezhishiContent;
    }
    /**
	 * 设置：就业知识介绍
	 */

    public void setJiuyezhishiContent(String jiuyezhishiContent) {
        this.jiuyezhishiContent = jiuyezhishiContent;
    }
    /**
	 * 获取：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }
    /**
	 * 设置：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getJiuyezhishiDelete() {
        return jiuyezhishiDelete;
    }
    /**
	 * 设置：逻辑删除
	 */

    public void setJiuyezhishiDelete(Integer jiuyezhishiDelete) {
        this.jiuyezhishiDelete = jiuyezhishiDelete;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Jiuyezhishi{" +
            ", id=" + id +
            ", jiuyezhishiName=" + jiuyezhishiName +
            ", jiuyezhishiUuidNumber=" + jiuyezhishiUuidNumber +
            ", jiuyezhishiPhoto=" + jiuyezhishiPhoto +
            ", jiuyezhishiFile=" + jiuyezhishiFile +
            ", jiuyezhishiVideo=" + jiuyezhishiVideo +
            ", zanNumber=" + zanNumber +
            ", caiNumber=" + caiNumber +
            ", jiuyezhishiTypes=" + jiuyezhishiTypes +
            ", jiuyezhishiClicknum=" + jiuyezhishiClicknum +
            ", jiuyezhishiContent=" + jiuyezhishiContent +
            ", shangxiaTypes=" + shangxiaTypes +
            ", jiuyezhishiDelete=" + jiuyezhishiDelete +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
