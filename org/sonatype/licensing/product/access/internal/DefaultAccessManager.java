package org.sonatype.licensing.product.access.internal;

import java.io.IOException;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sonatype.licensing.product.access.AccessEntry;
import org.sonatype.licensing.product.access.AccessEntrySet;
import org.sonatype.licensing.product.access.AccessManager;
import org.sonatype.licensing.product.access.io.AccessPersistence;

@Singleton
//@Named("licensing.default")
public class DefaultAccessManager implements AccessManager {
    public static final int DEFAULT_MAX_ENTRIES_BETWEEN_SAVE = 100;

    public static final int DEFAULT_MAX_TIME_BETWEEN_SAVE = 300000;

    private int orn = 100;

    private int xgj = 300000;

    private final Logger fjz = LoggerFactory.getLogger(getClass());

    private final AccessPersistence svd;

    private AccessEntrySet qks = new AccessEntrySet();

    private final ConcurrentLinkedQueue<AccessEntry> lak = new ConcurrentLinkedQueue<AccessEntry>();


    private Future<?> fnf;

    @Inject
    public DefaultAccessManager(AccessPersistence paramAccessPersistence) throws IOException {
        this.svd = paramAccessPersistence;
        this.qks = paramAccessPersistence.load();
    }

    public boolean add(AccessEntry paramAccessEntry) {
        this.fjz.trace("Adding access entry: {}", paramAccessEntry);
        return this.lak.add(paramAccessEntry);
    }

    public synchronized Set<AccessEntry> getSince(Date paramDate) {
        long l = paramDate.getTime();
        HashSet<AccessEntry> hashSet = new HashSet();
        for (AccessEntry accessEntry : this.qks) {
            if (accessEntry.getDate().getTime() > l)
                hashSet.add(accessEntry);
        }
        return hashSet;
    }

    public Set<AccessEntry> expire(Date paramDate) {
        Set<AccessEntry> set = getSince(paramDate);
        this.fjz.debug(String.format("expiring access entries: %s from %s", new Object[]{Integer.valueOf(set.size()), Integer.valueOf(this.qks.size())}));
        this.qks.retainAll(set);
        return set;
    }

    public void save() throws IOException {
        this.svd.save(this.qks);
    }

    public void purge() {
        this.qks.clear();
    }

    public boolean hasItemsToBeProcessed() {
        return (this.lak.size() != 0);
    }

    public synchronized void shutdown() throws IOException {
//        this.fjz.debug("Shutdown");
//        try {
//            itm.itm(this.erd);
//        } catch (Exception exception) {
//            this.fjz.warn("Failure when shutting down queue processor", exception);
//        }
//        itm.omj(this.erd);
//        save();
//        this.qks = null;
    }

    public int getMaxEntriesBetweenSave() {
        return this.orn;
    }

    public void setMaxEntriesBetweenSave(int paramInt) {
        this.orn = paramInt;
    }

    public int getMaxTimeBetweenSave() {
        return this.xgj;
    }

    public void setMaxTimeBetweenSave(int paramInt) {
        this.xgj = paramInt;
    }

//    class itm implements Runnable {
//        private boolean xbq = true;
//
//        private int uqq = 0;
//
//        private long cmy = System.currentTimeMillis();
//
//        private Object fhi = new Object();
//
//        private itm(DefaultAccessManager this$0) {
//        }
//
//        private void shutdown() throws InterruptedException {
//            this.xbq = false;
//            synchronized (this.fhi) {
//                this.fhi.wait(2000L);
//            }
//        }
//
//        private void aua() {
//            boolean bool = false;
//            if (this.uqq >= DefaultAccessManager.itm(this.pqu)) {
//                DefaultAccessManager.omj(this.pqu).trace("Entry count reached save threshold");
//                bool = true;
//            } else if (this.uqq > 0 && System.currentTimeMillis() - this.cmy >= DefaultAccessManager.zxn(this.pqu)) {
//                DefaultAccessManager.omj(this.pqu).trace("Time elapsed since last save exceeded");
//                bool = true;
//            }
//            if (bool)
//                try {
//                    this.pqu.save();
//                    this.uqq = 0;
//                    this.cmy = System.currentTimeMillis();
//                } catch (IOException iOException) {
//                    DefaultAccessManager.omj(this.pqu).error("Failed to save", iOException);
//                }
//        }
//
//        public void run() {
//            while (this.xbq) {
//                omz();
//                aua();
//                if (this.xbq)
//                    try {
//                        Thread.sleep(500L);
//                    } catch (InterruptedException interruptedException) {
//                    }
//            }
//            synchronized (this.fhi) {
//                this.fhi.notifyAll();
//            }
//        }
//
//        private void omz() {
//            while (!DefaultAccessManager.clk(this.pqu).isEmpty()) {
//                DefaultAccessManager.rkn(this.pqu).add(DefaultAccessManager.clk(this.pqu).remove());
//                this.uqq++;
//                DefaultAccessManager.omj(this.pqu).trace("Processed {} entries since last save.", Integer.valueOf(this.uqq));
//            }
//        }
//    }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\product\access\internal\DefaultAccessManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */