package advance.dev.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import advance.dev.model.CanBo;
import advance.dev.model.IManager;

	public class Manager implements IManager {
		private List<CanBo> canBoList = new ArrayList<>();

	    public void print() {
	        for (CanBo cb : canBoList) {
	            System.out.println(cb);
	        }
	    }

	    public void sortByName(int order) {
	        if (order == 1) {
	            Collections.sort(canBoList, Comparator.comparing(CanBo::getTen));
	        } else {
	            Collections.sort(canBoList, Comparator.comparing(CanBo::getTen).reversed());
	        }
	    }

	    public void add(CanBo cb) {
	        canBoList.add(cb);
	    }
	}


