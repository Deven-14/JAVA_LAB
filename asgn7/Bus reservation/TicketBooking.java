class Bus implements Runnable
{
	int availableSeats = 1;

	public void run()
	{
		System.out.println("Waiting to book ticket for : " + Thread.currentThread().getName());
		
		synchronized(this)
		{
			if(availableSeats > 0)
			{
				System.out.println("Booking ticket for : " + Thread.currentThread().getName());
			
				try{
					Thread.sleep(1000);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				
				availableSeats -= 1;
				
				System.out.println("Seat booked for : " + Thread.currentThread().getName());
				System.out.println("Currently Available seats = " + availableSeats);
			}
			else
			{
				System.out.println("Ticket Not Booked for : " + Thread.currentThread().getName());
			}
		}
	}
}

class TicketBooking
{
	public static void main(String[] args)
	{
		Bus b = new Bus();
		
		Thread t1 = new Thread(b, "Passenger 1");
		Thread t2 = new Thread(b, "Passenger 2");
	
		t1.start();
		t2.start();
	}
}