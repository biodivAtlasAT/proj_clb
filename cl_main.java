public class cl_main {
    public static String unit = "1";
    public static String inf = "0";
    public static String init = "";
    public static String register = "";
    public static String exp = "1111111";
    public static void meth_delReg() {
        register = "";
    }
    public static String meth_revStr(String p_binStr) {
        char[] chArr = p_binStr.toCharArray();
        String binStr = init;
        for (int i = chArr.length - 1; i >= 0; i--) {
            binStr += chArr[i];
        }
        return binStr;
    }
    public static String meth_unaryTobinStr(String p_reg) {
        int it_0, it_1;
        it_0 = it_1 = 0;
        int id_grp = 0;
        String tmp_reg = p_reg;
        String lw_unary;
        String binaryStr = init;
        if(p_reg.length() == 1) {
            lw_unary = unit;
        } else {
            for (it_0 = 0; it_0 <= tmp_reg.length(); it_0++) {
                lw_unary = init;
                id_grp = 0;
                for (it_1 = 0; it_1 < tmp_reg.length(); it_1++) {
                    if (it_1 % 2 == 1) {
                        lw_unary += unit;
                        id_grp++;
                    }
                }
                if (tmp_reg.length() % 2 == 0) {
                    binaryStr += inf;
                }
                if (tmp_reg.length() % 2 == 1) {
                    binaryStr += unit;
                }
                if (lw_unary.length() == 1) {
                    lw_unary = init;
                    binaryStr += unit;
                }
                tmp_reg = lw_unary;
            }
        }
        return meth_revStr(binaryStr);
    }
    public static String meth_pascPow2(String p_exp) {
        int it_0, it_1, it_m;
        it_0 = it_1 = it_m = 0;
        String tmp_reg[] = new String[p_exp.length() + 1];
        tmp_reg[0] = unit;
        for(it_0 = 1, it_1 = p_exp.length(); it_0 <= p_exp.length(); it_0++, it_1--) {
            tmp_reg[it_0] = init;
            for(it_m = 0; it_m < (tmp_reg[it_0 - 1].length() * it_1 / it_0); it_m++) {
                tmp_reg[it_0] += unit;
            }
        }
        for(it_0 = 0; it_0 < tmp_reg.length; it_0++) {
            register += tmp_reg[it_0];
        }
        return register;
    }
    public static void main(String args[]) {
        //System.out.println(meth_unaryTobinStr(meth_pascPow2(exp)));
        System.out.println(meth_unaryTobinStr("11111111111111111"));
        meth_delReg();
    }
}
