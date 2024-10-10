package J_demo;
import java.util.Scanner;

public class BankAccount07Example {
    public double accnumber;


    public static void main(String[] args){
        BankAccount07Example account =new BankAccount07Example();
        Scanner scanner = new Scanner(System.in );
        while(true){
            System.out.println("请输入账户名：");
            String accname = scanner.nextLine();
            System.out.println("请输入账户密码");
            String Password = accname + "password";
            String password = scanner.nextLine();
            if (!password.equals(Password)){
                System.out.println("密码错误，请重新输入密码");
            }
            else {
                break;
            }
        }

        while (true){
            System.out.println("请选择操作：1.存款 2.取款 3.查看账户余额 4.退出");
            int choice = scanner.nextInt();
            if (choice==1){
                System.out.println("请输入存款金额：");
                double depositnum = scanner.nextDouble();
                account.deposit(depositnum);
            }
            else if (choice==2){
                System.out.println("请输入取款金额：");
                double withdrawnum =scanner.nextDouble();
                account.withdraw(withdrawnum);
            }
            else if (choice==3){
                account.checkBalance();
            }
            else if (choice==4){
                return;
            }
            else {
                System.out.println("操作错误，请重新操作");
            }
        }
    }
    public void deposit(double depasitnum){
        accnumber += depasitnum;
        System.out.println("存款成功");
    }
    public void withdraw(double withdrawnum){
        if (accnumber >= withdrawnum) {
            accnumber -= withdrawnum;
            System.out.println("取款成功");
        }
        else {
            System.out.println("余额不足，取款失败");
        }

    }
    public void checkBalance(){
        System.out.println("当前余额"+accnumber);
    }
}
