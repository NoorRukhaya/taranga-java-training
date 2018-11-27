package Exception_handling;

public class NosuchMethod_ex {
	
		/* Create two private fields. */
		private String key = null;
		private Integer value;
		
		public NosuchMethod_ex(String key, Integer value) {
			this.key = key;
			this.value = value;
		}
		
		public String getKey() {
			return this.key;
		}
		
		public Integer getValue() {
			return this.value;
		}
	}

