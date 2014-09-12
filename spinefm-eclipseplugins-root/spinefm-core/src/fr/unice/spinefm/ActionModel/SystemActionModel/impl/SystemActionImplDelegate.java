package fr.unice.spinefm.ActionModel.SystemActionModel.impl;

import java.lang.reflect.Field;

public class SystemActionImplDelegate extends SystemActionImpl {
	
	@Override
	public boolean equals(Object obj) {
		Class<? extends SystemActionImplDelegate> c = this.getClass();
		if (obj.getClass().equals(c)) {
			Field[] fields = c.getFields();
			boolean result = true;
			for (Field f : fields) {
				try {
					Object o1 = f.get(this);
					Object o2 = f.get(obj);
					result = result && (o1.equals(o2));
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return result;
		}
		return false;
	}
}
