package com.huan.model;

public class TRole {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role.id
     *
     * @mbggenerated Fri Jul 15 01:30:17 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role.rolename
     *
     * @mbggenerated Fri Jul 15 01:30:17 CST 2016
     */
    private String rolename;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role.id
     *
     * @return the value of t_role.id
     * @mbggenerated Fri Jul 15 01:30:17 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role.id
     *
     * @param id the value for t_role.id
     * @mbggenerated Fri Jul 15 01:30:17 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role.rolename
     *
     * @return the value of t_role.rolename
     * @mbggenerated Fri Jul 15 01:30:17 CST 2016
     */
    public String getRolename() {
        return rolename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role.rolename
     *
     * @param rolename the value for t_role.rolename
     * @mbggenerated Fri Jul 15 01:30:17 CST 2016
     */
    public void setRolename(String rolename) {
        this.rolename = rolename;
    }
}