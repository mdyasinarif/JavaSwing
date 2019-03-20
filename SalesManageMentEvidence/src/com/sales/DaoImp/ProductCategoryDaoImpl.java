package com.sales.DaoImp;


import com.sales.Dao.ProductCategoryDao;
import com.sales.conn.DBConnection;
import com.sales.pojo.ProductCatagory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductCategoryDaoImpl implements ProductCategoryDao {

    Connection conn = DBConnection.getConnect();

    @Override
    public void createTable() {
        String sql = "create table IF NOT EXISTS product_category(id int(5) auto_increment primary key, cat_name varchar(20) unique)";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            System.out.println("Table Created!");
        } catch (SQLException ex) {
            Logger.getLogger(ProductCategoryDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   @Override
    public void save(ProductCatagory pc) {
        String sql = "insert into product_catagory(cat_name) values(?)";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, pc.getCatName());
            pstm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void update(ProductCatagory pc) {
        String sql = "update product_catagory set cat_name=? where id =?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, pc.getCatName());
            pstm.setInt(2, pc.getId());            
            pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }  
   

    @Override
    public ProductCatagory getProductCategoryById(int id) {
        ProductCatagory pc = new ProductCatagory();
        String sql = "select * from product_catagory where id=?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                pc.setId(rs.getInt(1));
                pc.setCatName(rs.getString(2));
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProductCategoryDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pc;
    }

    @Override
    public ProductCatagory getProductCategoryBycategoryName(String catName) {
        ProductCatagory pc = new ProductCatagory();
        String sql = "select * from product_catagory where cat_name=?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, catName);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                pc.setId(rs.getInt(1));
                pc.setCatName(rs.getString(2));
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProductCategoryDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pc;
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ProductCatagory> getList() {
        List<ProductCatagory> list = new ArrayList<>();
        String sql = "select * from product_catagory";
        try {

            PreparedStatement ps = DBConnection.getConnect().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ProductCatagory pc = new ProductCatagory(rs.getInt(1), rs.getString(2));
                list.add(pc);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProductCategoryDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

   
}
