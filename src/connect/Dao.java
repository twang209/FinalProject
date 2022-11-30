package connect;

import Domain.marvelmovie;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class Dao {
        final String url = "jdbc:postgresql://localhost:5432/Project";

        final String user = "postgres";

        final String password = "123456";
        Connection connection;
        Statement statement;
        PreparedStatement preparedStatement;
        ResultSet resultSet;

        public  Connection getConnection() {
            try {
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            try {
                connection = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return connection;
        }

        List<marvelmovie> list = new ArrayList<>();

    public List<marvelmovie> selectAll(){
        String selectAll="select * from info";
        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            resultSet = statement.executeQuery(selectAll);
            while (resultSet.next()){
                marvelmovie marvelmovie=new marvelmovie();
                marvelmovie.setMovieId(resultSet.getInt("movieid"));
                marvelmovie.setName(resultSet.getString("name"));
                marvelmovie.setAge(resultSet.getInt("age"));
                marvelmovie.setDate(resultSet.getString("date"));
                marvelmovie.setRate(resultSet.getInt("rate"));
                marvelmovie.setDirectorName(resultSet.getString("directorname"));
                marvelmovie.setProducerName(resultSet.getString("producername"));
                marvelmovie.setActorName(resultSet.getString("actorname"));
                marvelmovie.setOscar(resultSet.getString("oscar"));
                list.add(marvelmovie);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                resultSet.close();
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return list;
    }

    public int insert(int Id, String Name,int Age,String Date,int Rating, String DName, String PName, String AName, String Oscar){
        String sql="insert into info values(?,?,?,?,?,?,?,?,?) ";
        int i = 0;
        try {

            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setInt(1,Id);
            preparedStatement.setString(2,Name);
            preparedStatement.setInt(3,Age);
            preparedStatement.setString(4,Date);
            preparedStatement.setInt(5,Rating);
            preparedStatement.setString(6, DName);
            preparedStatement.setString(7, PName);
            preparedStatement.setString(8, AName);
            preparedStatement.setString(9, Oscar);
            //System.out.println(id);
            i=preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                preparedStatement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return i;
    }
    public int deleteMovie(int ID){
        String sql="DELETE FROM info where movieid=?";
        int i=0;
        try {
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setInt(1,ID);
            i=preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                preparedStatement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return i;
    }
    public int update(String name,int age,String date, int rate,String DName, String PName, String AName, String Oscar,int id){
        String sql="update info set name =?,age=?,date=?,rate=?,directorname=?,producername=?,actorname=?,oscar=? where movieid=?";
        int i=0;
        try {
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,name);
            preparedStatement.setInt(2,age);
            preparedStatement.setString(3,date);
            preparedStatement.setInt(4,rate);
            preparedStatement.setString(5, DName);
            preparedStatement.setString(6, PName);
            preparedStatement.setString(7, AName);
            preparedStatement.setString(8, Oscar);
            preparedStatement.setInt(9,id);
            i=preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }
    public List<marvelmovie> selectName(String Name){
        String selectMovie="select * from info where name=?";
        try {
            String sql = "SELECT * FROM info where name=?";
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1, Name);
            System.out.println(Name);
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                marvelmovie marvelmovie=new marvelmovie();
                marvelmovie.setMovieId(resultSet.getInt("movieid"));
                marvelmovie.setName(resultSet.getString("name"));
                marvelmovie.setAge(resultSet.getInt("age"));
                marvelmovie.setDate(resultSet.getString("date"));
                marvelmovie.setRate(resultSet.getInt("rate"));
                marvelmovie.setDirectorName(resultSet.getString("directorname"));
                marvelmovie.setProducerName(resultSet.getString("producername"));
                marvelmovie.setActorName(resultSet.getString("actorname"));
                marvelmovie.setOscar(resultSet.getString("oscar"));
                list.add(marvelmovie);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                resultSet.close();
                preparedStatement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    public List<marvelmovie> selectByDirector(String Name){
        String selectMovie="select * from info where directorname=?";
        try {
            String sql = "SELECT * FROM info where directorname=?";
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1, Name);
            System.out.println(Name);
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                marvelmovie marvelmovie=new marvelmovie();
                marvelmovie.setMovieId(resultSet.getInt("movieid"));
                marvelmovie.setName(resultSet.getString("name"));
                marvelmovie.setAge(resultSet.getInt("age"));
                marvelmovie.setDate(resultSet.getString("date"));
                marvelmovie.setRate(resultSet.getInt("rate"));
                marvelmovie.setDirectorName(resultSet.getString("directorname"));
                marvelmovie.setProducerName(resultSet.getString("producername"));
                marvelmovie.setActorName(resultSet.getString("actorname"));
                marvelmovie.setOscar(resultSet.getString("oscar"));
                list.add(marvelmovie);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                resultSet.close();
                preparedStatement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
    public List<marvelmovie> selectByProducer(String Name){
        String selectMovie="select * from info where producername=?";
        try {
            String sql = "SELECT * FROM info where producername=?";
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1, Name);
            System.out.println(Name);
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                marvelmovie marvelmovie=new marvelmovie();
                marvelmovie.setMovieId(resultSet.getInt("movieid"));
                marvelmovie.setName(resultSet.getString("name"));
                marvelmovie.setAge(resultSet.getInt("age"));
                marvelmovie.setDate(resultSet.getString("date"));
                marvelmovie.setRate(resultSet.getInt("rate"));
                marvelmovie.setDirectorName(resultSet.getString("directorname"));
                marvelmovie.setProducerName(resultSet.getString("producername"));
                marvelmovie.setActorName(resultSet.getString("actorname"));
                marvelmovie.setOscar(resultSet.getString("oscar"));
                list.add(marvelmovie);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                resultSet.close();
                preparedStatement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    public List<marvelmovie> selectAllByAgeASC(){
        String selectAll="select * from info ORDER BY age ASC";
        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            resultSet = statement.executeQuery(selectAll);
            while (resultSet.next()){
                marvelmovie marvelmovie=new marvelmovie();
                marvelmovie.setMovieId(resultSet.getInt("movieid"));
                marvelmovie.setName(resultSet.getString("name"));
                marvelmovie.setAge(resultSet.getInt("age"));
                marvelmovie.setDate(resultSet.getString("date"));
                marvelmovie.setRate(resultSet.getInt("rate"));
                marvelmovie.setDirectorName(resultSet.getString("directorname"));
                marvelmovie.setProducerName(resultSet.getString("producername"));
                marvelmovie.setActorName(resultSet.getString("actorname"));
                marvelmovie.setOscar(resultSet.getString("oscar"));
                list.add(marvelmovie);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                resultSet.close();
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return list;
    }
    public List<marvelmovie> selectAllByAgeDSC(){
        String selectAll="select * from info ORDER BY age DESC";
        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            resultSet = statement.executeQuery(selectAll);
            while (resultSet.next()){
                marvelmovie marvelmovie=new marvelmovie();
                marvelmovie.setMovieId(resultSet.getInt("movieid"));
                marvelmovie.setName(resultSet.getString("name"));
                marvelmovie.setAge(resultSet.getInt("age"));
                marvelmovie.setDate(resultSet.getString("date"));
                marvelmovie.setRate(resultSet.getInt("rate"));
                marvelmovie.setDirectorName(resultSet.getString("directorname"));
                marvelmovie.setProducerName(resultSet.getString("producername"));
                marvelmovie.setActorName(resultSet.getString("actorname"));
                marvelmovie.setOscar(resultSet.getString("oscar"));
                list.add(marvelmovie);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                resultSet.close();
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return list;
    }
    public List<marvelmovie> selectAllByRateASC(){
        String selectAll="select * from info ORDER BY rate ASC ";
        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            resultSet = statement.executeQuery(selectAll);
            while (resultSet.next()){
                marvelmovie marvelmovie=new marvelmovie();
                marvelmovie.setMovieId(resultSet.getInt("movieid"));
                marvelmovie.setName(resultSet.getString("name"));
                marvelmovie.setAge(resultSet.getInt("age"));
                marvelmovie.setDate(resultSet.getString("date"));
                marvelmovie.setRate(resultSet.getInt("rate"));
                marvelmovie.setDirectorName(resultSet.getString("directorname"));
                marvelmovie.setProducerName(resultSet.getString("producername"));
                marvelmovie.setActorName(resultSet.getString("actorname"));
                marvelmovie.setOscar(resultSet.getString("oscar"));
                list.add(marvelmovie);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                resultSet.close();
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return list;
    }
    public List<marvelmovie> selectAllByRateDSC(){
        String selectAll="select * from info ORDER BY rate DESC";
        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            resultSet = statement.executeQuery(selectAll);
            while (resultSet.next()){
                marvelmovie marvelmovie=new marvelmovie();
                marvelmovie.setMovieId(resultSet.getInt("movieid"));
                marvelmovie.setName(resultSet.getString("name"));
                marvelmovie.setAge(resultSet.getInt("age"));
                marvelmovie.setDate(resultSet.getString("date"));
                marvelmovie.setRate(resultSet.getInt("rate"));
                marvelmovie.setDirectorName(resultSet.getString("directorname"));
                marvelmovie.setProducerName(resultSet.getString("producername"));
                marvelmovie.setActorName(resultSet.getString("actorname"));
                marvelmovie.setOscar(resultSet.getString("oscar"));
                list.add(marvelmovie);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                resultSet.close();
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return list;
    }
}
