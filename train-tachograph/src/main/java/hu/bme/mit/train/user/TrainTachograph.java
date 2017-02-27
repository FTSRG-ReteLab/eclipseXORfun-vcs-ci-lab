package hu.bme.mit.train.user;

import com.google.common.collect.Table;

public class TrainTachograph {
    Table<Long, Integer, Integer> table;

    public void record(int joyStickPosition, int referenceSpeed) {
		table.put(System.currentTimeMillis(), joyStickPosition, referenceSpeed);
    }

    public boolean isTableEmpty() {
        return table.isEmpty();
    }
}
