package com.dl.encap;

public class RegisterImpl extends Register{

	public static void main(String[] args) {

		//Encap: Wrappring the data and their methods into a single unit
		RegisterImpl impl = new RegisterImpl();
		impl.setFname("Sai");
		impl.setLname("Kiran");
		impl.setGender('M');
		impl.setAge(28);
		
		System.out.println(impl.getFname());
		System.out.println(impl.getLname());
		System.out.println(impl.getGender());
		System.out.println(impl.getAge());
	}

}
