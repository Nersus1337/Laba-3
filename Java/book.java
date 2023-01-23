public class book extends library{

	//book zxc = new book();
	//Ticket.Client client1 = new Client();
	//Ticket zxcv = new Ticket();
	//zxc.title = "123";
	//zxc.adding_book();
	
	
	public void adding_book()
	{
		System.out.print("\nFunctciya dobavleniya knigi.\n");
		adding();
	}
	void info_book()
	{
		System.out.print("\n...Kniga...\n");
		info();
	}
	void deleted_book()
	{
		deleted();
		System.out.print("\nKniga bila udalena\n");
	}
	void edit_book()
	{
		System.out.print("\nFunctciya redaktirovaniya knigi.");
		info_book();
		edit();
	}	
}