package de.clientexception.listen;

/**
* @author ClientException
* @project Listen
* @package de.clientexception.listen
*
* @date 03.04.2025
* @time 16:52:13
*
*
* @web www.worldcrafter.de
* @mail development@worldcrafter.de
*
*/

public class Main {
	
	public static void main(String[] args) {
		List list = new List();
		list.insert(list, 0);
		
		Pos p1 = list.insert(list.front(), 1);
		list.insert(list.next(p1), 2);
		
		System.out.println(list.front().elem);
		System.out.println(list.next(list.front()).elem);
		System.out.println(list.next(list.next(list.front())).elem);
	}
	
}



