package org.nightlabs.jjqb.childvm.webapp;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>
 * Heart beat controller to automatically shut down the child-VM, if the parent-VM died.
 * </p><p>
 * Eclipse crashes sometimes (and a user might explicitely kill it, too). This leaves the child VMs (our jetty servers) running.
 * This not only consumes resources unnecessarily, but Jetty and other
 * file-based databases keep a lock preventing any other process from accessing the database. Hence, after a certain timeout
 * (1 minute) of missing heart beat, we shut down the child VM.
 * </p>
 *
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class ParentVMHeartBeat
{
	private static final Logger logger = LoggerFactory.getLogger(ParentVMHeartBeat.class);
	private static ParentVMHeartBeat sharedInstance = new ParentVMHeartBeat();

	private volatile Date lastHeartBeat = new Date();

	private volatile long lastHeartBeatAgeAssumedDeadMS = 60L * 1000L;

	private static final long checkLastHeartBeatTimerPeriod = 5000L;

	public static ParentVMHeartBeat sharedInstance() {
		return sharedInstance;
	}

	private ParentVMHeartBeat() {
		checkLastHeartBeatTimer.schedule(createCheckLastHeartBeatTimerTask(), checkLastHeartBeatTimerPeriod, checkLastHeartBeatTimerPeriod);
		logger.info("Starting surveillance of parent VM.");
	}

	private Timer checkLastHeartBeatTimer = new Timer(true);

	private TimerTask createCheckLastHeartBeatTimerTask() {
		return new TimerTask() {
			@Override
			public void run() {
				logger.trace("checkLastHeartBeatTimerTask.run: entered");

				Date lastHeartBeat = getLastHeartBeat();
				long lastHeartBeatAge = System.currentTimeMillis() - lastHeartBeat.getTime();
				if (lastHeartBeat.before(new Date(System.currentTimeMillis() - lastHeartBeatAgeAssumedDeadMS))) {
					logger.warn(
							"checkLastHeartBeatTimerTask.run: Parent VM seems to be dead. Shutting down child VM now! " +
									"now={} lastHeartBeat={} lastHeartBeatAge={} lastHeartBeatAgeAssumedDeadMS={}",
									new Object[] { new Date(), lastHeartBeat, lastHeartBeatAge, lastHeartBeatAgeAssumedDeadMS }
							);

					System.exit(0);
				}
			}
		};
	}

	public void notifyHeartBeat()
	{
		logger.trace("notifyHeartBeat: entered");
		lastHeartBeat = new Date();
	}

	public Date getLastHeartBeat() {
		return lastHeartBeat;
	}

	/**
	 * Get the age in milliseconds, after which the parent VM is assumed dead.
	 * The child VM will terminate itself, if the {@link #notifyHeartBeat()} method was not called for more than
	 * this time.
	 * @return the age in milliseconds within which {@link #notifyHeartBeat()} must be called to indicate "I am alive".
	 */
	public long getLastHeartBeatAgeAssumedDeadMS() {
		return lastHeartBeatAgeAssumedDeadMS;
	}
}
