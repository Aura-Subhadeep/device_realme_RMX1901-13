package org.aospextended.device;

import java.io.File;
import org.aospextended.device.util.Utils;

public final class PerfControl {
    private static String GOVERNOR_LITTLE_PATH = "/sys/devices/system/cpu/cpu0/cpufreq/scaling_governor";
    private static String GOVERNOR_BIG_PATH = "/sys/devices/system/cpu/cpu6/cpufreq/scaling_governor";
    private static String ADRENOBOOST_PATH = "/sys/class/kgsl/kgsl-3d0/devfreq/adrenoboost";
    private static String IP_LP_IDLE_MS_PATH = "/sys/module/cpu_input_boost/parameters/idle_min_freq_lp";
    private static String IP_MS_PATH = "/sys/module/cpu_input_boost/parameters/input_boost_duration";
    private static String IP_HP_FREQ_PATH = "/sys/module/cpu_input_boost/parameters/input_boost_freq_hp";
    private static String IP_LP_FREQ_PATH = "/sys/module/cpu_input_boost/parameters/input_boost_freq_lp";
    private static String IP_MAX_HP_FREQ_PATH = "/sys/module/cpu_input_boost/parameters/max_boost_freq_hp";
    private static String IP_MAX_LP_FREQ_PATH = "/sys/module/cpu_input_boost/parameters/max_boost_freq_lp";
    private static String IP_RM_LP_FREQ_PATH = "/sys/module/cpu_input_boost/parameters/remove_input_boost_freq_lp";
    private static String IP_RM_HP_FREQ_PATH = "/sys/module/cpu_input_boost/parameters/remove_input_boost_freq_perf";

    private static final String TAG = "PerfControl";

    private PerfControl() {
        // this class is not supposed to be instantiated
    }

    public static void setPerf(int value){
        switch (value) {
            case 0:
                setGovernorLittle("energy_dcfc");
                setGovernorBig("energy_dcfc");
                setAdrenoboost("1");
                setInputIdle("300000");
                setInputMS("0");
                setInpBigFreq("0");
                setInpLitFreq("0");
                setInpBigMaxFreq("0");
                setInpLitMaxFreq("0");
                setInpLitRmFreq("300000");
                setInpBigRmFreq("300000");
                break;
            case 1:
                setGovernorLittle("schedutil");
                setGovernorBig("schedutil");
                setAdrenoboost("2");
                setInputIdle("300000");
                setInputMS("96");
                setInpBigFreq("825000");
                setInpLitFreq("1324000");
                setInpBigMaxFreq("1747000");
                setInpLitMaxFreq("1708000");
                setInpLitRmFreq("576000");
                setInpBigRmFreq("652000");
                break;
            case 2:
                setGovernorLittle("schedutil");
                setGovernorBig("schedutil");
                setAdrenoboost("2");
                setInputIdle("300000");
                setInputMS("250");
                setInpBigFreq("1132000");
                setInpLitFreq("1324000");
                setInpBigMaxFreq("2054000");
                setInpLitMaxFreq("1708000");
                setInpLitRmFreq("748000");
                setInpBigRmFreq("652000");
                break;
        }
       return;
    }

    public static void setGovernorLittle(String value) {
            if (new File(GOVERNOR_LITTLE_PATH).exists()) {
                Utils.writeValue(GOVERNOR_LITTLE_PATH, value);
            }
    }

    public static void setGovernorBig(String value) {
            if (new File(GOVERNOR_BIG_PATH).exists()) {
                Utils.writeValue(GOVERNOR_BIG_PATH, value);
            }
    }

    public static void setAdrenoboost(String value) {
            if (new File(ADRENOBOOST_PATH).exists()) {
                Utils.writeValue(ADRENOBOOST_PATH, value);
            }
    }

    public static void setInputIdle(String value) {
            if (new File(IP_LP_IDLE_MS_PATH).exists()) {
                Utils.writeValue(IP_LP_IDLE_MS_PATH, value);
            }
    }

    public static void setInputMS(String value) {
            if (new File(IP_MS_PATH).exists()) {
                Utils.writeValue(IP_MS_PATH, value);
            }
    }

    public static void setInpBigFreq(String value) {
            if (new File(IP_HP_FREQ_PATH).exists()) {
                Utils.writeValue(IP_HP_FREQ_PATH, value);
            }
    }
    public static void setInpLitFreq(String value) {
            if (new File(IP_LP_FREQ_PATH).exists()) {
                Utils.writeValue(IP_LP_FREQ_PATH, value);
            }
    }

    public static void setInpBigMaxFreq(String value) {
            if (new File(IP_MAX_HP_FREQ_PATH).exists()) {
                Utils.writeValue(IP_MAX_HP_FREQ_PATH, value);
            }
    }

    public static void setInpLitMaxFreq(String value) {
            if (new File(IP_MAX_LP_FREQ_PATH).exists()) {
                Utils.writeValue(IP_MAX_LP_FREQ_PATH, value);
            }
    }

    public static void setInpLitRmFreq(String value) {
            if (new File(IP_RM_LP_FREQ_PATH).exists()) {
                Utils.writeValue(IP_RM_LP_FREQ_PATH, value);
            }
    }

    public static void setInpBigRmFreq(String value) {
            if (new File(IP_RM_HP_FREQ_PATH).exists()) {
                Utils.writeValue(IP_RM_HP_FREQ_PATH, value);
            }
    }
}
