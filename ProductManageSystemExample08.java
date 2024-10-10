package J_demo;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Product
{
    private String id ;
    private String name;
    private double price;
    public  Product(String id ,String name ,double price)
    {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String Getid()
    {
        return id;
    }

    public String Getname()
    {
        return name;
    }

    public double Getprice()
    {
        return price;
    }

    public String OutputString()
    {
        return "Product id"+id+"Product name"+name+"Product price"+price;
    }

}
class ProductManger
{
    private List<Product> productlist;
    public ProductManger()
    {
        productlist = new ArrayList<>();
    }

    public void addproduct(String id ,String name ,double price)
    {
            Product product = new Product( id ,name, price);
            productlist.add(product);
            System.out.println("添加商品成功"+product);
    }

    public void searchproduct(String id )
    {
        for(Product product : productlist)
        {
            if (product.Getid().equals(id))
            {
                System.out.println("查询成功，查询结果为"+product);
                return;
            }
        }
        System.out.println("未查询到"+id+"的商品");
    }

    public void showallproduct()
    {
        if (productlist.isEmpty())
        {
            System.out.println("该商品列表为空");
        }
        else
        {
            System.out.println("所有商品列表为：");
            for (Product procut:productlist)
            {
                System.out.println(procut);
            }
        }
    }

}
public class ProductManageSystemExample08
{
    public static void main(String[] args)
    {
        ProductManger Productmanger = new ProductManger();
        Scanner sc = new Scanner(System.in);
        boolean exit =  false;
        while (!exit) {
            System.out.println("1.添加商品");
            System.out.println("2.查询商品");
            System.out.println("3.查询所有商品");
            System.out.println("4.退出");
            int choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("请输入商品id");
                    sc.nextLine();
                    String ID = sc.nextLine();
                    System.out.println("请输入商品名字");
                    String name = sc.nextLine();
                    System.out.println("请输入商品价格");
                    double price = sc.nextDouble();
                    Productmanger.addproduct(ID,name,price);
                break;

                case 2:
                    System.out.println("请输入要查询的商品ID");
                    sc.nextLine();
                    String searchID =sc.nextLine();
                    Productmanger.searchproduct(searchID);
                    break;

                case 3:
                    Productmanger.showallproduct();
                    break;

                case 4:
                    exit = true ;
                    System.out.println("操作成功退出系统");
                    break;

                default:
                    System.out.println("输入指令错误，请重新输入");
                    break;
            }
        }
        sc.close();
    }
}
