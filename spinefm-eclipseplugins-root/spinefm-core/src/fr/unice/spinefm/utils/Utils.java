package fr.unice.spinefm.utils;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;


/**
 * This class is part of SpineFM framework. 
 * 
 * A simple class to give some constants and compute filepaths. 
 * @author Simon Urli
 */
public class Utils {
	public static boolean equalsEList(EList<?> list1, EList<?> list2) {
		if (list1 == list2)
			return true;
		
		if (list1 == null || list2 == null)
			return false;
		
		if (list1.size() != list2.size())
			return false;
		
		boolean result = true;
		for (Object o1 : list1) {
			Iterator<?> it = list2.iterator();
			Object o2;
			
			do {
				o2 = it.next();
			} while (it.hasNext() && !o1.equals(o2));
			result = result && o1.equals(o2);
		}
		return result;
	}
	
	public static boolean equalsPrimitive(Object o1, Object o2) {
		if (o1 == o2)
			return true;
		if (o1 == null || o2 == null)
			return false;
		return (o1.equals(o2));
	}
	
	/**
	 * Return true if l1 is included in l2 or the contrary.
	 * @param <E>
	 * @param l1
	 * @param l2
	 * @return
	 */
	public static <E> boolean matchList(List<E> l1, List<E> l2) {
		List<E> start;
		List<E> theOther;
		if (l1.size() > l2.size()) {
			start = l2;
			theOther = l1;
		} else {
			start = l1;
			theOther = l2;
		}
		for (E element : start) {
			boolean ok = false;
			for (E el2 : theOther) {
				if (element.equals(el2)) {
					ok = true;
					break;
				}
			}
			if (!ok)
				return false;
		}
		return true;
	}
	
	/**
	 * Return true if l1 is included or equals to l2
	 * @param l1
	 * @param l2
	 * @return
	 */
	public static <E> boolean listIsIncludeInAnother(List<E> l1, List<E> l2) {
		if (l1.size() > l2.size())
			return false;
		for (E element : l1) {
			if (!l2.contains(element))
				return false;
		}
		return true;
	}
	
	public static EList<Object> createListFromArgs(Object... args) {
		EList<Object> result = new BasicEList<Object>();
		for (Object obj : args) {
			result.add(obj);
		}
		return result;
	}
	
	public static Map<String, Object> createMapFromArgs(Object... args) {
		Map<String, Object> result = new HashMap<String, Object>();
		
		if (args.length % 2 != 0)
			throw new IllegalArgumentException("There must be a pair number of arguments");
		
		for (int i = 0; i < args.length; i=i+2) {
			String keyArg = (String)args[i];
			Object arg = args[i+1];
			result.put(keyArg, arg);
		}
		
		return result;
	}
	
	public static String getDirectoryFromModelPath(String modelPath) {
		File f = new File(modelPath);
		return f.getParent();
	}
}
