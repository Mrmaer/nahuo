import java.sql.Date;

/**
 * Created by mrma on 17-6-29.
 */
public class Studets {
    private String name;
    private int number;
    private Date date;
    public Studets(){

    }

    /**
     *
     * @param number 号码
     * @param name 名字
     * @param date 生日
     */
    public Studets(int number,String name,Date date){
        this.number = number;
        this.name = name;
        this.date = date;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
