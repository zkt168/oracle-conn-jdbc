package cn.example;

import cn.example.bean.Emp;
import cn.example.dao.EmpDao;

import java.util.ArrayList;

public class test {

    public static void main(String[] args) {
        ArrayList<Emp> empList = EmpDao.getAll();
        for(int i = 0;i < empList.size();i++){
            System.out.println(i + ":" + empList.get(i));
        }
    }
}
