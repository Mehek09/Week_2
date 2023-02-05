package Week2;


class DanceclubStatic {
	private static int counter;
	private String registrationId;
	private String name;
	private String city;
	private long contact_num;
	static {
		counter=10000;
	}
	public DanceclubStatic(String name, long contact_num,String city)
	{
		this.registrationId="D"+ ++DanceclubStatic.counter;
		this.name=name;
		this.contact_num=contact_num;
		this.city=city;
				
	}
	public static int getCounter() {
		return counter;
	}
	public static void setCounter(int counter) {
		DanceclubStatic.counter = counter;
	}
	public String getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getContact_num() {
		return contact_num;
	}
	public void setContact_num(long contact_num) {
		this.contact_num = contact_num;
	}
	
	

    public static void main(String[] args) {
    	DanceclubStatic participant1 = new DanceclubStatic("Franklin", 7656784323L, "Texas");
        DanceclubStatic participant2 = new DanceclubStatic("Merina", 7890423112L, "New York");

        DanceclubStatic[] participants = { participant1, participant2 };
        
        for (DanceclubStatic participant : participants) {
        System.out.println("Hi "+participant.getName()+"! Your registration id is "+participant.getRegistrationId());
           }
}
}