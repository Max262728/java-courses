public class calculator {
	private int result;

    public void add(int param1,int param2) {
        this.result = param1 + param2;
    }
    public void minus(int param1,int param2) {
        this.result = param1 - param2;
    }

    public void multiply(int param1,int param2) {
        this.result = param1 * param2;
    }

    public void share(int param1,int param2) {
        this.result = param1 / param2;
    }

    public void stepen(int param1,int param2)
    {
        this.result = (int) Math.pow(param1,param2);
    }

    public int getResult() {
        return this.result;
    }

    public void cleanResult() {
        this.result = 0;
    }
}