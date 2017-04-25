package onlineretailers;

import java.util.Scanner;

public class Onlineretailers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("＊＊＊＊登陆（A）＊＊＊＊");
		System.out.println("＊＊＊＊注册（B）＊＊＊＊");
		System.out.println("＊＊＊＊退出（C）＊＊＊＊");
		
		System.out.println("请选择使用模块：登陆(A)、"
									+ "注册(B)、"
									+ "退出(C)");
		String mode = sc.next();
		if(mode.equals("A") || mode.equals("a"))
		{	
			boolean flag = false;
			boolean isLogin = false;
			//用户名或密码超过三次，判断用户
			for(int i = 0; i < 3;i ++)
			{
				//判断登录是否成功
				if (isLogin == false)
				{
					System.out.println("＊＊＊＊登陆（A）＊＊＊＊");
					LogAdv login = new LogAdv();
					System.out.println("请输入用户名：");
					String uName = sc.next();
					System.out.println("请输入密码：");
					String uPwd = sc.next();
					isLogin = login.login(uName,uPwd);
					System.out.println(isLogin);
					if(isLogin == true) 
					{
						flag = true;
					}
				}else{
					break;
				}
				
			}
			//三次登录都失败，抛出相应的提示信息
			if (flag == false)
			{
				System.out.println("用户操作错误超过3次");
			}
			System.out.println("＊＊＊＊登陆（A）＊＊＊＊");
			Log login = new Log();
			login.login();
		}else if (mode.equals("B") || mode.equals("b") )
		{
			System.out.println("＊＊＊＊注册（B）＊＊＊＊");
			System.out.println("请输入用户名：");
			String uName = sc.next();
			System.out.println("请输入密码：");
			String uPwd = sc.next();
			Reg Register = new Reg();
			Register.Register(uName, uPwd);
			
		}else if (mode.equals("C")|| mode.equals("c"))
		{
			System.out.println("＊＊＊＊退出（C）＊＊＊＊");
		}else
		{
			System.out.println("选择模块输入非法");
		}
		sc.close();
	}

}
