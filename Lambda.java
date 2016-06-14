import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lambda {
	public static void main(String[] args) {

		/*
		 * 在 java8 之前对 List 排序一般是创建一个匿名的比较器对象然后将其传递给 sort 方法
		 */
		List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				return b.compareTo(a);
			}
		});

		/*
		 * 在 java8 中可使用 Lambda 表达式来实现
		 */
		Collections.sort(names, (String a, String b) -> {
			return b.compareTo(a);
		});
		
		/*
		 * 对于函数体只有一行代码的，你可以去掉大括号以及 return 关键字
		 */
		Collections.sort(names, (String a, String b) -> b.compareTo(a));
		
		/*
		 * 由于 java 编译器可以自动推导出参数类型，所以类型也可以省略
		 */
		Collections.sort(names, (a, b) -> b.compareTo(a));
	}
}