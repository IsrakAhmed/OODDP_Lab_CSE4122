package Mediator_Pattern;

public class User {
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public User(String name){
        this.name = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this, message);
    }
  
}
