package com.essence.pojo;

public class Type {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column type.typeId
     *
     * @mbg.generated Thu Aug 16 10:56:00 CST 2018
     */
    private String typeid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column type.type
     *
     * @mbg.generated Thu Aug 16 10:56:00 CST 2018
     */
    private String type;
    public String getParentid() {
		return parentid;
	}

	public void setParentid(String parentid) {
		this.parentid = parentid;
	}

	private String parentid;
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column type.isShow
     *
     * @mbg.generated Thu Aug 16 10:56:00 CST 2018
     */
    private Integer isshow;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column type.typeId
     *
     * @return the value of type.typeId
     *
     * @mbg.generated Thu Aug 16 10:56:00 CST 2018
     */
    public String getTypeid() {
        return typeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column type.typeId
     *
     * @param typeid the value for type.typeId
     *
     * @mbg.generated Thu Aug 16 10:56:00 CST 2018
     */
    public void setTypeid(String typeid) {
        this.typeid = typeid == null ? null : typeid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column type.type
     *
     * @return the value of type.type
     *
     * @mbg.generated Thu Aug 16 10:56:00 CST 2018
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column type.type
     *
     * @param type the value for type.type
     *
     * @mbg.generated Thu Aug 16 10:56:00 CST 2018
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column type.isShow
     *
     * @return the value of type.isShow
     *
     * @mbg.generated Thu Aug 16 10:56:00 CST 2018
     */
    public Integer getIsshow() {
        return isshow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column type.isShow
     *
     * @param isshow the value for type.isShow
     *
     * @mbg.generated Thu Aug 16 10:56:00 CST 2018
     */
    public void setIsshow(Integer isshow) {
        this.isshow = isshow;
    }
}