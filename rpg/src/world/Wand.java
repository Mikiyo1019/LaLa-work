package world;

public class Wand {
	private String name;//杖の名前
	private double power;//杖の魔力
	
	public Wand (String name) {
		setName(name);
	}
	
	//フィールドのgetter, setter
	public String getName() {
			return name;
	}
	public void setName(String name) {
		if (name.length() < 3) {
			//String msg = ;で代入するのもok
			throw new IllegalArgumentException("名前は3文字以上を入力。処理を中断");
		}
		this.name = name;
	}
	public double getPower() {
		return power;
	}
	public void setPower(double power) {
		if (power < 0.5 && power < 101) {
			throw new IllegalArgumentException("杖による増幅率は0.5以上100以下です。処理を中断");
		}
		this.power = power;
		
		//if (power >= 0.5 && power <= 100.0) {
		//	this.power = power;
		// } else {
		//	 throw new Illegal
		//}
	}
	

}
