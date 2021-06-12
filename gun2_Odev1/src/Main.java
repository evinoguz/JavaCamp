
public class Main {
	public static void main(String[] args) {
		Category category1=new Category(1,"T�m�");
		Category category2=new Category(2,"Programlama(3)");
		Category[] categories= {category1,category2};
		System.out.println("Kategoriler \n-----------");
		for(Category category:categories) {
			System.out.println(category.name);
		}
		
		System.out.println("\nKurs Program� \n-----------");
		CourseDays courseDay1=new CourseDays(1,"1. G�n","�dev1","�dev2","�dev3");
		CourseDays courseDay2=new CourseDays(2,"2. G�n","�dev1","�dev2","");
		CourseDays[] courseDays= {courseDay1,courseDay2};
		for(CourseDays courseDay:courseDays) {
			System.out.println(courseDay.day+" :");
			System.out.println(courseDay.odev1);
			System.out.println(courseDay.odev2);
			System.out.println(courseDay.odev3+"\n");
		}
		
		DaysContentManager daysContentManager=new DaysContentManager();
		daysContentManager.contentStart(courseDay1);
		daysContentManager.contentDelete(courseDay2);
	}
}
