import CheckLogIn.Check;
import ConFig.ConnectionProvide;
import Entity.User;
import Repository.UserRepository;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
//        ConnectionProvide.TryConnection();
//        UserRepository.findUserByProjectID(1);
//        UserRepository.findAllManager();
        DangNhap();
    }
public static void DangNhap(){
    Scanner scanner=new Scanner(System.in);
    System.out.println("Moi nhap email");
    String email=scanner.nextLine();
    if (!Check.email(email)){
        System.out.println("email bi sai");
        return;
    }
    System.out.println("hay nhap password");
    String password=scanner.nextLine();
    if (!Check.password(password)){
        System.out.println("password sai");
        return;
    }
    User user=UserRepository.LogInManager(email,password);
    if (user!=null){
        System.out.println("Chao mung manager "+user.getFullname()+" da dang nhap");
    }else {
        System.out.println("emai hoac password sai");
        return;
    }


}
}
