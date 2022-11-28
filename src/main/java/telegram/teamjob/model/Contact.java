package telegram.teamjob.model;


import telegram.teamjob.repositories.ContactRepository;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author shulga_ea <br>
 * сущность Сontact - ФИО и телефон, которые пользователь предоставляет, для обратной связи с ним<br>
 * id записи в БД генерируется автоматически <br>
 * бот заносит данные в БД <br>
 * @see ContactRepository
 *
 */
@Entity
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String numberPhone;
    // private String timeForCalling;

    public Contact(){}

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getNumberPhone(){
        return numberPhone;
    }
    public void setNumberPhone(String numberPhone){
        this.numberPhone = numberPhone;
    }


    @Override
    public String toString() {
        return "Contact: " + "id " + id+ "name " + name + "number phone " + numberPhone;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return  name == contact.getName() && Objects.equals(id, contact.id) &&
                Objects.equals(numberPhone, contact.numberPhone);
    }


    @Override
    public int hashCode(){
        return Objects.hash(id, name, numberPhone);
    }
}
