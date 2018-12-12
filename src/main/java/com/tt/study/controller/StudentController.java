package com.tt.study.controller;

import org.springframework.stereotype.Controller;

/**
 * @作者：matao
 * @时间：2018/12/12 0012 下午 7:02
 * @描述：学生控制器
*/
@Controller
public class StudentController {

   private String studentName;
   private Integer studentNo;
   private String studentPwd;

    public String getStudentPwd() {
        return studentPwd;
    }

    public void setStudentPwd(String studentPwd) {
        this.studentPwd = studentPwd;
    }

    public Integer getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(Integer studentNo) {
        this.studentNo = studentNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }


}
